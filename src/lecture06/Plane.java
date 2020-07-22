package lecture06;

public class Plane {
	private String manufacture; 
	private String model;
	private int maxNumberOfPassengers;
	private static int numberOfPlanes;
	
	public Plane() {
	}
	
	public Plane(String manufacture,String model,int maxNumberOfPassengers) {
		this.setManufacture(manufacture);
		this.setModel(model);
		this.setMaxNumberOfPassengers(maxNumberOfPassengers);
	}
	
	public String getManufacture() {
		return manufacture;
	}

	public void setManufacture(String manufacture) {
		this.manufacture = manufacture;
		numberOfPlanes+=1;
	}
	
	public String getModel() {
		return model;
	}
	
	public void setModel(String model) {
		this.model = model;
	}

	public int getMaxNumberOfPassengers() {
		return maxNumberOfPassengers;
	}
	
	public void setMaxNumberOfPassengers(int maxNumberOfPassengers) {
		this.maxNumberOfPassengers = maxNumberOfPassengers;
	}

	public int getNumberOfPlanes() {
		return numberOfPlanes;
	}

}


