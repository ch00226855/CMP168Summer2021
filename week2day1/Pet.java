package week2day1;

public abstract class Pet {
	
	protected String name;
	protected String favoriteFood;
	protected boolean goesOutside;
	
	public Pet() {
		name = "";
		favoriteFood = "Unspecified";
		goesOutside = false;
	}
	
	public Pet(String name, String favoriateFood, boolean goesOutside) {
		this.name = name;
		this.favoriteFood = favoriateFood;
		this.goesOutside = goesOutside;
	}

	public abstract void play(); // An abstract method does not need a body.
	
	@Override
	public String toString() {
		String output = "";
		
//		output += "Name: " + this.name;
//		output += " | Favorite Food: " + this.favoriteFood;
//		output += " | Like Going Outside: " + this.goesOutside;
		
		// use formated string to create the output.
//		output += String.format("Name: %10s", this.name);
//		output += String.format(" | Favorite Food: %10s", this.favoriteFood);
		
		output = String.format("Name: %10s | Favorite Food: %10s", this.name, this.favoriteFood);
		
		if (this.goesOutside) {
			output += " | Likes Going Outside       ";
		} else {
			output += " | Doesn't Like Going Outside";
		}
				
		return output;
	}
	
	@Override
	public boolean equals(Object obj) {
		// check if obj is also from the same class
		// if yes, type cast obj to this class objPet
		// then compare the attributes of this and objPet
		if (obj instanceof Pet) {
			Pet objPet = (Pet) obj;
			if (this.name.equals(objPet.name) &&
				this.favoriteFood.equals(objPet.favoriteFood) &&
				this.goesOutside == objPet.goesOutside) {
				return true;
			}
		}
		
		return false;
	}
	
	
	
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getFavoriteFood() {
		return favoriteFood;
	}

	public void setFavoriteFood(String favoriteFood) {
		this.favoriteFood = favoriteFood;
	}

	public boolean isGoesOutside() {
		return goesOutside;
	}

	public void setGoesOutside(boolean goesOutside) {
		this.goesOutside = goesOutside;
	}
	
	

}
