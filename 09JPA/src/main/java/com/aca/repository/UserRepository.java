package com.aca.repository;

import com.aca.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @Description:
 * @Author: aca
 * @Date: 2024/01/16
 */
// 继承JpaRepository，泛型内容为实体类和主键类型
public interface UserRepository extends JpaRepository<User,Integer> {
}
