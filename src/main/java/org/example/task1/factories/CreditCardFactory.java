package org.example.task1.factories;

import org.example.task1.models.Card;
import org.example.task1.models.CreditCard;

public class CreditCardFactory extends CardFactory {

    @Override
    public Card createCard(String id, double balance) {
        System.out.println("Создана новая кредитная карта");
        return new CreditCard(id, balance);
    }
}
