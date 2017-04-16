package service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by lzr on 2017/4/15.
 */

@SpringBootApplication
@EnableDiscoveryClient
@RestController
public class ServiceApplication {
    @GetMapping("/service")
    public String service(){
        return "service";
    }

    public static void main(String[] args) {
        SpringApplication.run(ServiceApplication.class, args);
    }
}
