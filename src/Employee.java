public class Employee {
    private String fullName;
    private int department;
    private double salary;
    private final long id;
    private static long idCount = 0;

    public Employee() {
        this.id = idCount++;
    }

    public Employee(String fullName, int department, double salary) {
        this.fullName = fullName;
        this.department = department;
        this.salary = salary;
        this.id = idCount++;
    }

    public long getId() {
        return id;
    }

    public String getFullName() {
        return fullName;
    }

    public int getDepartment() {
        return department;
    }

    public double getSalary() {
        return salary;
    }

    public void setDepartment(int department) {
        this.department = department;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return String.format("Id = %s fullName = %s department = %s salary = %s", id, fullName, department, salary);
    }
}
