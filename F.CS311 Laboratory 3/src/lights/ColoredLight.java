package lights;

import java.awt.Color;
import java.util.*;

public class ColoredLight extends Light{
	
	Light light;
	Color color;
	
	
	public ColoredLight() {
		// TODO
		this.color=null;
	}
	
	/**
	 * Creates a new colored light.
	 * @param color - color of this light.
	 * @return 
	 */
	public ColoredLight(Color color) {
		// TODO
		if(super.isOn())
		{
			this.color=color;
		}else 
		throw new RuntimeException("ColoredLight(Color) not yet implemented!");
	}
	
	/**
	 * Returns the color of this light.
	 * @return color of this light.
	 */
	public Color getColor() {
		// TODO
		if(super.isOn())
		{
			return color;
		}else
		throw new RuntimeException("ColoredLight.getColor() not yet implemented!");
	}
	
	/**
	 * Changes the color of this light to be c.
	 */
	public void setColor(Color c) {
		// TODO
		if(super.isOn())
		{
			this.color=c;
		}else 
		throw new RuntimeException("ColoredLight.setColor() not yet implemented!");
	}
	
	/**
	 * Check color is set
	 */
	
	public boolean isColored() {
		// TODO
		if(color!=null)
		{
			return true;
		}else return false;
	}
	
	/**
	 * Randomly changes this light to be on or off and its color.
	 */
	@Override
	public void randomChange() {
		// TODO. 
		// Take advantage of Light.randomChange
		Random rand = new Random();
		int randomR = rand.nextInt(255); 
		int randomG = rand.nextInt(255); 
		int randomB = rand.nextInt(255); 
		Color randowColor = new Color(randomR, randomG, randomB);
		color=randowColor;
	}
	public Color randomColor() {
		// TODO. 
		// Take advantage of Light.randomChange
		Random rand = new Random();
		int randomR = rand.nextInt(255); 
		int randomG = rand.nextInt(255); 
		int randomB = rand.nextInt(255); 
		Color randowColor = new Color(randomR, randomG, randomB);
		return randowColor;
	}
	
}
