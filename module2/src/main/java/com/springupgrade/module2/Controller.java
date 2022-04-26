package com.springupgrade.module2;

import com.springupgrade.config.ServiceConfigurationInterface;
import com.springupgrade.config.UpgradeTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class Controller {

    @Autowired
    private ServiceConfigurationInterface serviceConfigurationInterface;

    @Autowired
    private UpgradeTest upgradeTest;

    @GetMapping("/me")
    public String helloWorld(){
        return serviceConfigurationInterface.getConfig();
    }
}
