package connectfour;

public class Player {
	private char  chip;
	private String name;
	
	public Player(char chip,String name) {
		this.chip=chip;
		this.name=name;
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public char getChip() {
		return chip;
	}

	public void setChip(char chip) {
		this.chip = chip;
	} 
}