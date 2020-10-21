package demo1;

public class faculty extends people {

    course abc;
    String course_taught;

    faculty(int number, String name, String sex,String course_taught){
        super( number,  name,  sex);
        setCourse_taught(course_taught);

    }


    public course getAbc() {
        return abc;
    }

    public void setAbc(course abc) {
        this.abc = abc;
    }
    public String getCourse_taught() {
        return course_taught;
    }

    public void setCourse_taught(String course_taught) {
        this.course_taught= course_taught;
    }
    public String toString(){
        return "编号:"+number+",姓名:"+name+"，性别："+sex+",所教课程:"+course_taught;
    }


}
