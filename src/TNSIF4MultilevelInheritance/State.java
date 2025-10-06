//Program to demonstrate MultiLevel Inheritance
package TNSIF4MultilevelInheritance;

public class State extends Country {
	private String stateName;
	private String lang;
	public State() {
	}
	public State(String countryName,String countryCap,String stateName,String lang) {
		super(countryName,countryCap);
		this.stateName = stateName;
		this.lang = lang;
	}
	
	public String getStateName() {
		return stateName;
	}
	public void setStateName(String stateName) {
		this.stateName = stateName;
	}
	@Override
	public String toString() {
		return "State [stateName=" + stateName + ", lang=" + lang + "]";
	}
}	
