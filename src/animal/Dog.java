package animal;

/**
 * Dog eh um Carnivore, portanto deve implementar
 * todos os metodos abstratos dessa classe.
 */
public class Dog extends Carnivore {

    @Override
    public String makeNoise() {
        return "au au";
    }
}
