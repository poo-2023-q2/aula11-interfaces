package animal;

/**
 * A interface Animal especifica a API basica que 
 * um animal deve prover. 
 * Classes concretas, representando animais concretos, 
 * devem implementar essa interface.
 * 
 */
public interface Animal {
    String makeNoise();
    String eatsWhat();
    
}
