package entity;

import java.time.LocalDate;

import valueobject.EmployeeName;
import valueobject.EmployeeNo;
import valueobject.Gender;

/**
 * 従業員「ドラミちゃん」を表すエンティティ。
 *
 * @author naotake
 */
public class Dorami extends Employee {

    public Dorami() {
        super();

        setNo(EmployeeNo.of(122));
        setName(new EmployeeName("わたしは", "ドラミ"));
        setGender(Gender.WOMAN);
        setBirthDay(LocalDate.of(2114, 12, 2));
    }

    @Override
    public String getComment() {
        return "しんせつをわすれちゃだめ！";
    }
}
