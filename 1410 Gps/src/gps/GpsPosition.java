package gps;

import java.text.DecimalFormat;

/**
 * Class GpsPosition creates position objects for Gps.java client to use
 * 
 * @author SpencerR
 *
 */

public class GpsPosition {

	private double latitude;
	private double longitude;
	private double elevation;

	/**
	 * Fields required for GpsPosition
	 * 
	 * @param latitude
	 * @param longitude
	 * @param elevation
	 */

	/**
	 * Constructs, initializes, and handles errors for newly created objects.
	 * 
	 */
	public GpsPosition(double latitude, double longitude, double elevation) {
		if (latitude >= -90 && latitude <= 90) {
			this.latitude = latitude;
		} else {
			throw new IllegalArgumentException("Invalid latitude and/or longitude");
		}
		if (longitude >= -180 && longitude <= 180) {
			this.longitude = longitude;
		} else {
			throw new IllegalArgumentException("Invalid latitude and/or longitude");
		}
		this.elevation = elevation;
	}

	/**
	 * Gets latitude
	 * 
	 * @return
	 */
	public double getLatitude() {
		return latitude;
	}

	/**
	 * Gets Longitude
	 * 
	 * @return
	 */
	public double getLongitude() {
		return longitude;
	}

	/**
	 * gets Elevation
	 * 
	 * @return
	 */
	public double getElevation() {
		return elevation;
	}

	/**
	 * toString method returns Format: {latitude, longitude (elevation)}
	 */
	@Override
	public String toString() {
		DecimalFormat df6 = new DecimalFormat("#.######"); // 6 decimal places
		DecimalFormat df1 = new DecimalFormat("#.#"); // 1 decimal place
		return df6.format(latitude) + ", " + df6.format(longitude) + " (" + df1.format(elevation) + ")";

	}

}
