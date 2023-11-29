package design.patterns.creational.prototype;

import java.util.*;

public class TestPrototype {
    public static void main(String[] args) {
        Employees emps = new Employees();
        emps.loadData();

       Employees employeesCloned = (Employees) emps.clone();

        System.out.println("emps List: "+emps.getEmpList());
    }

}
