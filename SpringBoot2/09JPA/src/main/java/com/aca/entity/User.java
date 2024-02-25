package com.aca.entity;

import lombok.Data;

import javax.persistence.*;

/**
 * @Description:
 * @Author: aca
 * @Date: 2024/01/16
 */
@Data
@Entity // 标记实体类
@Table(name = "user") // 指定和哪个数据表对应，缺省表名为类名小写
public class User {
    @Id // 标记主键
    @GeneratedValue(strategy = GenerationType.IDENTITY)// 主键自增策略
    Integer id;

    @Column(name = "username", length = 50) // 列名
    String name;
}
