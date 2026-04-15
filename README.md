# ☕ Java Roadtrip

> 从零开始的 Java 学习之旅 🚀

## 课程路线

| 阶段 | 课程 | 链接 | 状态 |
|------|------|------|------|
| 上部 | Java 入门到起飞 | [BV17F411T7Ao](https://www.bilibili.com/video/BV17F411T7Ao) | 🔜 |
| 下部 | Java 入门到起飞（续） | [BV1yW4y1Y7Ms](https://www.bilibili.com/video/B1yW4y1Y7Ms) | ⬜ |

## 项目结构

```
java-roadtrip/
├── src/
│   ├── ch01helloworld/       基础入门 · HelloWorld · JDK · CMD
│   ├── ch02variables/        变量 · 数据类型 · 类型转换
│   ├── ch03operators/        算术 · 关系 · 逻辑 · 三元
│   ├── ch04flowcontrol/      if · switch · for · while · break
│   ├── ch05array/            数组 · 排序 · 二分查找 · 二维数组
│   ├── ch06method/           方法定义 · 重载 · 返回值
│   ├── ch07oopbasic/         类与对象 · 构造方法 · 封装 · this
│   ├── ch08oopadvanced/      继承 · 多态 · 抽象类 · 接口 · static · final
│   ├── ch09api/              String · StringBuilder · Math · Arrays · 包装类
│   ├── ch10exception/        异常体系 · try-catch · 自定义异常
│   ├── ch11collections/      Collection · List · Set · Map · HashMap
│   ├── ch12io/               File · 字节流 · 字符流 · 缓冲流 · 序列化
│   ├── ch13thread/           线程 · Runnable · 同步 · 线程池
│   ├── ch14network/          InetAddress · TCP · UDP
│   └── ch15lambda/           Lambda · Stream · Optional
└── notes/                    学习笔记（见下方格式）
```

每个包下 `.java` 文件是示例代码，`.md` 文件是该节笔记。

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

1. 用 IntelliJ IDEA 打开项目
2. 配置 JDK（推荐 17+）
3. 打开任意 `.java` → 点击 main 方法旁 ▶ 运行
4. 边看视频边在对应包下写代码 + 填笔记

## 学习进度

- [x] ch01 基础入门
- [ ] ch02 变量与数据类型
- [ ] ch03 运算符
- [ ] ch04 流程控制
- [ ] ch05 数组
- [ ] ch06 方法
- [ ] ch07 面向对象基础
- [ ] ch08 面向对象进阶
- [ ] ch09 常用 API
- [ ] ch10 异常处理
- [ ] ch11 集合
- [ ] ch12 IO 流
- [ ] ch13 多线程
- [ ] ch14 网络编程
- [ ] ch15 Lambda 与 Stream
