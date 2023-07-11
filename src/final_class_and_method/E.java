package final_class_and_method;

/**
 * E estende D, que por sua vez possui
 * um metodo final.
 */
public class E extends D {
    
    /**
     * Na parte comentada, tentamos sobrescrever
     * um metodo final na classe-base, o que nao eh possivel,
     * portanto isso geraria um erro de compilacao.
     */
    // @Override
    // public void m1() {}
}
