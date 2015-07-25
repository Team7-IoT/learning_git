package entity;

import java.time.LocalDate;

import valueobject.EmployeeName;
import valueobject.EmployeeNo;
import valueobject.Gender;

/**
 * 従業員「ジャイアン」を表すエンティティ。
 *
 * @author naotake
 */
public class Jaian extends Employee {

    public Jaian() {
        super();

        setNo(EmployeeNo.of(615));
        setName(new EmployeeName("剛田", "武"));
        setGender(Gender.MAN);
        setBirthDay(LocalDate.of(1964, 6, 15));
    }

    @Override
    public String getComment() {
        return "かぁちゃーーーーーん";
    }
}
