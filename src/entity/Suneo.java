package entity;

import java.time.LocalDate;

import valueobject.EmployeeName;
import valueobject.EmployeeNo;
import valueobject.Gender;

/**
 * 従業員「スネオ」を表すエンティティ。
 *
 * @author naotake
 */
public class Suneo extends Employee {

    public Suneo() {
        super();

        setNo(EmployeeNo.of(2));
        setName(new EmployeeName("骨川", "スネ夫"));
        setGender(Gender.MAN);
        setBirthDay(LocalDate.of(1965, 2, 14));
    }

    @Override
    public String getComment() {
        return "ママーーーーーーー！";
    }
}
