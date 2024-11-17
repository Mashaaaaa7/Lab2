public abstract class Employee { // используется напрямую к дочерним классам

    private String name; //хранит имя
    private int age;//хранит возраст

    public Employee (String name, int age) { //инициализирует объект Employee с именем и возрастом
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    } //возвращает имя сотрудника

    public void setName(String name) {
        this.name=name; // Устанавливаем новое значение для имени
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public abstract void displayInfo(); // Абстрактный метод, который должен быть реализован в подклассах

    public String toString() {
        return "Имя: " + name + ", Возраст: " + age;
    }

}

