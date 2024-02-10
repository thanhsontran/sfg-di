package spring5.guru.sfgdi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import spring5.guru.sfgdi.controllers.ConstructorInjectedController;
import spring5.guru.sfgdi.controllers.I18nController;
import spring5.guru.sfgdi.controllers.PropertyInjectedController;
import spring5.guru.sfgdi.controllers.SetterInjectedController;

@SpringBootApplication
public class SfgDiApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SfgDiApplication.class, args);

		System.out.println("---------- Property");
		PropertyInjectedController propertyInjectedController = (PropertyInjectedController)context.getBean("propertyInjectedController");
		System.out.println(propertyInjectedController.service.getGreeting());

		System.out.println("---------- Settler");
		SetterInjectedController setterInjectedController = (SetterInjectedController)context.getBean("setterInjectedController");
		System.out.println(setterInjectedController.getService().getGreeting());

		System.out.println("---------- Constructor");
		ConstructorInjectedController constructorInjectedController = (ConstructorInjectedController)context.getBean("constructorInjectedController");
		System.out.println(constructorInjectedController.getService().getGreeting());

		System.out.println("---------- I18n");
		I18nController i18nController = (I18nController)context.getBean("i18nController");
		System.out.println(i18nController.getService().getGreeting());

	}

}
