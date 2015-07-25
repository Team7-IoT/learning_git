package domain;

import entity.Employee;

public class NullEmployeeDomain extends EmployeeDomain {

    private static final NullEmployeeDomain NULL = new NullEmployeeDomain();

    private NullEmployeeDomain() {
        // NOP
    }

    public String getNo() {
        return "";
    }

    public Employee getEntity() {
        return null;
    }

    public static NullEmployeeDomain getInstance() {
        return NULL;
    }
}
