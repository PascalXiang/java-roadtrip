package ch03operators;

/**
 * 第三章 - 运算符
 * 黑马程序员Java入门到起飞
 */
public class ArithmeticDemo {
    public static void main(String[] args) {
        System.out.println("=== 算术运算符 ===");

        int a = 10, b = 3;

        System.out.println("a + b = " + (a + b));   // 13
        System.out.println("a - b = " + (a - b));   // 7
        System.out.println("a * b = " + (a * b));   // 30
        System.out.println("a / b = " + (a / b));   // 3（整数除法，截断小数）
        System.out.println("a % b = " + (a % b));   // 1（取余）

        // 浮点数除法
        System.out.println("10.0 / 3 = " + (10.0 / 3));  // 3.3333...

        // 字符串拼接 vs 加法
        System.out.println("5 + 5 = " + 5 + 5);  // "5 + 5 = 55"（字符串拼接）
        System.out.println("5 + 5 = " + (5 + 5)); // "5 + 5 = 10"

        // 自增自减
        int x = 10;
        System.out.println("x++ = " + x++);  // 先用后加，输出10
        System.out.println("x = " + x);      // 11
        System.out.println("++x = " + ++x);  // 先加后用，输出12
    }
}
