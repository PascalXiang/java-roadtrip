# ch15 Lambda 与 Stream

## Lambda
```java
// 匿名内部类
Runnable r1 = new Runnable() {
    public void run() { System.out.println("hi"); }
};

// Lambda
Runnable r2 = () -> System.out.println("hi");
```

## Stream 流
```java
list.stream()
    .filter(s -> s.length() > 3)    // 过滤
    .map(String::toUpperCase)        // 转换
    .sorted()                        // 排序
    .collect(Collectors.toList());   // 收集
```

## 常用操作
| 操作 | 说明 |
|------|------|
| `filter` | 过滤 |
| `map` | 映射转换 |
| `forEach` | 遍历 |
| `collect` | 收集结果 |
| `reduce` | 归约 |
| `count` | 计数 |

## Optional
- 避免空指针：`Optional.ofNullable(value)`
- 取值：`orElse()` / `get()` / `ifPresent()`

## 课后练习
- [ ] 用 Stream 处理学生列表（过滤、排序、统计）
