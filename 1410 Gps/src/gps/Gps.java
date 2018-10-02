package gps;

import java.util.ArrayList;
import java.util.Random;

public class Gps {

	/**
	 * Utilizes GpsPosition.java, updates route of GpsPosition objects
	 * 
	 * @author: SpencerR
	 */
	private ArrayList<GpsPosition> route = new ArrayList<GpsPosition>();

	/**
	 * Constructor adds GpsPosition object to ArrayList route
	 * 
	 * @param position
	 */
	public Gps(GpsPosition position) {
		route.add(position);
	}

	/**
	 * returns route
	 * 
	 * @return
	 */
	public ArrayList<GpsPosition> getRoute() {
		return route;
	}

	/**
	 * adds position to route
	 * 
	 * @param position
	 */
	public void update(GpsPosition position) {
		route.add(position);
	}

	/**
	 * adds a random position to route
	 */
	public void randomUpdate() {
		Random rand = new Random();
		double newLatitude = position().getLatitude() + (rand.nextDouble() - 0.5);
		double newLongitude = position().getLongitude() + (rand.nextDouble() - 0.5);
		double newElevation = position().getElevation();
		GpsPosition randomUpdate = new GpsPosition(newLatitude, newLongitude, newElevation);
		route.add(randomUpdate);
	}

	/**
	 * returns current position
	 * 
	 * @return
	 */
	public GpsPosition position() {
		return route.get(route.size() - 1);
	}

	/**
	 * calculates distance in km from one poisition to next
	 * 
	 * @param from
	 * @param to
	 * @return
	 */
	private double distance(GpsPosition from, GpsPosition to) {

		final int R = 6371; // Radius of the earth
		double lat2 = to.getLatitude();
		double lon2 = to.getLongitude();

		double lat1 = from.getLatitude();
		double lon1 = from.getLongitude();

		double latDistance = Math.toRadians(lat2 - lat1);
		double lonDistance = Math.toRadians(lon2 - lon1);
		double a = Math.sin(latDistance / 2) * Math.sin(latDistance / 2) + Math.cos(Math.toRadians(lat1))
				* Math.cos(Math.toRadians(lat2)) * Math.sin(lonDistance / 2) * Math.sin(lonDistance / 2);
		double c = 2 * Math.atan2(Math.sqrt(a), Math.sqrt(1 - a));
		double distance = R * c;

		distance = Math.pow(distance, 2);
		return Math.sqrt(distance);
	}

	/**
	 * calculates total distance traveled between route beginning and route end
	 * 
	 * @return
	 */
	public double distanceTraveled() {
		double totalDistance = 0;
		for (int i = 1; i < route.size(); i++) {
			totalDistance += distance(route.get(i - 1), route.get(i));
		}
		return totalDistance;
	}

	/**
	 * clears the route and sets first element of route to current position
	 */
	public void reset() {
		GpsPosition currentPosition = route.get(route.size() - 1);
		route.clear();
		route.add(currentPosition);
	}
}
