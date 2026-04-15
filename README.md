# ☕ Java Roadtrip

> 从零开始的 Java 学习之旅 🚀

## 课程路线

| 阶段 | 课程 | 链接 | 状态 |
|------|------|------|------|
| 上部 | Java 入门到起飞 | [BV17F411T7Ao](https://www.bilibili.com/video/BV17F411T7Ao) | 🔜 |
| 下部 | Java 入门到起飞（续） | [BV1yW4y1Y7Ms](https://www.bilibili.com/video/BV1yW4y1Y7Ms) | ⬜ |

## 项目结构

```
java-roadtrip/
├── pom.xml                          Maven 配置
├── src/main/java/
│   ├── ch01helloworld/              基础入门 · HelloWorld
│   ├── ch02variables/               变量 · 数据类型 · 类型转换
│   ├── ch03operators/               算术 · 关系 · 逻辑 · 三元
│   ├── ch04flowcontrol/             if · switch · for · while
│   ├── ch05array/                   数组 · 排序 · 二分查找
│   ├── ch06method/                  方法定义 · 重载
│   ├── ch07oopbasic/                类与对象 · 构造 · 封装
│   ├── ch08oopadvanced/             继承 · 多态 · 抽象 · 接口
│   ├── ch09api/                     String · Math · Arrays
│   ├── ch10exception/               异常体系 · try-catch
│   ├── ch11collections/             List · Set · Map
│   ├── ch12io/                      字节流 · 字符流 · 缓冲流
│   ├── ch13thread/                  线程 · 同步 · 线程池
│   ├── ch14network/                 TCP · UDP
│   └── ch15lambda/                  Lambda · Stream · Optional
├── src/main/resources/
│   └── logback.xml                  日志配置
└── src/test/java/                   单元测试
```

每个包下 `.java` 是示例代码，`Note.md` 是该章笔记。

## 已引入依赖

| 依赖 | 用途 |
|------|------|
| **slf4j + logback** | 日志框架 |
| **Lombok** | 简化 POJO（@Data @Getter 等） |
| **Guava** | Google 工具类（集合、缓存、字符串） |
| **commons-lang3** | Apache 工具类（StringUtils 等） |
| **commons-io** | IO 工具类 |
| **Hutool** | 国产全能工具库 |
| **Jackson** | JSON 处理 |
| **JUnit 5** | 单元测试 |

## 笔记格式

每个章节的笔记统一放在包内 `.md` 文件中，格式如下：

```markdown
# ch02 变量与数据类型

## 核心概念
- 变量本质是内存中的一块空间
- 八大基本类型：byte short int long float double char boolean

## 易错点
- byte 运算自动提升为 int
- float 赋值必须加 f 后缀

## 关键代码
​```
int a = 10;
long b = a;  // 自动转换
​```

## 课后练习
- [ ] 完成课后题 xxx
```

## 如何使用

1. 用 IntelliJ IDEA 打开项目（自动识别 Maven）
2. 等 IDEA 右下角 Maven 依赖下载完成
3. 配置 JDK 17+
4. 打开任意 `.java` → 点击 main 方法旁 ▶ 运行

## 学习进度

> 项目骨架已搭建完成（Maven + 15 章代码桩 + 笔记模板），随时可以开始填充内容。

| 章节 | 代码 | 笔记 | 状态 |
|------|------|------|------|
| ch01 基础入门 | HelloWorld.java | ✅ 完整 | ✅ 完成 |
| ch02 变量与数据类型 | 3 个文件（TODO） | ✅ 有内容 | 🔜 待写 |
| ch03 运算符 | 4 个文件（TODO） | ✅ 有内容 | 🔜 待写 |
| ch04 流程控制 | 6 个文件（TODO） | ✅ 有内容 | 🔜 待写 |
| ch05 数组 | 4 个文件（TODO） | ✅ 有内容 | 🔜 待写 |
| ch06 方法 | 3 个文件（TODO） | 📝 待充实 | 🔜 待写 |
| ch07 面向对象基础 | 4 个文件（TODO） | ✅ 有内容 | 🔜 待写 |
| ch08 面向对象进阶 | 6 个文件（TODO） | ✅ 有内容 | 🔜 待写 |
| ch09 常用 API | 6 个文件（TODO） | ✅ 有内容 | 🔜 待写 |
| ch10 异常处理 | 3 个文件（TODO） | ✅ 有内容 | 🔜 待写 |
| ch11 集合 | 8 个文件（TODO） | ✅ 有内容 | 🔜 待写 |
| ch12 IO 流 | 5 个文件（TODO） | ✅ 有内容 | 🔜 待写 |
| ch13 多线程 | 5 个文件（TODO） | ✅ 有内容 | 🔜 待写 |
| ch14 网络编程 | 3 个文件（TODO） | ✅ 有内容 | 🔜 待写 |
| ch15 Lambda 与 Stream | 3 个文件（TODO） | ✅ 有内容 | 🔜 待写 |
