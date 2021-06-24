package com.RPH.SBMSEurekaClientWelcomeAPI;

import com.RPH.SBMSEurekaClientWelcomeAPI.client.GreetFeignClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeAPIController {
    @Autowired
    private GreetFeignClient feignClient;

    @GetMapping("/welcome")
    public String getWelcomemsg(){
        String s = feignClient.invokveGreetAPI();
        return s+" : "+ "Welcome to our world!!";
    }
}
