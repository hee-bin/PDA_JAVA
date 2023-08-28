package Animal;

/**

- A class representing a chicken, extending Bird class.
*/
public class Chicken extends Bird {
/*
    - Constructs a Chicken with the given name.
    - 
    - @param name The name of the chicken.
    */
    public Chicken(String name) {
    	this.name = name;
    	}
    
    /**
    
    - Makes the chicken fly.
    */
    public void fly() {
    System.out.println("Fly not so far");
    }
    }