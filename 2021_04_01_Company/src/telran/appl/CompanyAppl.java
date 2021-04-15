package telran.appl;

import telran.dto.Employee;
import telran.dto.Manager;
import telran.dto.SalesMan;
import telran.dto.WageEmployee;
import telran.model.Company;

public class CompanyAppl {
    public static void main(String[] args) {

        Employee manager1 = new Manager("Oleg", 12345678, 37, "Apple", 8000, 3);
        Employee manager2 = new Manager("leg", 12345678, 47, "Apple", 9000, 4);
        Employee manager3 = new Manager("Deg", 87345678, 35, "Apple", 8000, 2);
        Employee salesMan1 = new SalesMan("Miki", 13245690, 30, "Apple", 3.000, 103400, 20);
        Employee salesMan2 = new SalesMan("Tiki", 13244690, 29, "Apple", 3.000, 107800, 15);
        Employee salesMan3 = new SalesMan("Viki", 13245290, 32, "Apple", 3.000, 106900, 20);
        Employee wageEmployee1 = new WageEmployee("Rik", 345237896, 25, "Apple", 2.000, 45, 12);
        Employee wageEmployee2 = new WageEmployee("Tik", 348897896, 24, "Apple", 2.000, 134, 12);
        Employee wageEmployee3 = new WageEmployee("Pik", 348917896, 23, "Apple", 2.000, 140, 12);

        Employee[] emps = new Employee[]{manager1, manager2, manager3, salesMan1, salesMan2, salesMan3, wageEmployee1, wageEmployee2, wageEmployee3};

        Company company = new Company("Roga_i_kopyta", "Kazakhstan, Almaty, Nazarbaev st, 1");
        for (Employee emp : emps) {
            company.hireEmployee(emp);
        }
        System.out.println(company);

        System.out.println(company.getCompanyExpenses() + "  getCompanyExpenses");
        System.out.println(company.fireEmployee(348917896) + "  fireEmployee");
        System.out.println(company.numberOfEmployee() + "  numberOfEmployee");
        System.out.println(company.setEmployeeSalary(345237896, 1250) + "  setEmployeeSalary");

        System.out.println(company.getEmployeeWithSalary(1000, 3000));

        printEmployee(emps);
    }

    public static void printEmployee (Employee [] emps){
        for (int i = 0; i < emps.length; i++) {
            System.out.println(emps[i]);
            System.out.println("Salary = " + emps[i].calcSalary());
        }
        for (Employee e: emps) {
            System.out.println(e);
            System.out.println("Salary = " + e.calcSalary());
        }
    }


}
