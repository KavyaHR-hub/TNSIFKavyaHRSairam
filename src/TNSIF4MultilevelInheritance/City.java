package TNSIF4MultilevelInheritance;

public class City extends State {
	private String cityName;
	private long area;
	public City() {
		super();
	}
	public City(String countryName,String countryCap,String stateName,String lang,String cityName, long area) {
		super(countryName,countryCap,stateName,lang);
		this.cityName = cityName;
		this.area = area;
	}
	public String getCityName() {
		return cityName;
	}
	public void setCityName(String cityName) {
		this.cityName = cityName;
	}
	public long getArea() {
		return area;
	}
	public void setArea(long area) {
		this.area = area;
	}
	@Override
	public String toString() {
		return "City [cityName=" + cityName + ", area=" + area + ", toString()=" + super.toString()
				+ ", getCountryName()=" + getCountryName() + ", getCountryCap()=" + getCountryCap() + "]";
	}
	
	
	

}
