package discovery;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * Created by lzr on 2017/4/15.
 */

@SpringBootApplication
@EnableEurekaServer
public class DiscoveryApplicaion {
    public static void main(String[] args) {
        SpringApplication.run(DiscoveryApplicaion.class, args);
    }
}
