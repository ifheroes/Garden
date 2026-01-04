package com.ifheroes.garden.helper;

import org.bukkit.Location;
import org.bukkit.util.Vector;

public class Area {

	private Vector min;
	private Vector max;
	
	public Area(Location loc1, Location loc2) {
		this(loc1.toVector(), loc2.toVector());
	}
	
	public Area(Vector v1, Vector v2) {
		min = Vector.getMinimum(v1, v2);
		max = Vector.getMaximum(v1, v2);
	}
	
	public Vector getMin() {
		return min;
	}
	
	public Vector getMax() {
		return max;
	}
	
	public boolean isArea(Vector vector) {
		return vector.isInAABB(min, max);
	}
	
}
