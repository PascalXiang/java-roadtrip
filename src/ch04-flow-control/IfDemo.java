package ch04flowcontrol;

/**
 * 第四章 - 流程控制：if判断
 * 黑马程序员Java入门到起飞
 */
public class IfDemo {
    public static void main(String[] args) {
        System.out.println("=== if 判断 ===");

        int score = 85;

        // 单分支
        if (score >= 60) {
            System.out.println("及格了！");
        }

        // 双分支
        if (score >= 90) {
            System.out.println("优秀！");
        } else {
            System.out.println("还需努力！");
        }

        // 多分支
        if (score >= 90) {
            System.out.println("A - 优秀");
        } else if (score >= 80) {
            System.out.println("B - 良好");
        } else if (score >= 70) {
            System.out.println("C - 中等");
        } else if (score >= 60) {
            System.out.println("D - 及格");
        } else {
            System.out.println("E - 不及格");
        }

        // 三元运算符（if-else的简写）
        String result = score >= 60 ? "及格" : "不及格";
        System.out.println("三元运算符结果: " + result);
    }
}
