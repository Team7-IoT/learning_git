package domain;

import valueobject.EmployeeNo;
import entity.Employee;

/**
 * 一人の従業員を表すドメイン。
 *
 * @author naotake
 */
public class EmployeeDomain {

    private Employee entity;

    /**
     * 社員番号を取得する。
     *
     * @see EmployeeNo#toString()
     * @return 社員番号
     */
    public String getNo() {
        return entity.getNo().toString();
    }

    /**
     * 挨拶をします。
     */
    public void sayGreeting() {
        System.out.println(String.format("「%s」", entity.getComment()));
    }

    public Employee getEntity() {
        return entity;
    }

    void setEntity(Employee entity) {
        this.entity = entity;
    }
}
