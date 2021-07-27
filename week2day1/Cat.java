package week2day1;

public class Cat extends Pet {

	private String favoriteWeather;
	
	public Cat() {
		super();
		this.favoriteWeather = "";
	}
	
	public Cat(String name,
				String favoriteFood,
				String favoriteWeather) {
		super(name, favoriteFood, false);
		this.favoriteWeather = favoriteWeather;
	}
	
	@Override
	public void play() {
		System.out.println("Meow! I like to stay at home when it is " + this.favoriteWeather + ".");
	}
	
	@Override
	public String toString() {
		return super.toString() + String.format(" | Favorite Weather: %10s", this.favoriteWeather);
	}
	
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Cat) {
			Cat objCat = (Cat) obj;
			if (super.equals(objCat) &&
				this.favoriteWeather.equals(objCat.favoriteWeather)) {
				return true;
			}
		}
		
		return false;
	}
	

	public String getFavoriteWeather() {
		return favoriteWeather;
	}

	public void setFavoriteWeather(String favoriteWeather) {
		this.favoriteWeather = favoriteWeather;
	}
	
	
	
}
