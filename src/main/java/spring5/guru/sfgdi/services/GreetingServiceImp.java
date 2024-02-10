package spring5.guru.sfgdi.services;

import org.springframework.stereotype.Service;

@Service
public class GreetingServiceImp implements GreetingService{
    @Override
    public String getGreeting() {
        return "Hello World!";
    }
}
