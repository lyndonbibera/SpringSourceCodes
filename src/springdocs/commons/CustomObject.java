package springdocs.commons;

public class CustomObject {

	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "CustomObject [name=" + name + "]";
	}
	
}
