# ch13 多线程

## 创建线程
| 方式 | 代码 |
|------|------|
| 继承 Thread | `class MyThread extends Thread` |
| 实现 Runnable | `class MyRunnable implements Runnable` |
| 线程池 | `ExecutorService` |

## 线程安全
```
synchronized (锁对象) {
    临界区代码
}
```

## 线程状态
```
新建 → 就绪 → 运行 → 阻塞/等待 → 死亡
```

## 易错点
- `start()` 启动线程，不是 `run()`
- synchronized 锁对象要一致
- 线程池用完要 `shutdown()`

## 课后练习
- [ ] 多窗口卖票（线程安全）
