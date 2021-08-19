package com.zz.monitor;

import com.zz.work.service.MonitorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MonitorApplication implements CommandLineRunner {

    @Autowired
    private MonitorService monitorService;

    public static void main(String[] args) {
        SpringApplication.run(MonitorApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        monitorService.subscribe("abc", data -> System.out.println("receive data:" + data));
    }

}
