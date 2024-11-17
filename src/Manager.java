public class Manager extends Employee {

    private String name; // имя
    private int age; //возраст
    private double salary; // зарплата
    private int yearsOfExperience; // опыт работы

    public Manager(String name, int age, double salary, int yearsOfExperience) {
        super(name, age);
        this.salary = salary;
        this.yearsOfExperience = yearsOfExperience;
    }

    public Manager() {
        this("Илья", 30, 25000, 6); // Передайте значения в конструктор с параметрами
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getYearsOfExperience() {
        return yearsOfExperience;
    }

    public void setYearsOfExperience(int yearsOfExperience) {
        this.yearsOfExperience = yearsOfExperience;
    }

    @Override
    public String toString() {
        return "Менеджер: " + "Илья" + ", возраст:" + 30 + ", Зарплата: " + getSalary() + ", Опыт работы: " + getYearsOfExperience() + " лет";
    }

    @Override
    public void displayInfo() {
        System.out.println("Менеджер: " + "Илья" + ", возраст:" + 30 + ", Зарплата: " + getSalary() + ", Опыт работы: " + getYearsOfExperience() + " лет");
    }

}