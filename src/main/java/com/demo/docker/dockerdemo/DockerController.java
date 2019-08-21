package com.demo.docker.dockerdemo;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DockerController {

    @GetMapping("/hello-docker")
    public String getDocker(){
        return "Hello Docker";
    }

}
