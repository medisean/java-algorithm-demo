# java-algorithm-demo

一个开箱即用的 Java 算法示例仓库，适合作为练手项目、面试刷题仓库骨架或教学 demo。

## 项目结构

```text
java-algorithm-demo/
├── pom.xml
├── src/
│   ├── main/java/com/medisean/demo/
│   │   ├── App.java
│   │   └── algorithms/
│   │       ├── BinarySearch.java
│   │       └── Fibonacci.java
│   └── test/java/com/medisean/demo/algorithms/
│       ├── BinarySearchTest.java
│       └── FibonacciTest.java
└── .gitignore
```

## 包含内容

- 二分查找：包含迭代版实现
- 斐波那契：包含递归版与动态规划版实现
- JUnit 5 测试用例
- Maven 项目配置

## 环境要求

- JDK 17+
- Maven 3.9+

## 运行测试

```bash
mvn test
```

## 运行示例

```bash
mvn exec:java -Dexec.mainClass="com.medisean.demo.App"
```

## 后续可扩展方向

- 排序算法：冒泡、插入、快速排序、归并排序
- 常见题型：双指针、滑动窗口、栈、队列、树、图
- 数据结构实现：链表、堆、并查集、LRU

如果你想继续扩展，我也可以直接往这个仓库里补一版常见算法模板。
