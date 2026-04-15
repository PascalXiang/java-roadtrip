package ch04flowcontrol;

/**
 * 流程控制 - ForDemo
 * @author Pascal
 * @since 2026-04-15
 */
public class ForDemo {
    public static void main(String[] args) {
        System.out.println("=== for 循环 ===");

        // 基本for循环
        System.out.println("1到10求和:");
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            sum += i;
            System.out.print(i + " ");
        }
        System.out.println("\n总和: " + sum);

        // 打印乘法表
        System.out.println("\n九九乘法表:");
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + "×" + i + "=" + (i * j) + "\t");
            }
            System.out.println();
        }

        // for-each 循环（增强for）
        System.out.println("\nfor-each 遍历数组:");
        int[] numbers = {10, 20, 30, 40, 50};
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
