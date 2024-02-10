package spring5.guru.sfgdi.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import spring5.guru.sfgdi.services.GreetingService;

@Controller
public class PropertyInjectedController extends  GreetingController{
    @Autowired
    public GreetingService service;
}
