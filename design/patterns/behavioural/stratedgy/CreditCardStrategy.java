package design.patterns.behavioural.stratedgy;

public class CreditCardStrategy implements PaymentStrategy {

    private final String name;
    private final String cardName;
    private final String cvv;
    private final String dateOfExpiry;

    public CreditCardStrategy(String name, String cardName, String cvv, String dateOfExpiry) {
        this.name = name;
        this.cardName = cardName;
        this.cvv = cvv;
        this.dateOfExpiry = dateOfExpiry;
    }

    @Override
    public void pay(int amount) {
        System.out.println(amount +" paid with credit/debit card");
    }
}
