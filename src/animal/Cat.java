package animal;

/**
 * Cat eh carnivoro, portanto deve implementar
 * todos os metodos abstratos de Carnivore.
 */
public class Cat extends Carnivore {

    @Override
    public String makeNoise() {
        return "miau";
    }
    
}
