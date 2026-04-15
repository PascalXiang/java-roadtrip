# ch02 变量与数据类型

## 核心概念
- 变量 = 内存中的一块空间，有类型、有名字、有值
- 八大基本类型：byte(1) short(2) int(4) long(8) float(4) double(8) char(2) boolean

## 类型转换
```
自动（小→大）：byte → short → int → long → float → double
                     char ↗
强制（大→小）：(目标类型) 值  ← 可能丢失精度
```

## 易错点
- byte 运算自动提升为 int
- float 赋值必须加 `f`，long 加 `L`
- 字符串拼接优先级：`"a" + 1 + 2` → `"a12"`

## 课后练习
- [ ] 定义所有基本类型变量并打印
- [ ] 演示自动转换和强制转换
