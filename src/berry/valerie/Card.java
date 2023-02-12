package berry.valerie;

public class Card {
	private String name = "";
	private int value;
	
	public Card(String name, int value) {
		this.name = name;
		this.value = value;
	}
	public void describe() { System.out.println(name); }
	public String getName() { return this.name; }
	
	public int getValue() { return value; }
	
	public void setName(String n) { this.name = n; }
	public void setValue(int v) { this.value = v; }
}
