package cn.cherzing.Controller;

import cn.cherzing.Service.User1Service;
import org.springframework.stereotype.Controller;

import javax.annotation.Resource;

/**
 * @author Cherzing
 * @date 2024/11/07 0007 9:42
 * @description User1Controller
 */
@Controller
public class User1Controller {
    @Resource(name = "user1Service")
    private User1Service user1Service;
    public void save(){
        this.user1Service.save();
        System.out.println("执行User1Controller.save()...");
    }
}
