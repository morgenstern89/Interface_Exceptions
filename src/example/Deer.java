package example;

public class Deer extends Animal implements Herbivore{
    //interfaces are implemented in classes
    @Override
    public boolean hasLegs() {
        return true;
    }
}
