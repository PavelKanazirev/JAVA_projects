import java.util.EventObject;

public class FormEvent extends EventObject {

	private String name;
	private String occupation;
	
	public FormEvent(Object _source) {
		super(_source);
	}
	
	public FormEvent(Object _source, String _name, String _occupation) {
		super(_source);

		this.name = _name;
		this.occupation = _occupation;
	}	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getOccupation() {
		return occupation;
	}

	public void setOccupation(String occupation) {
		this.occupation = occupation;
	}

	
}
