package com.ambow.leiyuan.ssmtest;

import com.ambow.leiyuan.dao.UserMapper;
import com.ambow.leiyuan.entity.User;
import com.ambow.leiyuan.service.IUserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SsmtestApplicationTests {

    @Autowired
    private IUserService userService;

    @Test
    public void contextLoads() {
        User user = new User(null, "leiyuan", "15326047083", "123123", "男", "1996。4。3", "计算机", 0);
        System.out.println(userService.newUser(user));
    }

}
