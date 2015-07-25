package valueobject;

/**
 * 従業員の氏名を表すバリューオブジェクト。
 *
 * @author naotake
 */
public class EmployeeName {

    private String firstName;

    private String lastName;

    public EmployeeName(String lastName, String firstName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    /**
     * 氏名の文字列表現を返す。<br />
     * e.g. 「新宿 太郎」
     */
    public String toString() {
        return String.format("%s %s", lastName, firstName);
    }
}
