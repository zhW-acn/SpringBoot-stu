package com.aca;

import com.aca.properties.MyProperties;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.util.StringUtils;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * Hello world!
 *
 */
@Slf4j
@SpringBootApplication
public class App 
{
    public static void main( String[] args )
    {
        var application = SpringApplication.run(App.class, args);
        log.error(application.getBean("myPropertiesTest", MyProperties.class).toString());
        var environment = application.getEnvironment();
        var ip = "";
        try {
            ip = InetAddress.getLocalHost().getHostAddress();
        } catch (UnknownHostException e) {
            log.error("获取主机ip出错" + e.getMessage());
        }
        var port = environment.getProperty("server.port");
        var path = environment.getProperty("server.servlet.contextPath");
        ip = (!StringUtils.isEmpty(ip)) ? ip : "";
        port = (!StringUtils.isEmpty(port)) ? port : "8080";
        path = (!StringUtils.isEmpty(path)) ? path : "";
        log.info("\n------\n" +
                "Local：\t\thttp://localhost:" + port + path + "\n" +
                "External：\thttp://" + ip + ":" + port + path + "\n"+
                "------\n"
        );
    }
}
