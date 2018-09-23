package com.sravya.template;

public class Driver {

	public static void main(String[] args) {
		// shut down the HeatPumpController
		System.out.println("Shutting down the heat pump");
		DeviceController controller = new HeatPumpController();
		controller.shutDownSystem();

		// shut down the AirConditionerController
		System.out.println("Shutting down the air conditioner");
		controller = new AirConditionerController();
		controller.shutDownSystem();
	}

}
