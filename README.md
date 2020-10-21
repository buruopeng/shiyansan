# shiyansan
**一.实验目的

1.初步了解分析系统需求，从学生选课角度了解系统中的实体及其关系，学会定义类中的属性以及方法；
2.掌握面向对象的类设计方法（属性、方法）；
3.掌握类的继承用法，通过构造方法实例化对象；
4.学会使用super()，用于实例化子类；
5.掌握使用Object根类的toString（）方法,应用在相关对象的信息输出中。

**二.实验要求

说明：学校有“人员”，分为“教师”和“学生”，教师教授“课程”，学生选择“课程”。从简化系统考虑，每名教师仅教授一门课程，每门课程的授课教师也仅有一位，每名学生选仅选一门课程。
对象：	人员（编号、姓名、性别）
教师（编号、姓名、性别、所授课程）
学生（编号、姓名、性别、所选课程）
课程（编号、课程名称、上课地点、时间、授课教师）
faculty a = new faculty(2, "成成", "男", "数学");
faculty b = new faculty(3, "萌萌", "男", "物理");
faculty c = new faculty(4, "嵩嵩", "男", "java");
faculty d = new faculty(1, "涵涵", "男", "历史");
course e = new course("c2057", "教300", "13:30", "高等数学", a);
course f = new course("a2079", "教301", "14:30", "大学物理", b);
course g = new course("c1735", "教302", "15:30", "java教程", c);
course h = new course("b1862", "教303", "16:30", "现代历史", d);
student i = new student(13, "芃芃", "男");

**三.实验过程

创建了people,Test,faculty,student,coursew五个类，分别对类写入方法，构造方法，创建变量，其中people是faulty和student的父类，student和faulty类中定义course类变量，可简化代码，在方法体中设置构造方法，接收变量的参数，再赋值给属性，用set，get方法获取，接收参数，toString方法用于返回变量，在Test中导入Scanner包，用于接收从键盘输入的信息，然后在main中用Scanner创建in对象，用in.nextInt()实现从前读入整型数。在Test类中实例化学生教师课程信息，用switch语句接收参数j，j通过键盘输入，用set方法接收设定课程信息，再将选课信息打印出来，运用if,else循环语句，根据学生通过键盘输入选择是否退课，若退课，学生课程信息赋值为null，若再次确认无需退课，则打印选课成功，代码执行结束。

**四.流程图

![](https://github.com/buruopeng/shiyansan/blob/main/c1c3acf4aec4607869cce9e12ea1b8c.png"")

**五 .核心代码

