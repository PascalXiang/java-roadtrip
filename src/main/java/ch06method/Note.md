# ch06 方法

## 核心概念
```java
修饰符 返回值类型 方法名(参数列表) {
    方法体;
    return 返回值;
}
```

| 组成部分 | 说明 |
|----------|------|
| 修饰符 | `public static` 等 |
| 返回值类型 | `void`（无返回值）或具体类型 |
| 方法名 | 驼峰命名，见名知意 |
| 参数列表 | 0~N 个，用逗号分隔 |
| return | 返回结果并结束方法 |

## 方法重载（Overload）
- 同名方法，参数个数/类型/顺序不同
- 与返回值类型无关（仅返回值不同不算重载）
- 调用时编译器根据实参自动匹配

## 参数传递
- **Java 只有值传递**
- 基本类型：传递的是值的副本，方法内修改不影响原变量
- 引用类型：传递的是地址的副本，方法内修改对象属性会影响原对象（但重新赋值不影响）

## 关键代码
```java
// 基本类型 — 不影响原值
void change(int x) { x = 100; }
int a = 1;
change(a);       // a 还是 1

// 引用类型 — 影响属性
void setName(Student s) { s.setName("Tom"); }
Student stu = new Student();
setName(stu);    // stu.getName() == "Tom"

// 重载示例
int add(int a, int b) { return a + b; }
double add(double a, double b) { return a + b; }
int add(int a, int b, int c) { return a + b + c; }
```

## 易错点
- 有返回值的方法必须 return
- void 方法可以省略 return（或写 `return;`）
- 重载 ≠ 重写（Override，重写是子类对父类方法的重新实现）
- `return` 后面的代码不会执行

## 课后练习
- [ ] 写一个求最大值的方法并重载（int / double / 三个数）
