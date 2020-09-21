package co.com.informatica.solidexamplerest.dto;

public class SimpleDTO {
	private int in;
	private String description;
	
	public SimpleDTO() {
		
	}
	
	public SimpleDTO(int in, String description) {
		super();
		this.in = in;
		this.description = description;
	}

	public int getIn() {
		return in;
	}

	public void setIn(int in) {
		this.in = in;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	
	

}
