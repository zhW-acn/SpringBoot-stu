package com.aca;

import com.aca.mapper.UserMapper;
import com.aca.mapper.UserXMLMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @Description:
 * @Author: acn
 * @Date: 2024/01/10/20:41
 */
@SpringBootTest(classes = Application.class)
@RunWith(SpringRunner.class)
public class UserMapperTest {

    @Autowired
    UserMapper userMapper;

    @Autowired
    UserXMLMapper userXMLMapper;

    @Test
    public void findTest(){
        System.out.println(userMapper.findAlUsers());
    }

    @Test
    public void findXMLTest(){
        System.out.println(userXMLMapper.findAlUsers());
    }
}
