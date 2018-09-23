package com.sravya.template;

/**
 * The HeatPumpController is one of the template subclasses
 * of the DeviceController.
 * It only needs to define the turnOffDevice() method.
 *
 */
public class HeatPumpController extends DeviceController {

	@Override
	protected void turnOffDevice() {
		System.out.println("*** Turning off the heat pump");
	}

}
