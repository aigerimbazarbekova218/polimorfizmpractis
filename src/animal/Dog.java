package animal;

public class Dog extends Animal{
    public Dog(String name, int age, String color) {
        super(name, age, color);
    }

    public Dog() {
    }

    @Override
    public void voice() {
        System.out.println("Dog is Гав-Гав");
    }
}
