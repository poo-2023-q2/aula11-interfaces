package interfaces;

/**
 * Uma classe pode estender no maximo uma outra classe, 
 * mas pode implementar uma ou mais interfaces, concretizando assim
 * o equivalente a herança multipla.
 */
public class D extends A implements I2 {

    @Override
    public String m3() {
        return "Implemented m3 in D";
    }
    
}
