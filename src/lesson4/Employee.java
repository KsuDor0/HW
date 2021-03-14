package lesson4;

public class Employee {
    private String name;
    private String position;
    private String  phone;
    private int salary;
    private int age;

    public Employee(String name, String position, String phone, int salary, int age) {
        this.name = name;
        this.position = position;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }

    public String getName() {
        return name;
    }
    public String getPosition() {
        return position;
    }
    public String getPhone() {
        return phone;
    }

    public int getSalary() {
        return salary;
    }
    public int getAge() {
        return age;
    }

}
