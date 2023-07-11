package final_class_and_method;

/**
 * A parte comentada tenta fazer D estender C, o que nao 
 * eh possivel jah que C eh final, logo isso geraria um
 * erro de compilacao.
 */
public class D {
// public class D extends C {

    /**
     * m1 eh um metodo final, portanto nao pode
     * ser sobrescrito em uma classe derivada.
     */
    public final void m1() {}
}
