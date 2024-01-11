package org.example.task1.models;

public class DebitCard extends AbstractCard {
    private final TypeCard typeCard = TypeCard.DEBIT;
    public DebitCard(String id, double balance) {
        super(id, balance);
    }

    @Override
    public void transfer(double amount) {
        if (amount>super.getBalance()){
            throw new RuntimeException("На карте недостаточно средсв");
        } else {
            System.out.println("«Передача на сумму " + amount +  " прошла успешно!» (" + typeCard + ")");
        }
    }
}
