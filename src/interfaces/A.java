package interfaces;

/**
 * A classe implementa a interface I1. Portanto,
 * obrigatoriamente deve implementar/sobrescrever 
 * todos os metodos de I1.
 */
public class A implements I1 {
    
    @Override
    public String m1() {
        return "implemented m1 in A";
    }

    @Override
    public String m2(int p1) {
        return "Implemented m2 in A. Received argument: " + p1;
    }
}
