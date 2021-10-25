package projectT;

public class camera {
private String brand;
private String modelName;
private String formFactor;
private String skillLevel;
private String jpegQuality;
private String whiteBalanceSettings;
private String shootingModes;
private String lensType;

public camera(String brand,String modelName,String formFactor,String skillLevel, String jpegQuality,String whiteBalanceSettings,String shootingModes, String lensType ) {
	this.brand = brand;
	this.modelName = modelName;
	this.formFactor = formFactor;
	this.skillLevel = skillLevel;
	this.jpegQuality = jpegQuality;
	this.whiteBalanceSettings =whiteBalanceSettings;
	this.shootingModes = shootingModes;
	this.lensType = lensType;
	}

public String getBrand() {
	return brand;
}

public void setBrand(String brand) {
	this.brand = brand;
}

public String getModelName() {
	return modelName;
}

public void setModelName(String modelName) {
	this.modelName = modelName;
}

public String getFormFactor() {
	return formFactor;
}

public void setFormFactor(String formFactor) {
	this.formFactor = formFactor;
}

public String getSkillLevel() {
	return skillLevel;
}

public void setSkillLevel(String skillLevel) {
	this.skillLevel = skillLevel;
}

public String getJpegQuality() {
	return jpegQuality;
}

public void setJpegQuality(String jpegQuality) {
	this.jpegQuality = jpegQuality;
}

public String getWhiteBalanceSettings() {
	return whiteBalanceSettings;
}

public void setWhiteBalanceSettings(String whiteBalanceSettings) {
	this.whiteBalanceSettings = whiteBalanceSettings;
}

public String getShootingModes() {
	return shootingModes;
}

public void setShootingModes(String shootingModes) {
	this.shootingModes = shootingModes;
}

public String getLensType() {
	return lensType;
}

public void setLensType(String lensType) {
	this.lensType = lensType;
}
}
