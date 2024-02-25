package com.aca;

import com.aca.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @Description:
 * @Author: acn
 * @Date: 2024/01/10/17:30
 */
@SpringBootTest(classes = JunitApplication.class)
@RunWith(SpringRunner.class)
public class UserServiceTest {

    @Autowired
    UserService userService;

    @Test
    public void serviceTest(){
        userService.doService();
    }
}
