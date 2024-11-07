import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Cherzing
 * @date 2024/11/07 0007 8:45
 * @description Bean1Test
 */
public class BeanTest {
    @Test
    public void testBean1(){
        ApplicationContext applicationContext1 = new ClassPathXmlApplicationContext("applicationBean1.xml");
        Object bean1 = applicationContext1.getBean("bean1");
        Object bean2 = applicationContext1.getBean("bean1");
        System.out.println(bean1);
        System.out.println(bean2);
        System.out.println(bean1 == bean2);
    }
    @Test
    public void testBean2(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationBean2.xml");
        Object bean = context.getBean("bean2");
        System.out.println(bean);
    }
    @Test
    public void testBean3(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationBean3.xml");
        Object bean = context.getBean("bean3");
        System.out.println(bean);
    }
}
