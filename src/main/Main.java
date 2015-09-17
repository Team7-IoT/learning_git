package main;

import domain.EmployeeDomain;
import domain.EmployeeRepository;
import valueobject.EmployeeNo;

public class Main {

    public static void main(String... args) {

        System.out.println("従業員の情報を表示します。");

        // 従業員リポジトリ
        EmployeeRepository repository = new EmployeeRepository();

        long employeeCounts = repository.count();
        System.out.println("従業員数は " + employeeCounts);

        // ドラえもん
        EmployeeDomain doraemon = repository.getByNo(EmployeeNo.of(93));
        System.out.println(doraemon.getEntity());
        doraemon.sayGreeting();

        // のび太
        EmployeeDomain nobita = repository.getByNo(EmployeeNo.of(87));
        System.out.println(nobita.getEntity());
        nobita.sayGreeting();

        // しずかちゃん
    	// TODO
    	// Hint: EmployeeNo.of(5)

        // ジャイアン
    	// TODO
    	// Hint: EmployeeNo.of(615)

        // スネ夫
        EmployeeDomain suneo = repository.getByNo(EmployeeNo.of(2));
        System.out.println(suneo.getEntity());
        suneo.sayGreeting();
    }
}
