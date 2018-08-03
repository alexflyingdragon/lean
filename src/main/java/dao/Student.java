package dao;

/**
 * Created by ALEX on 2018/8/3.
 */
public class Student {
    private String name;

    private Long age;

    public String getName() {
        return name;
    }

    // 2.0.0 版本

    public void setName(String name) {
        this.name = name;
    }

    public Long getAge() {
        return age;
    }

    public void setAge(Long age) {
        this.age = age;
    }
}
