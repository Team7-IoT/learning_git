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
public class EmployeeRepository extends DefaultRepository<Employee, EmployeeDomain> {

    /**
     * 番号を基に従業員を取得する。
     *
     * @param no 従業員番号
     * @return 該当する従業員
     * @throws NullPointerException 該当する従業員が存在しない場合
     */
    public EmployeeDomain getByNo(EmployeeNo no) {
        Employee employee = EmployeeContainer.MAP_EMPLOYEE_AS_NO.get(no);
        if (employee == null) {
            return NullEmployeeDomain.getInstance();
        }

        return createDomain(employee);
    }

    /**
     * 従業員の人数を取得する。
     *
     * @return 従業員の人数
     */
    @SuppressWarnings("unused")
    public long count() {
        long count = 0;
        for (Entry<EmployeeNo, Employee> entry : EmployeeContainer.MAP_EMPLOYEE_AS_NO.entrySet()) {
            count++;
        }
        return count;
    }
}
