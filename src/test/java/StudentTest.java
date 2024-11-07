import cn.cherzing.Student;
import org.junit.Test;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Cherzing
 * @date 2024/11/07 0007 22:44
 * @description StudentTest
 */
public class StudentTest {
    @Test
    public void testStudent(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationStudent.xml");
        Student beanStudent = (Student)context.getBean("student");
        System.out.println(beanStudent);

        // 摧毁Spring容器中所有的Bean
        AbstractApplicationContext ac = (AbstractApplicationContext)context;
        ac.registerShutdownHook();
    }
}
