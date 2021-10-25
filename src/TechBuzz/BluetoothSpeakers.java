package projectT;

public class BluetoothSpeakers {

	private String brand;
	private String modelName;
	private String isWaterproof;
	private String colour;
	private String outputPower;
	
	public void BuetoothSpeakers(String brand, String modelName, String isWWaterproof, String colour, String outputPower){
		this.brand = brand;
		this.modelName = modelName;
		this.isWaterproof = isWaterproof;
		this.colour = colour;
		this.outputPower = outputPower;
		
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

	public String getIsWaterproof() {
		return isWaterproof;
	}

	public void setIsWaterproof(String isWaterproof) {
		this.isWaterproof = isWaterproof;
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	public String getOutputPower() {
		return outputPower;
	}

	public void setOutputPower(String outputPower) {
		this.outputPower = outputPower;
	}
}
