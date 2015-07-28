package domain;

import entity.Employee;

/**
 * {@link EmployeeDomain}のヌルオブジェクト。
 *
 * @author naotake
 */
public class NullEmployeeDomain extends EmployeeDomain {

    private static final NullEmployeeDomain NULL = new NullEmployeeDomain();

    private NullEmployeeDomain() {
        // NOP
    }

    /**
     * @return 空文字
     */
    public String getNo() {
        return "";
    }

    /**
     * @return NULL を返す
     */
    public Employee getEntity() {
        return null;
    }

    /**
     * シングルトンのオブジェクトを取得する。
     *
     * @return ヌルオブジェクト
     */
    public static NullEmployeeDomain getInstance() {
        return NULL;
    }
}
