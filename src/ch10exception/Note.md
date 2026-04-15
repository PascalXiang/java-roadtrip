# ch10 异常处理

## 异常体系
```
Throwable
├── Error          （系统级，不用管）
│   └── OutOfMemoryError
└── Exception
    ├── RuntimeException  （运行时异常，可不处理）
    │   └── NullPointerException, ArrayIndexOutOfBounds...
    └── 其他              （编译时异常，必须处理）
        └── IOException, SQLException...
```

## 处理方式
```java
try {
    // 可能出错的代码
} catch (Exception e) {
    // 处理异常
} finally {
    // 一定执行
}
```

## 易错点
- catch 顺序：子类在前，父类在后
- finally 总是执行（除非 System.exit）
- 自定义异常继承 Exception（编译时）或 RuntimeException（运行时）

## 课后练习
- [ ] 封装一个安全的整数输入方法
