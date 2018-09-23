package com.sravya.template;

/**
 * The DeviceController is the base class for the template subclasses.
 * The shutDownSystem() method defines the shutdown algorithm.
 * The abstract turnOffDevice() method is the only method that the 
 * template subclasses must define.
 *
 */
public abstract class DeviceController {
	public void shutDownSystem() {
		turnOffFan();
		turnOffDevice();
		updateSystemStatus();
	}
	
	protected abstract void turnOffDevice();

	private void turnOffFan() {
		System.out.println("*** Turning off the fan");
	}
	
	private void updateSystemStatus() {
		System.out.println("*** Updating the system status");
	}
	
	
}
