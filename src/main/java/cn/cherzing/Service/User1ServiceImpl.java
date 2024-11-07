package cn.cherzing.Service;

import cn.cherzing.Dao.User1Dao;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
/**
 * @author Cherzing
 * @date 2024/11/07 0007 9:30
 * @description User1ServiceImpl
 */
@Service("user1Service")
public class User1ServiceImpl implements User1Service{
    @Resource(name="user1Dao")
    private User1Dao user1Dao;
    @Override
    public void save() {

        System.out.println("User1ServiceImpl中save方法");
    }
}
