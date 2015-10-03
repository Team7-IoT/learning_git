package container;

import java.util.HashMap;
import java.util.Map;

import valueobject.EmployeeNo;
import entity.Doraemon;
import entity.Dorami;
import entity.Employee;
import entity.Jaian;
import entity.Nobita;
import entity.Shizuka;
import entity.Suneo;

public class EmployeeContainer {

    private static Employee nobita = new Nobita();
    private static Employee jaian = new Jaian();
    private static Employee suneo = new Suneo();
    private static Employee shizuka = new Shizuka();
    private static Employee doraemon = new Doraemon();
    private static Employee dorami = new Dorami();

    public static Map<EmployeeNo, Employee> MAP_EMPLOYEE_AS_NO = new HashMap<>(6);
    static {
        MAP_EMPLOYEE_AS_NO.put(nobita.getNo(), nobita);
        MAP_EMPLOYEE_AS_NO.put(jaian.getNo(), jaian);
        MAP_EMPLOYEE_AS_NO.put(suneo.getNo(), suneo);
        MAP_EMPLOYEE_AS_NO.put(shizuka.getNo(), shizuka);
        MAP_EMPLOYEE_AS_NO.put(doraemon.getNo(), doraemon);
        MAP_EMPLOYEE_AS_NO.put(dorami.getNo(), dorami);
    }
}
