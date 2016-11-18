package controllers;

import actors.Alarm;
import interfaces.Controller;

public class AlarmController {
	
	Alarm alarm = new Alarm();
	
	public AlarmController() {
		
	}
	
	public void action(boolean alien) {
		
		if(alien==true) {
			alarm.setOn();
		}
		else{
			alarm.setOff();
		}
	}
}
