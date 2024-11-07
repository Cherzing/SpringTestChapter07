package cn.cherzing;

import org.springframework.beans.factory.annotation.Value;

/**
 * @author Cherzing
 * @date 2024/11/07 0007 9:19
 * @description User1
 */
public class User1 {
    @Value("1")
    private int id;
    @Value("蓝友宁")
    private String name;
    @Value("123")
    private String password;

    public User1(int id, String name, String password) {
        this.id = id;
        this.name = name;
        this.password = password;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "User1{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
