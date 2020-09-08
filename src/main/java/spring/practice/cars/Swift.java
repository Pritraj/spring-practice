package spring.practice.cars;

import org.springframework.stereotype.Component;

import spring.interfaces.Car;

@Component
public class Swift implements Car {

	public String specs() {
		return "Hachback from Suzuki";
	}


}
