package InterfaceEdible;

public class Chicken extends Animal implements Edible{
    @Override
    public String makeSound(){
        return "Chicken : quạc quạc!";
    }
    @Override
    public String howtoEat(){
        return "Eat eat";
    }
}
