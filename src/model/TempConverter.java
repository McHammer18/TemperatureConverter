package model;

public class TempConverter {
	private int tempf;
	private double tempc;
	public int getTempf() {
		return tempf;
	}
	public void setTempf(int tempf) {
		this.tempf = tempf;
	}
	public double getTempc() {
		return tempc;
	}
	public void setTempc(double tempc) {
		this.tempc = tempc;
	}
	public TempConverter() {
		super();
		
	}
	public TempConverter(int tempf) {
		super();
		this.tempf = tempf;
		setTemp(tempf);
	}
	
	public void setTemp(int tempf) {
		final double Celcius = 32;
		final double fraction = .55;
		 double temp;
		 double d = new Double(tempf);
		this.tempc = temp = (d - Celcius) * fraction;
		
	}
	
	@Override
	public String toString() {
		return "Temputature Converter [Temp fahrenheit = " + tempf +
				"temp celcius = " + tempc;
	}

	
	
	
}
