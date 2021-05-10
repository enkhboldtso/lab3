package lights;
import java.util.List;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue; 

public class RunningHolidayLights implements HolidayLights{
	Queue<Light> lights = new LinkedList<>();
	List<Light> chainLights = new LinkedList<>();
	/**
	 * Creates new running holiday lights.
	 * @param length - length of this set of lights.
	 */
	public void RunningHolidayLights(int length) {
		for(int i=0;i<length;i++)
		{
			Light light = new Light();
			lights.add(light);
		}
	}
	
	public List<Light> next() {
		if(getLength()>0)
		{
			Light light = lights.remove();
			light.setOn(true);
			chainLights.add(light);
		}
		return chainLights;
	}
	
	/**
	 * Returns the length of this
	 * @return length of this
	 */
	public int getLength() {
		if(lights.size()>0)
		{
			return lights.size();
		} 
		else return 0;
	}	
}
