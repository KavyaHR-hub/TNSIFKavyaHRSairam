//Program to demonstrate MultiLevel Inheritance
package TNSIF4MultilevelInheritance;

public class Country {
	private String countryName;
	private String countryCap;
	public String getCountryName() {
		return countryName;
	}
	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}
	public String getCountryCap() {
		return countryCap;
	}
	public void setCountryCap(String countryCap) {
		this.countryCap = countryCap;
	}
	public Country() {

	}
	public Country(String countryName, String countryCap) {
		super();
		this.countryName = countryName;
		this.countryCap = countryCap;
	}
	@Override
	public String toString() {
		return "Country [countryName=" + countryName + ", countryCap=" + countryCap + "]";
	}
	

}
