import java.util.Objects;

public class Employee {
    private String lastFirstMiddleName;
    private int department;
    private int salary;
    private int id;
    private static int count = 0;

    public Employee(String lastFirstMiddleName, int department, int salary) {
        this.lastFirstMiddleName = lastFirstMiddleName;
        this.department = department;
        this.salary = salary;
        this.id = count++;
    }

    String getLastFirstMiddleName() { // Геттер
        return this.lastFirstMiddleName;
    }

    public int getDepartment() {
        return department;
    }

    public void setDepartment(int department) {
        this.department = department;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return department == employee.department && salary == employee.salary && Objects.equals(lastFirstMiddleName, employee.lastFirstMiddleName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(lastFirstMiddleName, department, salary, id);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id= " + id +
                " lastFirstMiddleName= '" + lastFirstMiddleName + '\'' +
                ", department= " + department +
                ", salary= " + salary +
                '}';
    }
}
