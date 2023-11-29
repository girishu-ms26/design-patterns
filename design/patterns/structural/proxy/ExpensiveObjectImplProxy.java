package design.patterns.structural.proxy;

public class ExpensiveObjectImplProxy implements ExpensiveObject {
    private ExpensiveObject expensiveObject;

    @Override
    public void process() {
        if(expensiveObject==null) {
            expensiveObject = new ExpensiveObjectImpl();
        }
        expensiveObject.process();
    }

    public static void main(String[]args) {
        ExpensiveObject expensiveObjectTest = new ExpensiveObjectImplProxy();
        expensiveObjectTest.process();
        expensiveObjectTest.process();
    }
}
