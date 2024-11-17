public class Main {
    public static void main(String[] args) {
        Programmist programmist1 = new Programmist ("Максим", 30,25000,"Java");
        Administrator administrator1 = new Administrator("Мария", 29, 25000, 5);
        Manager manager1 = new Manager("Илья", 30, 25000,6);

        programmist1.displayInfo();
        administrator1.displayInfo();
        manager1.displayInfo();
    }
}