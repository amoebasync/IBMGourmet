package model;

public class Store {
	String restaurantID;
	String storeName;
	String nearestOffice;
	String address;
	String openHours;
	int distanceToRestaurant;

	public Store(){

	}

	public Store(String restaurantID, String storeName, String nearestOffice, String address, String openHours, int distanceToRestaurant) {
		this.restaurantID = restaurantID;
		this.storeName = storeName;
		this.nearestOffice = nearestOffice;
		this.address = address;
		this.openHours = openHours;
		this.distanceToRestaurant = distanceToRestaurant;
	}

	public String getRestaurantID() {
		return restaurantID;
	}

	public void setRestaurantID(String restaurantID) {
		this.restaurantID = restaurantID;
	}

	public String getStoreName() {
		return storeName;
	}

	public void setStoreName(String storeName) {
		this.storeName = storeName;
	}

	public String getNearestOffice() {
		return nearestOffice;
	}

	public void setNearestOffice(String nearestOffice) {
		this.nearestOffice = nearestOffice;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getOpenHours() {
		return openHours;
	}

	public void setOpenHours(String openHours) {
		this.openHours = openHours;
	}

	public int getDistanceToRestaurant() {
		return distanceToRestaurant;
	}

	public void setDistanceToRestaurant(int distanceToRestaurant) {
		this.distanceToRestaurant = distanceToRestaurant;
	}

}
