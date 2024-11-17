public class Programmist extends Employee {

    private String name;
    private int age;
    private double salary;
    private String programmingLanguage;

    public Programmist(String name, int age, double salary, String programmingLanguage) { //инициализирует объект
        super(name, age); //обращение к родительскому классу
        this.salary = salary;
        this.programmingLanguage = programmingLanguage;
    }

    public Programmist(String name, int age, double salary) {
        super(name, age);
        this.salary = salary;
        this.programmingLanguage = null;
    }

    public Programmist() {
        this("Максим", 30, 25000, null); //значения по умолчанию
    }

    // Геттеры и сеттеры •	Эти методы обеспечивают контролируемый доступ к значениям полей.
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

    public String getProgrammingLanguage() {
        return programmingLanguage;
    }

    public void setProgrammingLanguage(String programmingLanguage) {
        this.programmingLanguage = programmingLanguage;
    }

    @Override //указывает, что этот метод переопределяет метод toString() из базового класса.
    public String toString() {
        return "Программист: " + "Максим" + ", возраст:" + 30 + ", заработанная плата: " + salary + ", язык программирования: " + programmingLanguage;
    }

    @Override
    public void displayInfo() {
        System.out.println("Программист:" + "Максим" + ", возраст:" + 30 + ", Зарплата: " + salary + ", язык программирования: " + programmingLanguage);
    }

}