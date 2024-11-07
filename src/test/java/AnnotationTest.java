import cn.cherzing.Controller.User1Controller;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Cherzing
 * @date 2024/11/07 0007 9:44
 * @description AnnotationTest
 */
public class AnnotationTest {
    @Test
    public void test(){
        ClassPathXmlApplicationContext application = new ClassPathXmlApplicationContext("applicationContext.xml");
        User1Controller bean = (User1Controller)application.getBean("user1Controller");
        bean.save();
    }
}
