public class Charmander implements State {
    StateContext sc;

    public Charmander(StateContext sc) {
        this.sc = sc;
    }

    @Override
    public void nextState() {
        sc.setState(new Charmeleon(sc));
    }

    @Override
    public void makeSound() {
        System.out.println("Charmander!");
    }
}
