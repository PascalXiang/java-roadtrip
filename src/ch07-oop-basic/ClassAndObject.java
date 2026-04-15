package ch07oopbasic;

/**
 * 第七章 - 类和对象
 * 黑马程序员Java入门到起飞
 */
public class ClassAndObject {

    // 定义一个学生类
    static class Student {
        // 属性（成员变量）
        String name;
        int age;
        String major;

        // 构造方法
        public Student() {
            System.out.println("无参构造方法被调用");
        }

        public Student(String name, int age, String major) {
            this.name = name;
            this.age = age;
            this.major = major;
            System.out.println("有参构造方法被调用");
        }

        // 方法（行为）
        public void study() {
            System.out.println(name + "正在学习" + major);
        }

        public void introduce() {
            System.out.println("大家好，我叫" + name + "，今年" + age + "岁，专业是" + major);
        }
    }

    public static void main(String[] args) {
        System.out.println("=== 类和对象 ===");

        // 创建对象
        Student stu1 = new Student();  // 无参构造
        stu1.name = "张三";
        stu1.age = 20;
        stu1.major = "计算机科学";
        stu1.introduce();
        stu1.study();

        System.out.println();

        Student stu2 = new Student("李四", 22, "软件工程");  // 有参构造
        stu2.introduce();
        stu2.study();
    }
}
