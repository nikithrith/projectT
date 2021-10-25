package projectT;

public class TVs {
private String resolution;
private String displayTechnology;
private String screenSize;
private String refreshRate;
private String conectivityTechnology;
private String brand;
public TVs (String resolution, String displayTechnology, String screenSize, String refreshRate, String conectivityTechnology, String brand) {
	
	this.resolution = resolution;
	this.displayTechnology = displayTechnology;
	this.screenSize = screenSize;
	this.refreshRate = refreshRate;
	this.conectivityTechnology = conectivityTechnology;
	this.brand = brand;
	}

public String getBrand() {
	return brand;
}

public void setBrand(String brand) {
	this.brand = brand;
}

public String getResolution() {
	return resolution;
}

public String getConectivityTechnology() {
	return conectivityTechnology;
}

public void setConectivityTechnology(String conectivityTechnology) {
	this.conectivityTechnology = conectivityTechnology;
}

public void setResolution(String resolution) {
	this.resolution = resolution;
}

public String getDisplayTechnology() {
	return displayTechnology;
}

public void setDisplayTechnology(String displayTechnology) {
	this.displayTechnology = displayTechnology;
}

public String getScreenSize() {
	return screenSize;
}

public void setScreenSize(String screenSize) {
	this.screenSize = screenSize;
}

public String getRefreshRate() {
	return refreshRate;
}

public void setRefreshRate(String refreshRate) {
	this.refreshRate = refreshRate;
}
}