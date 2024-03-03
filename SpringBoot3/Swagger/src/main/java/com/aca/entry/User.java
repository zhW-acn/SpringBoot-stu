package com.aca.entry;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

/**
 * @Description:
 * @Author: aca
 * @Date: 2024/03/03
 */
@Data
@Accessors(chain = true)
@AllArgsConstructor
@NoArgsConstructor
@Schema(title = "用户")
public class User {
    @Schema(title = "用户id")
    Integer id;
    String name;
    Integer age;
}
