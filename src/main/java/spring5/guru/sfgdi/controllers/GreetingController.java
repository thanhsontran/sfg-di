package spring5.guru.sfgdi.controllers;

import spring5.guru.sfgdi.services.GreetingService;

public class GreetingController {
    GreetingService service;

    public GreetingService getService() {
        return service;
    }
}
