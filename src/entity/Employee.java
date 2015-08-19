package entity;

import java.time.LocalDate;

import valueobject.EmployeeName;
import valueobject.EmployeeNo;
import valueobject.Gender;

/**
 * 従業員を表すエンティティ。
 *
 * @author naotake
 */
public abstract class Employee implements Entity {

    /** 従業員番号 */
    private EmployeeNo no;

    /** 氏名 */
    private EmployeeName name;

    /** 生年月日 */
    private LocalDate birthDay;

    /** 性別 */
    private Gender gender;

    public EmployeeNo getNo() {
        return no;
    }

    public void setNo(EmployeeNo no) {
        this.no = no;
    }

    public EmployeeName getName() {
        return name;
    }

    public void setName(EmployeeName name) {
        this.name = name;
    }

    public LocalDate getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(LocalDate birthDay) {
        this.birthDay = birthDay;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public abstract String getComment();

    /**
     * 従業員の文字列情報を返す。
     *
     * <pre>
     * [書式]
     * 従業員番号(3桁): 氏名(生年月日)
     *
     * [例]
     * 013: 新宿 太郎<男性>(1987-07-18)
     * </pre>
     */
    public String toString() {
        return String.format("Employee[%s: %s<%s>(%s)]", no, name, gender, birthDay);
    }
}
