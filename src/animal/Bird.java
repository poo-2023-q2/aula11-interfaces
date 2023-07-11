package animal;

public class Bird implements Animal {

    @Override
    public String makeNoise() {
        return "piu piu";
    }

    @Override
    public String eatsWhat() {
        return "seeds";
    }
    
}
