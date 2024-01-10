package com.aca.mapper;

import com.aca.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @Description:
 * @Author: acn
 * @Date: 2024/01/10/20:35
 */
@Mapper
public interface UserMapper {
    @Select("select * from user")
    List<User> findAlUsers();
}
