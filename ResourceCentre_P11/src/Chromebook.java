
public class Chromebook extends Item{
	private String os;

	public Chromebook(String assetTag, String description, String os) {
		super(assetTag, description);
		this.os = os;
	}

	public String getOs() {
		return os;
	}
	
	public String toString(){
		String cbInfo = super.toString();
		String output = String.format("%-63s %-20d", cbInfo, os);
		// Write your codes here
		return output;
	}
}


