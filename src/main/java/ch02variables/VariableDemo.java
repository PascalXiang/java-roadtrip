package ch02variables;

/**
 * 第二章 - 变量与数据类型
 * 黑马程序员Java入门到起飞
 */
public class VariableDemo {
    public static void main(String[] args) {
        System.out.println("=== 变量与数据类型 ===");

        // 整数类型
        byte b = 127;               // 1字节, -128~127
        short s = 32767;            // 2字节
        int age = 25;               // 4字节（最常用）
        long phoneNumber = 13800138000L;  // 8字节，加L后缀

        System.out.println("byte: " + b);
        System.out.println("short: " + s);
        System.out.println("int: " + age);
        System.out.println("long: " + phoneNumber);

        // 浮点类型
        float price = 9.99f;        // 4字节，加f后缀
        double pi = 3.141592653589793;  // 8字节（默认）

        System.out.println("float: " + price);
        System.out.println("double: " + pi);

        // 字符类型
        char grade = 'A';           // 2字节，单个字符
        char chinese = '中';        // 可以存中文

        System.out.println("char: " + grade);
        System.out.println("char(中文): " + chinese);

        // 布尔类型
        boolean isJavaFun = true;
        boolean isFishFly = false;

        System.out.println("boolean: " + isJavaFun);
        System.out.println("boolean: " + isFishFly);

        // 字符串（引用类型，不是基本类型）
        String name = "Pascal";
        String course = "黑马Java入门到起飞";

        System.out.println("String: " + name);
        System.out.println("String: " + course);

        // 变量命名规范：小驼峰 firstName
        // 类名命名规范：大驼峰 HelloWorld
    }
}
