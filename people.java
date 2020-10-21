package demo1;

public class people {
    int number;
    String name;
    String sex;

    people(int number, String name, String sex) {
        setNumber(number);
        setName(name);
        setSex(sex);
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
}

