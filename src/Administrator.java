public class Administrator extends Employee {

    private String name; // имя
    private int age; //возраст
    private double salary; // зарплата
    private int yearsOfExperience; // опыт работы

    public Administrator(String name, int age, double salary, int yearsOfExperience) {
        super(name, age);
        this.salary = salary;
        this.yearsOfExperience = yearsOfExperience;
    }

    public Administrator() {
        this("Мария", 29, 25000, 5);
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
        return "Администратор: " + "Мария" + ", возраст:" + 29 + ", Зарплата: " + getSalary() + ", Опыт работы: " + getYearsOfExperience() + " лет";
    }

    @Override
    public void displayInfo() {
        System.out.println("Администратор: " + "Мария" + ", возраст:" + 29 + ", Зарплата: " + getSalary() + ", Опыт работы: " + getYearsOfExperience() + " лет");
    }

}