package projectT;

public class Laptopi extends Shop{
	private String cpu;
	private String gpu;
	private String ram;
	private String screen;
	private String hdd;
	private String RGB;
	
	public Laptopi (String cpu, String gpu, String ram, String screen, String hdd, String RGB) {
		super(cpu, gpu, psu, ram, motherBoard, hdd, pcCase, cooling);
		this.cpu = cpu;
		this.gpu = gpu;
		this.ram = ram;
		
		//  laptop Laptop = new Laptop();
		// zdr
		//dd
		
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

	public String getRam() {
		return ram;
	}

	public void setRam(String ram) {
		this.ram = ram;
	}

	public String getScreen() {
		return screen;
	}

	public void setScreen(String screen) {
		this.screen = screen;
	}

	public String getHdd() {
		return hdd;
	}

	public void setHdd(String hdd) {
		this.hdd = hdd;
	}

	public String getRGB() {
		return RGB;
	}

	public void setRGB(String rGB) {
		RGB = rGB;
	}
	
}
