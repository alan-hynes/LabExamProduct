package ie.atu.labexam;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class LabExamApplication {

    public static void main(String[] args) {
        SpringApplication.run(LabExamApplication.class, args);
    }

}
