package ch05array;

/**
 * 第五章 - 数组基础
 * 黑马程序员Java入门到起飞
 */
public class ArrayBasic {
    public static void main(String[] args) {
        System.out.println("=== 数组基础 ===");

        // 方式1: 声明并初始化
        int[] arr1 = {10, 20, 30, 40, 50};

        // 方式2: 先声明后赋值
        int[] arr2 = new int[5];  // 默认值都是0
        arr2[0] = 100;
        arr2[1] = 200;

        // 遍历数组
        System.out.println("arr1:");
        for (int i = 0; i < arr1.length; i++) {
            System.out.println("  arr1[" + i + "] = " + arr1[i]);
        }

        // 数组长度
        System.out.println("arr1.length = " + arr1.length);

        // 求数组最大值
        int max = arr1[0];
        for (int num : arr1) {
            if (num > max) {
                max = num;
            }
        }
        System.out.println("最大值: " + max);

        // 数组反转
        System.out.println("\n数组反转:");
        for (int i = 0; i < arr1.length / 2; i++) {
            int temp = arr1[i];
            arr1[i] = arr1[arr1.length - 1 - i];
            arr1[arr1.length - 1 - i] = temp;
        }
        for (int num : arr1) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
