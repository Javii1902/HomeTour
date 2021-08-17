package fixtures;

abstract class Fixtures {
	String name;
	String shortDescription;
	String longDescription;
	
	public Fixtures(String name, String shortDescription, String longDescription) {
		this.name = name;
		this.shortDescription = shortDescription;
		this.longDescription = longDescription;
	}
}
