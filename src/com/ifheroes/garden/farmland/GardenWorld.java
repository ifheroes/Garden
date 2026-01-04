package com.ifheroes.garden.farmland;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

import org.bukkit.Location;

public class GardenWorld {

	private Set<FarmLand> farmLand = new HashSet<>();
	
	public Optional<FarmLand> getFarmLand(Location loc) {
		return farmLand.stream().filter(f -> f.getArea().isArea(loc.toVector())).findFirst();
	}
	
}
