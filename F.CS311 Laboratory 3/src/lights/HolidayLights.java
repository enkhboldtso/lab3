package lights;
import java.util.List;
public interface HolidayLights {

	/**
	 * Appearence of lights at next time slice.
	 * @return 
	 * @return appearence of lights at next time slice.
	 */
	public void RunningHolidayLights(int length);
	public List<Light> next();
	public int getLength();
}
