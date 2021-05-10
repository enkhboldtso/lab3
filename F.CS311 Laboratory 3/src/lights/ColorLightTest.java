package lights;
import static org.junit.Assert.assertThrows;
import java.awt.Color;
import org.junit.Assert;
import org.junit.Test;

public class ColorLightTest {

	public String expectedMessage = "ColoredLight(Color) not yet implemented!";

	@Test public void makeNoColoredLight() {
		ColoredLight light =new ColoredLight();
		light.setOn(true);
		
		Assert.assertFalse(light.isColored());
	}
	
	@Test public void makeLightColored() {
		ColoredLight light = new ColoredLight();
		light.setOn(true);
		light.setColor(Color.red);
		Assert.assertTrue(light.isColored());
	}

	@Test public void setLightColor() {
		ColoredLight light =new ColoredLight();
		light.setOn(true);
		light.setColor(Color.blue);
		
		Assert.assertTrue(light.isColored());
	}
	
	@Test public void turnOffLight() {
		ColoredLight light =new ColoredLight();
		light.setOn(false);
		
		Assert.assertFalse(light.isColored());
	}
	
	@Test public void turnOnOnlyOneLight() {
		Light firstLight = new Light();
		Light secondLight = new Light();
		
		firstLight.setOn(true);
		
		Assert.assertTrue(firstLight.isOn());
		Assert.assertFalse(secondLight.isOn());
	}
	
	@Test public void testRandomChange() {
		Light light = new Light(false);
		// Call randomChange up to 100 times.
		// Probabilistically, should turn on at some point.
		boolean lightChanged = false;
		for (int i = 0; i < 100; i++) {
			light.randomChange();
			if (light.isOn()) {
				lightChanged = true;
				break;
			}
		}
		Assert.assertTrue(lightChanged);
		
		// Make sure it can change the other way
		light = new Light(true);
		// Call randomChange up to 100 times.
		// Probabilistically, should turn on at some point.
		lightChanged = false;
		for (int i = 0; i < 100; i++) {
			light.randomChange();
			if (!light.isOn()) {
				lightChanged = true;
				break;
			}
		}
		Assert.assertTrue(lightChanged);
	}
}
