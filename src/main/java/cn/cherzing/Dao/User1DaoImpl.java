package cn.cherzing.Dao;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Repository;

/**
 * @author Cherzing
 * @date 2024/11/07 0007 9:26
 * @description User1DaoImpl
 */
@Repository("user1Dao")
public class User1DaoImpl implements User1Dao{

    @Override
    public void save() {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        System.out.println(context.getBean("user1"));
        System.out.println("User1DaoImpl已实现save");
    }
}
