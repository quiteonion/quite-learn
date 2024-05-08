# 回顾先前代码，代码来自 [A20240324](..%2FA20240324) 包

# 体验

![img.png](img.png)

## 在 Aniaml 中添加一个抽象方法

### 在增加抽象方法后需要将这个类变为抽象类

### 所有的子类都需要重写这个 abstract 方法

## 验证 abstract 类不能被 new

abstract 类不能被 new

![img_1.png](img_1.png)

## 添加一个 final 声明的方法 验证它不能被重写

![img_2.png](img_2.png)

被 final 修饰的方法不能被重写

## 思考为什么 final 和 abstract 不能放在同一个方法中？

原因 ： final 要求不能被重写 abstract 要求必须被重写 两者之间相互冲突

# 怎么用 Java 算时间

## 使用 System.currentTimeMillis 方法




