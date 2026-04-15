# ch11 集合框架

## 体系结构
```
Collection
├── List（有序可重复）
│   ├── ArrayList    数组实现，查询快
│   └── LinkedList   链表实现，增删快
└── Set（无序不重复）
    ├── HashSet      哈希表
    └── TreeSet      红黑树，有序

Map（键值对）
├── HashMap          哈希表，最常用
└── TreeMap          红黑树，key 有序
```

## 常用操作
| 方法 | 说明 |
|------|------|
| `add()` / `put()` | 添加 |
| `remove()` | 删除 |
| `get()` | 获取 |
| `contains()` | 是否包含 |
| `size()` | 大小 |
| `iterator()` | 迭代器 |

## 易错点
- List 元素是对象（int → Integer）
- Set 去重依赖 `hashCode()` + `equals()`
- HashMap key 不能重复，value 可以

## 课后练习
- [ ] 统计字符串中每个字符出现次数
