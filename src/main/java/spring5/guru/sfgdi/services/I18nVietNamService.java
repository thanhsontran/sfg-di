package spring5.guru.sfgdi.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("VN")
@Service("i18nService")
public class I18nVietNamService implements GreetingService{
    @Override
    public String getGreeting() {
        return "Xin Chao - VN";
    }
}
