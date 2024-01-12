package com.aca;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @Description:
 * @Author: acn
 * @Date: 2024/01/12/19:26
 */
@SpringBootTest
@RunWith(SpringRunner.class)
@Slf4j
public class LoggerTest {
    @Test
    public void test(){
        log.trace("trace日志");
        log.debug("debug日志");
        // SpringBoot默认级别为info
        log.info("info日志");
        log.warn("warn日志");
        log.error("error日志");
    }
}
