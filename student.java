package demo1;

public class student extends people {
    course ab;
    student(int number, String name, String sex){
        super( number,  name,  sex);
        setAb(ab);

    }
    public course getAb() {
        return ab;
    }

    public void setAb(course ab) {
        this.ab = ab;
    }
public String toString() {
        return "编号："+number+",姓名："+name+",所选课程："+ab;
}



}
