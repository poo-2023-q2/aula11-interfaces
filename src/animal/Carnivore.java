package animal;

/**
 * Carnivore eh uma classe abstrata, pois nao existe um 
 * carnivoro concreto na natureza, trata-se apenas de
 * uma classe de animais.
 */
public abstract class Carnivore implements Animal {

    /**
     * Diferentes carnivoros fazem sons diferentes, portanto
     * deixamos esse comportamento para ser definido diretamente
     * nas subclasses concretas, por meio da especificacao do 
     * metodo como abstrato.
     */
    @Override
    public abstract String makeNoise();

    /**
     * Sabemos de antemao que todo carnivoro come carne, logo
     * podemos deixar esse implementado que sera herdado
     * por todas as classes derivadas.
     */
    @Override
    public String eatsWhat() {
        return "meat";
    }
    
}
