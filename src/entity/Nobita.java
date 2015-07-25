package entity;

import java.time.LocalDate;

import valueobject.EmployeeName;
import valueobject.EmployeeNo;
import valueobject.Gender;

/**
 * 従業員「のび太」を表すエンティティ。
 *
 * @author naotake
 */
public class Nobita extends Employee {

    public Nobita() {
        super();

        setNo(EmployeeNo.of(87));
        setName(new EmployeeName("野比", "のび太"));
        setGender(Gender.MAN);
        setBirthDay(LocalDate.of(1964, 8, 7));
    }

    @Override
    public String getComment() {
        return "ドラえも～～～～～～～ん";
    }

}
