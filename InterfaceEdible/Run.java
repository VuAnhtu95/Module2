package InterfaceEdible;

public class Run {
    public static void main(String[] args) {
        Animal[] animals = new Animal[2];
        animals[0] = new Tiger();
        animals[1] = new Chicken();
        String a = "";
        for (Animal i:animals){
            a = i.makeSound();
            System.out.println(a);
            if (i instanceof Chicken) {
                Edible edible = new Chicken();
                System.out.println(edible.howtoEat());
            }
        }
        Fruit[] fruits = new Fruit[2];
        fruits[0] = new Orange();
        fruits[1] = new Apple();
        for (Fruit fruit : fruits) {
            System.out.println(fruit.howtoEat());
        }
    }
}
