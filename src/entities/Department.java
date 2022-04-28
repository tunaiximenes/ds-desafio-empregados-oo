package entities;

import java.util.ArrayList;
import java.util.List;

public class Department {

    private String name;
    private int payDay;

    private Employee employees;
    private Address address;

    List<Employee> emp = new ArrayList<Employee>();


    public Department() {
    }

    public Department(String name, int payDay, Address address) {
        this.name = name;
        this.payDay = payDay;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPayDay() {
        return payDay;
    }

    public void setPayDay(int payDay) {
        this.payDay = payDay;
    }

    public Employee getEmployees() {
        return employees;
    }

    public void setEmployees(Employee employees) {
        this.employees = employees;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public void addEmployee(Employee employee) {
        emp.add(employee);
    }

    public void removeEmployee(Employee employee){
        emp.remove(employee);
    }

    public double payRoll(){
        double sum = 0.0;
        for (Employee ep : emp) {
            sum += ep.getSalary();
        }
        return sum;
    }

    @Override
    public String toString() {
        StringBuilder showReport = new StringBuilder();
        showReport.append("FOLHA DE PAGAMENTO:").append("\n");
        showReport.append("Departamento ");
        showReport.append(name);
        showReport.append(" = R$ ");
        showReport.append(String.format("%.2f", payRoll())).append("\n");
        showReport.append("Pagamento realizado no dia ");
        showReport.append(getPayDay()).append("\n");
        showReport.append("Funcionários: \n");
        for (Employee emps : emp) {
            showReport.append(emps).append("\n");
        }
        showReport.append("Para dúvidas favor entrar em contato: ");
        showReport.append(address.getEmail());
        return showReport.toString();

    }
}
