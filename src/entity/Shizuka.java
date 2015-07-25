package entity;

import java.time.LocalDate;

import valueobject.EmployeeName;
import valueobject.EmployeeNo;
import valueobject.Gender;

/**
 * 従業員「しずかちゃん」を表すエンティティ。
 *
 * @author naotake
 */
public class Shizuka extends Employee {

    public Shizuka() {
        super();

        setNo(EmployeeNo.of(5));
        setName(new EmployeeName("源", "静香"));
        setGender(Gender.WOMAN);
        setBirthDay(LocalDate.of(1964, 5, 30));
    }

    @Override
    public String getComment() {
        return "キャーーーーー！";
    }
}
