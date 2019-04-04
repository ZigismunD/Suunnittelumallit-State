public class Charizard implements State {

    @Override
    public void nextState() {
        System.out.println("Pokemon has reached the final form!");
    }

    @Override
    public void makeSound() {
        System.out.println("Charizard!");
    }
}
