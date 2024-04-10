package oc.oose;

import java.awt.Color;

public class Theme {

	private String name;
	private double cost;
	private Color[] colors;

	public String getName() {
		return this.name;
	}

	/**
	 * 
	 * @param name
	 */
	public void setName(String name) {
		this.name = name;
	}

	public double getCost() {
		return this.cost;
	}

	/**
	 * 
	 * @param cost
	 */
	public void setCost(double cost) {
		this.cost = cost;
	}

	public Color[] getColors() {
		return this.colors;
	}

	/**
	 * 
	 * @param colors
	 */
	public void setColors(Color[] colors) {
		this.colors = colors;
	}

}