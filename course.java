package demo1;

public class course {
    String number;
    faculty course_teacher;
    String place;
    String time;
    String class_name;

    course(String number, String place, String time, String class_name,faculty course_teacher) {
        setNumber(number);
        setCourse_teacher(course_teacher);
        setPlace(place);
        setTime(time);
        setClass_name(class_name);

    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public faculty getCourse_teacher() {
        return course_teacher;
    }

    public void setCourse_teacher(faculty course_teacher) {
        this.course_teacher = course_teacher;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getClass_name() {
        return class_name;
    }

    public void setClass_name(String class_name) {
        this.class_name = class_name;
    }
    public String toString(){
        return "课程编码："+number+",授课老师："+course_teacher+",上课地点："+place+",上课时间:"+time+",课程名称："+class_name;
    }
}