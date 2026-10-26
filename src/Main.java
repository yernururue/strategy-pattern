public class Main {
    public static void main(String[] args) {
        Location home = new Location(0, 0);
        Location university = new Location(3, 4);

        Navigator navigator = new Navigator(new CarStrategy());
        System.out.println(navigator.planRoute(home, university));

        navigator.setStrategy(new WalkStrategy());
        System.out.println(navigator.planRoute(home, university));

        navigator.setStrategy(new CycleStrategy());
        System.out.println(navigator.planRoute(home, university));
    }
}
