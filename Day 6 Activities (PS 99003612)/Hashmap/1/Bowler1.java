public class Bowler1 {
	private String name;

	
	
	public Bowler1(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Bowler [name=" + name + "]";
	}
}	