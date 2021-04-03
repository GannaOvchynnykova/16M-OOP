package telran.model;

import telran.dto.Employee;
import telran.interfaces.ICompany;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

public class Company implements ICompany {
    private String name;
    private String address;
    private TreeSet<Employee> employeeTreeSet = new TreeSet<Employee>();
    private TreeSet<Employee> employeeFiredTreeSet = new TreeSet<>();

    public Company(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        int count = 1;
        String str = "Company name : " + name + "\nCompany address: " + address + "\n";
        for (Employee e : employeeTreeSet) {
            str += "=======================" + count + "=====================\n";
            str += "Company: " + e.getCompany() + "\n";
            str += "Employee: " + e.getId() + "\n";
            str += "Name: " + e.getName() + "\n";
            str += "Salary: " + e.calcPrice() + "\n";
            count++;
        }
        return str;
    }

    @Override
    public boolean hireEmployee(Employee emp) {
        if (emp == null || employeeFiredTreeSet.contains(emp))
            return false;
        return employeeTreeSet.add(emp);
    }

    @Override
    public Employee fireEmployee(long id) {
        Employee temp = findById(id);
        if (temp != null) {
            employeeTreeSet.remove(temp);
            employeeFiredTreeSet.add(temp);
        }
        return temp;
    }

    @Override
    public boolean setEmployeeSalary(long id, double salary) {
        for (Employee e : employeeTreeSet) {
            if (e.getId() == id)
                e.setBaseSalary(salary);
            return true;
        }
        return false;
    }

    @Override
    public double getCompanyProfit() {
        double temp = 0.0;
        for (Employee e : employeeTreeSet) {
        }
        return temp;
    }

    @Override
    public double getCompanyExpenses() {
        double temp = 0.0;
        for (Employee e : employeeTreeSet) {
            temp += e.calcPrice();
        }
        return temp;
    }

    @Override
    public int numberOfEmployee() {
        int count = 0;
        for (Employee e : employeeTreeSet) {
            count++;
        }
        return count;
    }

    @Override
    public Employee findById(long id) {
        for (Employee e : employeeTreeSet) {
            if (e.getId() == id)
                return e;
        }
        return null;
    }

    @Override
    public List<Employee> getEmployeeWithSalary(double start, double finish) {
        List<Employee> result = new ArrayList<Employee>();
        for (Employee e : employeeTreeSet) {
            if (e.calcPrice() > start && e.calcPrice() < finish)
                result.add(e);
        }
        return result;
    }

    @Override
    public List<Employee> getFiredEmployee() {
        List<Employee> result = new ArrayList<Employee>();
        for (Employee e : employeeFiredTreeSet) {
            result.add(e);
        }
        return result;
    }
}
