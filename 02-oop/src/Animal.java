public class Animal {
    private String name;
    private int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void speak() {
        System.out.println(name + " says hello!");
    }

    public String getName() { return name; }
    public int getAge() { return age; }

    public static void main(String[] args) {
        Animal cat = new Animal("Kitty", 3);
        cat.speak();
    }
}