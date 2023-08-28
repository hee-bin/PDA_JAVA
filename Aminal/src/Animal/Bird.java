package Animal;

/**
 * An abstract class representing a bird
 *   
 * @author heebin
 * @since 2023-08-24
 * @see Ifliable
 */
public abstract class Bird extends Animal implements Ifliable {
    /**
     * 
     * 
     * 
     * 
     * The name of the bird.
     */
    String name = "bird";

    /**
     * Introduces the bird.
     * 
     * The name of the bird.
     */
    public void introduc() {
        System.out.println("I'm a " + name);
    }

    /**
     * Makes the bird fly.
     */
    public void fly() {
        System.out.println("Fly...");
    }
}
