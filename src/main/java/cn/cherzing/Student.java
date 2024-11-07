package cn.cherzing;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * @author Cherzing
 * @date 2024/11/07 0007 22:36
 * @description Student
 */
@Component("student")
public class Student {
    @Value("1")
    private String id;
    @Value("庞野")
    private String name;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
    @PostConstruct
    public void init(){
        System.out.println("Bean的初始化完成，调用init方法");
    }

    @PreDestroy
    public void destroy(){
        System.out.println("Bean销毁前调用destroy方法");
    }


}
