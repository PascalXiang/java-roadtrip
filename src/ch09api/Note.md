# ch09 常用 API

## 核心类

### String
- 不可变，每次修改产生新对象
- 常用：`length()` `charAt()` `substring()` `equals()` `split()`

### StringBuilder
- 可变字符串，适合频繁拼接
- `append()` `insert()` `reverse()`

### Math
- `Math.abs()` `Math.max()` `Math.random()` `Math.round()`

### Arrays
- `Arrays.sort()` `Arrays.toString()` `Arrays.binarySearch()`

## 易错点
- String 比较用 `equals()` 不用 `==`
- 字符串拼接用 StringBuilder 更高效

## 课后练习
- [ ] 手写字符串反转
