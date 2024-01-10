package com.aca.mapper;

import com.aca.entity.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @Description:
 * @Author: acn
 * @Date: 2024/01/10/20:47
 */
@Mapper
public interface UserXMLMapper {

    List<User> findAlUsers();
}
