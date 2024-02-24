package com.aca;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.core.env.Environment;
import org.springframework.util.StringUtils;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * Hello world!
 */
@Slf4j
@SpringBootApplication
public class App {
    public static void main(String[] args) {

        ApplicationContext application = SpringApplication.run(App.class, args);
        Environment environment = application.getEnvironment();
        String ip = "";
        try {
            ip = InetAddress.getLocalHost().getHostAddress();
        } catch (UnknownHostException e) {
            log.error("获取主机ip出错" + e.getMessage());
        }
        String port = environment.getProperty("server.port");
        String path = environment.getProperty("server.servlet.contextPath");
        ip = (!StringUtils.isEmpty(ip)) ? ip : "";
        port = (!StringUtils.isEmpty(port)) ? port : "";
        path = (!StringUtils.isEmpty(path)) ? path : "";
        log.info("\n------\n" +
                "Local：\t\thttp://localhost:" + port + path + "\n" +
                "External：\thttp://" + ip + ":" + port + path + "\n"+
                "------\n"
        );
    }
}
