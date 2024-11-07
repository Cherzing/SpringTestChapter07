package cn.cherzing.bean3;

/**
 * @author Cherzing
 * @date 2024/11/07 0007 9:00
 * @description MyBean3Factory
 */
public class MyBean3Factory {
    public MyBean3Factory() {
        System.out.println("Bean3工厂实例化中");
    }
    public Bean3 createBean(){
        return new Bean3();
    }
}
