public class Employee {

    private String firstName;
    private String lastName;
    private String surName;
    private String position;
    private String email;
    private int phone;
    private int salary;
    private int age;


    public Employee(String firstName, String lastName, String surName, String position, String email, int phone, int salary, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.surName = surName;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }


    public void printInfo() {
        System.out.println("Employee {" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", surName='" + surName + '\'' +
                ", position='" + position + '\'' +
                ", email='" + email + '\'' +
                ", phone=" + phone +
                ", salary=" + salary +
                ", age=" + age +
                '}');
    }
}
