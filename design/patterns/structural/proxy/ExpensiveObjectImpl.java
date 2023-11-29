package design.patterns.structural.proxy;

public class ExpensiveObjectImpl implements ExpensiveObject {

    public ExpensiveObjectImpl() {
        loadHeavyConfig();
    }

    private void loadHeavyConfig() {
        System.out.println("Loaded heavy config");
    }

    @Override
    public void process() {
        System.out.println("processing heavy object");
    }
}
