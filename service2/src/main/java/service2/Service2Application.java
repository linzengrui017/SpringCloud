package service2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by lzr on 2017/4/15.
 */
@SpringBootApplication
@EnableDiscoveryClient
@RestController
public class Service2Application {
    @RequestMapping("/service2")
    public String service2(){
        return "service2";
    }

    public static void main(String[] args) {
        SpringApplication.run(Service2Application.class, args);
    }
}
