package valueobject;

/**
 * 性別を表すバリューオブジェクト。
 *
 * @author naotake
 */
public enum Gender {

    /** 男性 */
    MAN("男性"),

    /** 女性 */
    WOMAN("女性");

    private final String label;

    private Gender(final String label) {
        this.label = label;
    }

    public String toString() {
        return label;
    }
}
