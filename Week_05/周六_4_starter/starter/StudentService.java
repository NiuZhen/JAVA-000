package io.niuz.springboot.starter;

public class StudentService {
    public Integer id;
    public String name;

    public StudentService(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    public String print() {
        return String.format("编号：%d 姓名：%s", id, name);
    }
}
