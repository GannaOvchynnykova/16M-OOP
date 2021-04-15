package telran.application;

import telran.data.Employee;
import telran.data.Manager;
import telran.data.SalesMan;
import telran.data.WageEmployee;

public class EmployeesAppl {
    public static void main(String[] args) {
        Employee manager1 = new Manager("Oleg", 12345678, 37, "Apple", 8.000, 3);
        Employee manager2 = new Manager("leg", 12345678, 47, "Apple", 9.000, 4);
        Employee manager3 = new Manager("Deg", 87345678, 35, "Apple", 8.500, 2);
        Employee salesMan1 = new SalesMan("Miki", 13245690, 30, "Apple", 3.000, 103400, 20);
        Employee salesMan2 = new SalesMan("Tiki", 13244690, 29, "Apple", 3.000, 107800, 15);
        Employee salesMan3 = new SalesMan("Viki", 13245290, 32, "Apple", 3.000, 106900, 20);
        Employee wageEmployee1 = new WageEmployee("Rik", 345237896, 25, "Apple", 2.000, 45, 12);
        Employee wageEmployee2 = new WageEmployee("Tik", 348897896, 24, "Apple", 2.000, 134, 12);
        Employee wageEmployee3 = new WageEmployee("Pik", 348917896, 23, "Apple", 2.000, 140, 12);

        Employee[] emps = new Employee[]{manager1, manager2, manager3, salesMan1, salesMan2, salesMan3, wageEmployee1, wageEmployee2, wageEmployee3};
        //printAllEmployees(emps);

        double result = getSumSalaryAllEmployee(emps);
        System.out.println("Sum Salary All Employee = " + result + " euro");

        double salary = 1000;
        printEmpsWithSalaryMoreThan(emps, salary);

        double resultRevenue = getСompanyRevenue(emps);
        System.out.println(resultRevenue + " = sum of sales of all sales managers");

    }

    private static double getСompanyRevenue(Employee[] emps) {
        double result = 0;
        for (Employee i : emps) {
            if (i instanceof SalesMan) {
                result += ((SalesMan) i).getTotalSales();
            }
        }
        return result;
    }

    private static void printEmpsWithSalaryMoreThan(Employee[] emps, double salary) {
        for (Employee i : emps) {
            if (i.calcPrice() >= salary) {
                System.out.println(i);
                System.out.println(i.calcPrice() + " salary");
            }
        }
    }

    private static double getSumSalaryAllEmployee(Employee[] emps) {
        double result = 0;
        for (Employee b : emps) {
            result += b.calcPrice();
        }
        return result;
    }

    private static void printAllEmployees(Employee[] emps) {
        for (Employee b : emps) {
            System.out.print(b);
            System.out.println(" Salary = " + b.calcPrice() + " euro");
        }
    }
}
