package projectT;

public class Pc extends Shop {
	private String cpu;
	private String gpu;
	private String psu;
	private String ram;
	private String motherBoard;
	private String hdd;
	private String pcCase;
	private String cooling;
	// cpu, gpu, psu, ram, motherBoard, hdd, pcCase, cooling
	
	public Pc(String cpu,String gpu,String psu,String ram,String motherBoard,
			String hdd,String pcCase,String cooling,double price,int yearOfProduction, 
			int quantity,String brand, int warranty) {
		
		
		super (price, yearOfProduction, quantity, brand, warranty);	
		this.cpu = cpu;
		this.gpu = gpu;
		this.psu = psu;
		this.ram = ram;
		this.motherBoard = motherBoard;
		this.hdd = hdd;
		this.pcCase = pcCase;
		this.cooling = cooling;
	}

	public String getCpu() {
		return cpu;
	}

	public void setCpu(String cpu) {
		this.cpu = cpu;
	}

	public String getGpu() {
		return gpu;
	}

	public void setGpu(String gpu) {
		this.gpu = gpu;
	}

	public String getPsu() {
		return psu;
	}

	public void setPsu(String psu) {
		this.psu = psu;
	}

	public String getRam() {
		return ram;
	}

	public void setRam(String ram) {
		this.ram = ram;
	}

	public String getMotherBoard() {
		return motherBoard;
	}

	public void setMotherBoard(String motherBoard) {
		this.motherBoard = motherBoard;
	}

	public String getHdd() {
		return hdd;
	}

	public void setHdd(String hdd) {
		this.hdd = hdd;
	}

	public String getPcCase() {
		return pcCase;
	}

	public void setPcCase(String pcCase) {
		this.pcCase = pcCase;
	}

	public String getCooling() {
		return cooling;
	}

	public void setCooling(String cooling) {
		this.cooling = cooling;
	}
}