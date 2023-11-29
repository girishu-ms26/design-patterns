package design.patterns.behavioural.template;

public class Cricket extends Game {
    @Override
    public void initialize() {
        System.out.println("Cricket Game initialized!");
    }

    @Override
    public void startPlay() {
        System.out.println("Cricket Game started!");
    }

    @Override
    public void endPlay() {
        System.out.println("Cricket Game Finished!");
    }
}
