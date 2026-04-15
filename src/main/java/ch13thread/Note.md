# ch13 多线程

## 创建线程
| 方式 | 代码 | 特点 |
|------|------|------|
| 继承 Thread | `class MyThread extends Thread` | 简单，但无法继承其他类 |
| 实现 Runnable | `class MyRunnable implements Runnable` | 推荐，灵活 |
| Callable + Future | `implements Callable<T>` | 可返回结果、可抛异常 |
| 线程池 | `ExecutorService` | 生产环境推荐 |

## 线程安全
```java
// 方式一：同步代码块
synchronized (锁对象) {
    临界区代码
}

// 方式二：同步方法
public synchronized void method() { ... }

// 方式三：Lock
Lock lock = new ReentrantLock();
lock.lock();
try { ... } finally { lock.unlock(); }
```

## 线程状态
```
新建 (New) → 就绪 (Runnable) → 运行 (Running)
                    ↑                  ↓
                    └── 阻塞/等待 (Blocked/Waiting) ←┘
                                    ↓
                              死亡 (Terminated)
```

## 线程池
```java
// 四种线程池（Executors 工厂方法）
ExecutorService pool1 = Executors.newFixedThreadPool(5);    // 固定大小
ExecutorService pool2 = Executors.newCachedThreadPool();     // 弹性伸缩
ExecutorService pool3 = Executors.newSingleThreadExecutor(); // 单线程
ExecutorService pool4 = Executors.newScheduledThreadPool(3); // 定时任务

// 提交任务
pool.submit(() -> System.out.println("task"));
pool.shutdown();  // 用完必须关闭
```

## 易错点
- `start()` 启动线程，不是 `run()`（直接调用 run 不会创建新线程）
- synchronized 锁对象要一致（不同锁对象无法互斥）
- 线程池用完要 `shutdown()`，否则 JVM 不退出
- 多线程操作共享变量要用 `volatile` 或同步机制

## 课后练习
- [ ] 多窗口卖票（线程安全）
- [ ] 生产者-消费者模型
