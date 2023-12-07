package animal;

public class Cow extends Animal{
    public Cow(String name, int age, String color) {
        super(name, age, color);
    }

    public Cow() {
    }

    @Override
    public void voice() {
        System.out.println(" Cow is MOO-MOO");
    }
}
