package sonalilistsort;

public class Country implements Comparable<Country>{

	private String name;
	private Long population;
	private Double area;

	public Country(String name, Long population, Double area) {
		super();
		this.name = name;
		this.population = population;
		this.area = area;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Long getPopulation() {
		return population;
	}

	public void setPopulation(Long population) {
		this.population = population;
	}

	public Double getArea() {
		return area;
	}

	public void setArea(Double area) {
		this.area = area;
	}

	@Override
	public String toString() {
		return "Country [name=" + name + ", population=" + population + ", area=" + area + "]";
	}

	//country1.compareTo(counrty2)
	@Override
	public int compareTo(Country country) {
		int difference = (int) (this.getPopulation()-country.getPopulation());
		System.out.println(this.getName()+" "+country.getName());
		return difference;
	}

}
