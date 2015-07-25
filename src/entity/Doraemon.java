package entity;

import java.time.LocalDate;

import valueobject.EmployeeName;
import valueobject.EmployeeNo;
import valueobject.Gender;

/**
 * 従業員「ドラえもん」を表すエンティティ。
 *
 * @author naotake
 */
public class Doraemon extends Employee {

    public Doraemon() {
        super();

        setNo(EmployeeNo.of(93));
        setName(new EmployeeName("ぼく", "ドラえもん"));
        setGender(Gender.MAN);
        setBirthDay(LocalDate.of(2112, 9, 3));
    }

    @Override
    public String getComment() {
        return "ギャーー！！ねずみーーーー！！";
    }

}
