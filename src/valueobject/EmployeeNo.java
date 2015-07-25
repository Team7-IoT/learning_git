package valueobject;

/**
 * 従業員番号を表すバリューオブジェクト。
 *
 * @author naotake
 */
public class EmployeeNo {

    private String no;

    private EmployeeNo(String no) {
        this.no = no;
    }

    public static EmployeeNo of(int no) {
        return of(String.format("%03d", no));
    }

    public static EmployeeNo of(String no) {
        return new EmployeeNo(no);
    }

    /**
     * 従業員番号を返す。<br />
     * 3桁（ゼロ埋め）の文字列として返す。
     *
     * @return 従業員番号
     */
    public String get() {
        return no;
    }

    /**
     * 従業員番号の数値表現を返す。
     *
     * @return 従業員番号
     */
    public Integer getAsInt() {
        return Integer.valueOf(no);
    }

    @Override
    public int hashCode() {
        return no.hashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (!EmployeeNo.class.isInstance(other)) {
            return false;
        }

        return no.equals(EmployeeNo.class.cast(other).get());
    }

    @Override
    public String toString() {
        return no;
    }
}
