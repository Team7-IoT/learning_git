package domain;

import java.util.Map.Entry;

import valueobject.EmployeeNo;
import container.EmployeeContainer;
import entity.Employee;

/**
 * 従業員の集合を扱うリポジトリ。
 *
 * @author naotake
 */
public class EmployeeRepository {

    public EmployeeDomain getByNo(EmployeeNo no) {
        Employee employee = EmployeeContainer.MAP_EMPLOYEE_AS_NO.get(no);
        if (employee == null) {
            return NullEmployeeDomain.getInstance();
        }

        return createDomain(employee);
    }

    @SuppressWarnings("unused")
    public long count() {
        long count = 0;
        for (Entry<EmployeeNo, Employee> entry : EmployeeContainer.MAP_EMPLOYEE_AS_NO.entrySet()) {
            count++;
        }
        return count;
    }

    private EmployeeDomain createDomain(Employee employee) {
        EmployeeDomain domain = new EmployeeDomain();
        domain.setEntity(employee);
        return domain;
    }
}
