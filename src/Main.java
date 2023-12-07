import animal.Animal;
import animal.Cat;
import animal.Cow;
import animal.Dog;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Maximum maximums= new Maximum(4,6,7,new int[]{3,4,5});
        System.out.println(maximums);
        maximums.max(maximums.getA(), maximums.getB());
        maximums.max1(maximums.getA(), maximums.getB(), maximums.getC());
        maximums.maximum(maximums.getMaximum());


        Cow cow=new Cow("Lui",2," orange");
        Cow cow1=new Cow("Mark",1," brown");

        Cat cat = new Cat("Masha", 3,"pink");
        Cat cat1 = new Cat("Lui",2," orange");

        Dog dog = new Dog("Oscar",4,"grey");
        Dog dog1=new Dog("Rex",2," orange");

        Animal[] animal2={cat,cat1,dog1,dog,cow1,cow};

        for (Animal animal3 : animal2) {
            if(animal3.getClass().getName().equals("animal.Cat")){
                animal3.voice();
        }else if (animal3 instanceof Dog){
                animal3.voice();
            }else if(animal3 instanceof Cow){
                animal3.voice();
            }


        }
    }

}