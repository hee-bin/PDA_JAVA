package Animal;

/**

- A class representing a sparrow, extending Bird class.
*/
public class Sparrow extends Bird {
/*
    - Constructs a Sparrow with the given name.
    - 
    - @param name The name of the sparrow.
    */
    public Sparrow(String name) {
    	this.name = name;
    }
    
    /**
    
    - Makes the sparrow fly.
    */
    public void fly() {
    System.out.println("Fly far");
    }
    }