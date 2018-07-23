package com.mvwchina.imed;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@Controller
public class MVCController {

    private final Logger logger = Logger.getLogger(getClass());

    @RequestMapping(value = "/home" ,method = RequestMethod.GET)
    public String home() {
        return "home";
    }

}