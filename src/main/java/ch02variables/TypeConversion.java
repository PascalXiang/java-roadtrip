package ch02variables;

/**
 * 变量与数据类型 - TypeConversion
 * @author Pascal
 * @since 2026-04-15
 */
public class TypeConversion {
    public static void main(String[] args) {
        System.out.println("=== 类型转换 ===");

        // 自动类型转换（小 -> 大）
        // byte -> short -> int -> long -> float -> double
        //              char ->
        int a = 100;
        long b = a;       // int 自动转 long
        double c = b;     // long 自动转 double

        System.out.println("自动转换: int " + a + " -> long " + b + " -> double " + c);

        // 强制类型转换（大 -> 小），可能丢失精度
        double d = 3.99;
        int e = (int) d;  // 截断小数部分，不是四舍五入！

        System.out.println("强制转换: double " + d + " -> int " + e);

        // byte 运算溢出演示
        byte b1 = 100;
        byte b2 = 100;
        // byte b3 = b1 + b2;  // 编译错误！byte运算会自动提升为int
        int b3 = b1 + b2;     // 正确

        System.out.println("byte运算提升为int: " + b1 + " + " + b2 + " = " + b3);

        // 表达式中的类型提升
        // 整个表达式的结果类型 = 表达式中最大的类型
        double result = 10 + 3.14 + 'A';  // int + double + char -> double
        // 'A' 的 ASCII 值是 65
        System.out.println("10 + 3.14 + 'A' = " + result);  // 78.14
    }
}
