# ch01 基础入门

## 核心概念
- JVM、JDK、JRE 三者关系
- Java 跨平台原理：编译成字节码，JVM 执行

## 环境搭建
- JDK 下载：Oracle 官网 or Adoptium
- 配置 JAVA_HOME、PATH
- 验证：`java -version`、`javac -version`

## 关键代码
```java
public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
    }
}
```

## 易错点
- 文件名必须和类名一致（大小写敏感）
- main 方法签名写错 → 找不到入口
- 中文标点符号 → 编译报错

## 课后练习
- [ ] 成功运行 HelloWorld
- [ ] 用 CMD 编译运行 .java 文件
