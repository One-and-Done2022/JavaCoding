# JavaCoding - Java 每日练习项目

这是一个用于 Java 开发练习的仓库，采用多模块结构，每天一个独立的练习项目。

## 📂 项目结构

```
JavaCoding/
├── day0-hello-world/       # Day 0: Hello World 入门
│   ├── pom.xml            # 独立的 Maven 配置
│   └── src/
│       └── main/java/com/sherly/
│           └── hello_world.java
├── day1-java-basic/        # Day 1: Java 基础语法
│   ├── pom.xml
│   └── src/
│       └── main/java/com/sherly/
│           └── isready.java
├── .gitignore
└── README.md
```

## 🛠️ 技术栈

- **语言**: Java 23
- **构建工具**: Maven
- **IDE**: IntelliJ IDEA 2025.1.6

## 🚀 项目构建方式

### 创建新模块步骤：

1. **在 IDEA 中右键点击 `JavaCoding` 根目录**
2. 选择 **New → Module**
3. 配置模块：
   - **Name**: 输入模块名称（如 `day2-arrays`）
   - **Build System**: 选择 **Maven**
   - **JDK**: 选择 **23**
   - **Parent**: ⚠️ **不选择父项**（每个模块独立配置）
4. 点击 **Create**

### 运行方式：

1. 打开模块下的 Java 文件（如 `day0-hello-world/src/main/java/com/sherly/hello_world.java`）
2. 点击类中 `main` 方法旁边的绿色运行按钮 ▶️
3. 或右键选择 **Run 'hello_world.main()'**

## 📖 学习内容

### Day 0 - Hello World
- **文件**: `day0-hello-world/src/main/java/com/sherly/hello_world.java`
- **内容**: 
  - Java 程序基本结构
  - 包声明：`package com.sherly;`
  - 主方法：`public static void main(String[] args)`
  - 输出语句：`System.out.println("Hello, World!");`

### Day 1 - Java 基础语法
- **文件**: `day1-java-basic/src/main/java/com/sherly/isready.java`
- **内容**:
  - 基本数据类型：`int`, `double`, `String`, `boolean`
  - 变量声明与赋值
  - 条件语句：`if-else`
  - 循环语句：`for` 嵌套循环
  - 字符串拼接
  - 九九乘法表实现（两种方式）
  - 转义字符：`\t`（制表符）、`\n`（换行符）

## 📌 项目特点

- ✅ 每个模块有**独立的 `pom.xml`**
- ✅ 每个模块**独立配置 JDK 版本**
- ✅ 模块之间**相互独立**，可单独运行
- ❌ **没有**使用父 POM 统一管理（每个模块自主配置）
- ❌ **不提交** `.idea/`、`target/`、`*.iml` 等 IDE 和编译文件

## 🔧 环境要求

- JDK 23 或更高版本
- Maven 3.6+
- IntelliJ IDEA 2024+ (推荐)

## 📝 Git 提交规范

```bash
# 添加新模块
git add dayX-module-name/
git commit -m "feat: 添加 Day X 模块名称"

# 更新代码
git add .
git commit -m "update: 完善 Day X 功能"

# 推送到远程
git push origin main
```

## 🎯 学习计划

- [x] Day 0: Hello World - 熟悉 Java 基本语法
- [x] Day 1: Java 基础 - 变量、数据类型、循环
- [ ] Day 2: 数组与方法
- [ ] Day 3: 面向对象基础
- [ ] Day 4: 继承与多态
- [ ] Day 5: 异常处理
- [ ] Day 6: 集合框架
- [ ] Day 7: IO 操作
- [ ] ...（持续更新）

## 📧 联系方式

- GitHub: [@One-and-Done2022](https://github.com/One-and-Done2022)
- 仓库: [JavaCoding](https://github.com/One-and-Done2022/JavaCoding)

---

⭐ 如果这个项目对你有帮助，欢迎 Star！
