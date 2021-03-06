package com.sravya.template;

/**
 * The AirConditionerController is one of the template subclasses
 * of the DeviceController.
 * It only needs to define the turnOffDevice() method.
 *
 */
public class AirConditionerController extends DeviceController {

	@Override
	protected void turnOffDevice() {
		System.out.println("*** Turning off the air conditioner");
	}

}
