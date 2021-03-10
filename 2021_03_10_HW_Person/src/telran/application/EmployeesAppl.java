package telran.application;

import telran.data.Employee;
import telran.data.Manager;
import telran.data.SalesMan;
import telran.data.WageEmployee;

public class EmployeesAppl {
    public static void main(String[] args) {
        Employee manager1 = new Manager("Oleg", 12345678, 37, "Apple", 8.000, 3);
        Employee manager2 = new Manager("leg", 12345678, 47, "Apple", 9.000, 4);
        Employee salesMan1 = new SalesMan("Miki", 13245690, 30, "Apple", 3.000, 30, 20);
        Employee salesMan2 = new SalesMan("Tiki", 13245690, 29, "Apple", 3.000, 20, 15);
        Employee wageEmployee1 = new WageEmployee("Rik", 345347896, 25, "Apple", 2.000, 10, 12);
        Employee wageEmployee2 = new WageEmployee("Tik", 348947896, 24, "Apple", 2.000, 14, 12);

        Employee[] emps = new Employee[]{manager1, manager2, salesMan1, salesMan2, wageEmployee1, wageEmployee2};
        printAllEmployees(emps);
    }

    private static void printAllEmployees(Employee[] emps) {
        for (Employee b : emps) {
            System.out.println(b);
        }
    }

}
