package telran.interfaces;

import telran.dto.Employee;

import java.util.List;

public interface ICompany {
    boolean hireEmployee(Employee emp); // add to the job

    Employee fireEmployee(long id);  // delete from the job

    boolean setEmployeeSalary(long id, double salary);  // change salary

    double getCompanyProfit();    // many

    double getCompanyExpenses();   // potracheno

    int numberOfEmployee(); // hw mach worker

    Employee findById(long id);   // search worker

    List<Employee> getEmployeeWithSalary(double start, double finish);  // diapason with salary

    List<Employee> getFiredEmployee();    // list delete worker
}
