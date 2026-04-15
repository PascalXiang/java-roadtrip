# ch12 IO 流

## 流的分类
```
按方向：输入流 / 输出流
按单位：字节流（图片） / 字符流（文本）
按功能：节点流（直接操作文件） / 处理流（包装增强）
```

## 常用流
| 类 | 用途 |
|----|------|
| FileInputStream | 字节输入 |
| FileOutputStream | 字节输出 |
| FileReader | 字符输入 |
| FileWriter | 字符输出 |
| BufferedInputStream | 缓冲字节输入 |
| BufferedReader | 缓冲字符输入（readLine） |

## 易错点
- 用完流必须关闭（try-with-resources）
- 字符流处理中文，字节流处理二进制
- 序列化类必须实现 `Serializable`

## 课后练习
- [ ] 文件复制
- [ ] 统计文件行数
