# 关于 string

## 优化机制

String 重拼接如果没有变量 ， 就会触发优化机制 、 直接将字符传入同一个StringBUilder 容器中 ， 结合后再 toString
返回，就这样在编译过程中就将字符串拼接起来。

## 关于 StringBuilder

StringBuilder 是有容器长度的，初始化长度为 16 -- 即当创建一个 StringBuilder 类型时 ， 其内部会直接创建一个长度为 16 的数组

### 那为什么 StringBuilder 不会爆满呢？

我们可以通过 capacitty 方法来获取 Stringbuilder 目前的容器长度

当 StringBuilder 在接受到大于 16 个字符的字符串时 ， 会主动增加容器的长度

增加后的容器的长度为 16*2+ 2= 34 个

如果一次性加入的字符大于 34 就会直接创建至加入字符串长度相同的容器的长度



