package org.example.task1;

public class CreditCardFactory extends CardFactory{

    @Override
    public Card createCard() {
        System.out.println("Создана новая кредитная карта");
        return new CreditCard();
    }
}
