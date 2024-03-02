package com.aca.pojo;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Description:
 * @Author: aca
 * @Date: 2024/02/29
 */
@Data
@JacksonXmlRootElement
@AllArgsConstructor
public class Person {
    int id;
    String name;
    int age;
}
