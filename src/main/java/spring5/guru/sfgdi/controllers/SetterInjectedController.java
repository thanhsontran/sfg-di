package spring5.guru.sfgdi.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import spring5.guru.sfgdi.services.GreetingService;

@Controller
public class SetterInjectedController extends GreetingController{
    @Autowired
    public void setGreetingService(@Qualifier("greetingServiceImp") GreetingService service){
        this.service = service;
    }

}
