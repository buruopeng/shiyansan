package demo1;
import java.util.Scanner;
public class Test {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        faculty a = new faculty(2, "成成", "男", "数学");
        faculty b = new faculty(3, "萌萌", "男", "物理");
        faculty c = new faculty(4, "嵩嵩", "男", "java");
        faculty d = new faculty(1, "涵涵", "男", "历史");
        course e = new course("c2057", "教300", "13:30", "高等数学", a);
        course f = new course("a2079", "教301", "14:30", "大学物理", b);
        course g = new course("c1735", "教302", "15:30", "java教程", c);
        course h = new course("b1862", "教303", "16:30", "现代历史", d);
        student i = new student(13, "芃芃", "男");
        System.out.println("课程信息：");
        System.out.println("********************************");
        System.out.println("课程1：" + e);
        System.out.println("课程2：" + f);
        System.out.println("课程3：" + g);
        System.out.println("课程4：" + h);
        System.out.println("*******************************");
        System.out.println("请输入所选课程编号：");
        int j = in.nextInt();
        switch (j) {
            case 1:
                i.setAb(e);
                break;
            case 2:
                i.setAb(f);
                break;
            case 3:
                i.setAb(g);
                break;
            case 4:
                i.setAb(h);
                break;
            default:
                System.out.println("选课无效");
                return;


        }
        System.out.println("恭喜您选课成功，您选择了" + j + "号课程,课程信息如下：");
        System.out.println("*****************************************");
        System.out.println(i);
        System.out.println("*****************************************");
        System.out.println("是否需要退课？（退课请输入5，确认不需要退课请输入6）");
        int k = in.nextInt();
        if (k == 5) {
            i.setAb(null);
            System.out.println("退课成功");
            System.out.println(i);

        } else {
            System.out.println("选课成功！");


        }
        System.out.println("*****************************************");


    }
}
