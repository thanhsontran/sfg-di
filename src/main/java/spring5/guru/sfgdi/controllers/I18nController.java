package spring5.guru.sfgdi.controllers;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import spring5.guru.sfgdi.services.GreetingService;

@Controller
public class I18nController extends GreetingController{
    public I18nController(@Qualifier("i18nService") GreetingService service){
        this.service = service;
    }

}
