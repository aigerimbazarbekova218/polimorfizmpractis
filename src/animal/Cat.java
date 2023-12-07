package animal;

public class Cat extends Animal{
    public Cat(String name, int age, String color) {
        super(name, age, color);
    }

    public Cat() {
    }

    @Override
    public void voice() {
        System.out.println("Cat is Mяу-Мяу");
    }
}
