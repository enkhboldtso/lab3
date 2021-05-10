package lights;

public class Main {
	public static void main(String[]  args) {

		// Create HolidayLights
		RunningHolidayLights hl = new RunningHolidayLights();
		hl.RunningHolidayLights(12);
		// Create and show HolidayLightsWindow
		MyHolidayLights frame = new MyHolidayLights(hl);
		frame.pack();
		frame.setVisible(true);
	}
}
