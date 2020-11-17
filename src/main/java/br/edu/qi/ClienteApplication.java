package br.edu.qi;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class ClienteApplication {

    @Value("${application.name}")
    private String appName;

    @GetMapping("/ola")
    public  String ola()
    {
        return  this.appName;
    }

    public static void main(String[] args) {
        SpringApplication.run(ClienteApplication.class,args);
    }
}
