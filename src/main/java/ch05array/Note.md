# ch05 数组

## 核心概念
- 数组是固定长度的同类型容器，索引从 0 开始
- `int[] arr = new int[5]` → 默认值 0
- `int[] arr = {1,2,3}` → 静态初始化

## 常用操作
| 操作 | 代码 |
|------|------|
| 长度 | `arr.length` |
| 遍历 | `for-each` / `for i` |
| 排序 | `Arrays.sort(arr)` |
| 查找 | 二分查找（需先排序） |

## 易错点
- 数组越界 `ArrayIndexOutOfBoundsException`
- `length` 是属性不是方法（不带括号）

## 课后练习
- [ ] 手写冒泡排序
- [ ] 数组去重
