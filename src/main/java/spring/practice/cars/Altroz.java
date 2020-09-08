package spring.practice.cars;

import org.springframework.stereotype.Component;

import spring.interfaces.Car;

@Component
public class Altroz implements Car {

	public String specs() {
		return "Sedan from TATA";
	}

}
