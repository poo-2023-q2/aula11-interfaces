package interfaces;

/**
 * A classe C implementa a interface I3. Portanto, 
 * deve implementar todos os metodos de I3, inclusive os 
 * metodos que I3 eventualmente herde de outras interfaces.
 */
public class C implements I3 {

    @Override
    public String m1() {
        return "Implemented m1 in C";
    }

    @Override
    public String m3() {
        return "Implemented m3 in C";
    }
    
}
