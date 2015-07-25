package main;

import valueobject.EmployeeNo;
import domain.EmployeeDomain;
import domain.EmployeeRepository;

public class Main {

    public static void main(String... args) {

        System.out.println("従業員の情報を表示します。");

        // 従業員リポジトリ
        EmployeeRepository repository = new EmployeeRepository();

        long employeeCounts = repository.count();
        System.out.println("従業員数は " + employeeCounts);

        // ドラえもん
        EmployeeDomain nobita = repository.getByNo(EmployeeNo.of(93));
        System.out.println(nobita.getEntity());
        nobita.sayGreeting();

        // のび太
        nobita = repository.getByNo(EmployeeNo.of(87));
        System.out.println(nobita.getEntity());
        nobita.sayGreeting();
    }
}
