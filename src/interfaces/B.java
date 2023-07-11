package interfaces;

/**
 * B implementa duas interfaces, I1 e I2. Portanto, 
 * deve implementar todos os metodos de ambas as interfaces.
 * Implementar mais de um interface eh o equivalente a heranca
 * multipla, porem nao ocorre o "diamon problem" pois todos
 * os metodos herdados sao abstratos.
 * 
 */
public class B implements I1, I2 {
    public String m1() {
        return "Implementei o m1";
    }
    public String m2(int p1) {
        return "Implementei o m2 com " + p1;
    }
    @Override
    public String m3() {
        return "Implementei o m3";
    }
}
