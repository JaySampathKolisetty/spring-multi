package com.springupgrade.config.impl;

import com.springupgrade.config.ServiceConfigurationInterface;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy
public class ServiceConfigImpl implements ServiceConfigurationInterface {
    public String getConfig() {
        return "Config";
    }
}
