package com.hadi.bookserviceproject.controller;

import com.hadi.bookserviceproject.model.Book;
import com.netflix.appinfo.InstanceInfo;
import com.netflix.discovery.DiscoveryClient;
import com.netflix.discovery.EurekaClient;
import com.netflix.discovery.shared.Application;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
public class BookController {

    @Value("${server.port}")
    private String port;
    @Value("${detail.name}")
    private String detailName;
    @Value("${detail.app}")
    private String detailApp;
    @Value("${detail.global}")
    private String detailGlobal;
    @Value("${detail.book}")
    private String detailBook;


    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private EurekaClient eurekaClient;

    @GetMapping("/config")
    public String getConfig() {
        String s = "port: " + port + "\ndetail.name: " + detailName +
                "\ndetail.app: " + detailApp +"\ndetail.gloal: " + detailGlobal +
                "\ndetail.book: " + detailBook;
        return s;
    }

    @GetMapping("/test")
    public String test() {
//        Application application = this.eurekaClient.getApplication("user-service");
//        InstanceInfo instanceInfo = application.getInstances().get(1);
//        System.out.println(instanceInfo.getInstanceId());
//        System.out.println(instanceInfo.getAppName());
//        System.out.println(instanceInfo.getIPAddr());
//        System.out.println(instanceInfo.getPort());

        String url = "http://user-service/books/author";
        Book book = this.restTemplate.getForObject(url, Book.class);
        System.out.println(book);
        return null;
    }
}
