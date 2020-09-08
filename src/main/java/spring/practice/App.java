package spring.practice;


import javax.security.auth.login.AppConfigurationEntry;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import spring.interfaces.Car;
import spring.practice.cars.Altroz;
import spring.practice.cars.Swift;

public class App 
{
    public static void main( String[] args )
    {
    	Car swift = new Swift();
    	Car altroz = new Altroz();
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		//Tell Spring to create instance
		Car myCar = context.getBean("altroz", Car.class);
		
		myCar.specs();
		
		
		System.out.println(myCar.specs());
		context.close();
		
		System.out.println("=================================");
		System.out.println(swift.specs());
		System.out.println(altroz.specs());
    }
}
