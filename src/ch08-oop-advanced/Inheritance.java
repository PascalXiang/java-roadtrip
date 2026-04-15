package ch08oopadvanced;

/**
 * 第八章 - 继承
 * 黑马程序员Java入门到起飞
 */

// 父类：动物
class Animal {
    String name;
    int age;

    public void eat() {
        System.out.println(name + "在吃东西");
    }

    public void sleep() {
        System.out.println(name + "在睡觉");
    }
}

// 子类：狗，继承动物
class Dog extends Animal {
    String breed;  // 品种

    public void bark() {
        System.out.println(name + "汪汪叫！");
    }

    // 方法重写（Override）
    @Override
    public void eat() {
        System.out.println(name + "在啃骨头");
    }
}

// 子类：猫
class Cat extends Animal {
    public void catchMouse() {
        System.out.println(name + "在抓老鼠！");
    }
}

public class Inheritance {
    public static void main(String[] args) {
        System.out.println("=== 继承 ===");

        Dog dog = new Dog();
        dog.name = "旺财";
        dog.age = 3;
        dog.breed = "金毛";
        dog.eat();       // 调用重写后的方法
        dog.sleep();     // 继承自父类
        dog.bark();      // 子类特有方法

        System.out.println();

        Cat cat = new Cat();
        cat.name = "咪咪";
        cat.age = 2;
        cat.eat();       // 继承自父类
        cat.sleep();
        cat.catchMouse();

        // instanceof 运算符
        System.out.println("\ndog instanceof Animal: " + (dog instanceof Animal));  // true
        System.out.println("cat instanceof Dog: " + (cat instanceof Dog));          // false
    }
}
