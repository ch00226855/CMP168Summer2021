# Week 2 Day 4
# Mid-Term Review and Project Unveiling

# Review of Chapter 8 - 11

- Review class notes on Github
- Review homework assignments
- Practice exercises

### Exercise 1: Create a `Dog` class to represent a dog

- \- name : String
- \- weight: double
- \- height: double
- \- isVaccinated : boolean
- \- ageInDogYears : int

- \+ Dog() 
- \+ getName() : String
- \+ getWeight() : double
- \+ getHeight() : double
- \+ getIsVaccinated() : boolean
- \+ getAgeInDogYears() : int
- \+ setName(String name) : void
- \+ setWeight(double weight) : void
- \+ setHeight(double height) : void
- \+ setIsVaccinated(boolean isVacc) : void
- \+ setAgeInDogYears(int age) : void

### Exercise 2: Create a class to test the `Dog` class

Create a `DogTester` class with a main method so that it can be run.

In the main method of the Tester class, do the following:

1. Create 3 separate instances of a Dog using the default constructor.
2. Set the name of each individual Dog object by using the mutator methods.
3. Set the weight and height on 2 of the Dog instances to values you deem appropriate.
4. Use the accessor/getter methods to print the details from each of the Dog instances.
5 Set values on the other attributes for the Dog instances as well if you like.

Use if statements to test your methods and print “FAILED” or “SUCCESS” depending on whether the values set to the object’s attributes, match the values returned when using the accessor methods.

### Exercise 3: Expand the `Dog` class

Add to the class Dog from Exercise \#1

- \- isValid(int x) : boolean	// helper method, only positive values are valid

- \+ Dog( String name ) 
- \+ Dog( String name, double weight, double height ) 
- \+ Dog( String name, boolean isVaccinated, int age ) 
- \+ Dog( String name, double weight, double height, boolean isVaccinated, int age ) 

- \+ toString() : String
- \+ equals(Object o) : boolean

- \+ speak() : void
- \+ sit() : void
- \+ growTaller() : void		//increase height by 1
- \+ growTaller(double growthAmount) : void

Use the helper method isValid(int x) to prevent invalid values from being set on a Dog, by adding logic to the body of the mutator methods as well as the overloaded constructors.

### Exercise 4: Use `static` variables and methods in a class

Add to the class `Dog`:

- \- **numDogs** : int       0 		// static controlled variable initial value = 0
- \- dogNumber: int		// controlled variable dependent upon numDogs


- \+ **getNumDogs()** : int		// static method
- \+ getDogNumber() : int

Update the default constructor for the Dog class, so that it increments the numDogs then assigns the value to dogNumber

Do not create mutator methods for either numDogs or dogNumber so that they cannot be modified outside the class.

### Exercise 5: Create subclss `ShowDog`

Create a class ShowDog that extends Dog
- \- numTrophies : int		//default value is 0
- \- bestFeature : String		//default value is “unknown”

- \+ ShowDog() 		//default ShowDog name is “Show Dog Doe” //remember to always call the parent constructor 
- \+ ShowDog(String name) 	
- \+ ShowDog(int numTrophies, String bestFeature) 	//
- \+ ShowDog(String name, double wt,double ht, boolean isVac, int age, int numTrophies, String bestFeature) 	

- \+ getNumTrophies() : int
- \+ getBestFeature() : String
- \+ setNumTrophies(int numTrophies) : void
- \+ setBestFeature(String bestFeature) : void
- \+ addTrophy() : void		//increment numTrophies by 1

- \+ isValid(int val) : boolean	//values >=0 are valid

- \+ toString() : String		// super.toString() + "\nShowDog: numTrophies=" + numTrophies + ", bestFeature=" + bestFeature"
- \+ equals(Object o) : boolean

### Exercise 6: Test the `ShowDog` class

Create a `ShowDogTester` class with a main method so that it can be run.

In the main method of the Tester class do the following:

- Create 3 separate instances of the `ShowDog` using the default constructor.
- Set the name of each individual ShowDog object by using the mutator methods from the parent class.
- Set the weight and height on 2 of the ShowDog instances to values you deem appropriate.
- Set the numTrophies and bestFeature on 2 of the ShowDog instances to values you deem appropriate.
- Create 3 separate instances of the ShowDog using each of the 3 overloaded constructors.
- Create an array of ShowDog objects and initialize it to contain all the ShowDogs
- Set values on the attributes for the ShowDog to valid or invalid values to test the mutator methods.
- Iterate through the array and use the `toString` methods to print the details from each of the ShowDog instances.

### Exericse 7: Abstract class `Person`




