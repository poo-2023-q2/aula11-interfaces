package interfaces;

/**
 * I3 eh uma interface que estende I2. Portanto,
 * uma classe que implemente I3 deve obrigatoriamente
 * implementar todos os metodos tanto de I2 quanto de I3.
 * Note I3 sobrescreve o metodo m3 de I2.
 */
public interface I3 extends I2 {
    String m3();
}
