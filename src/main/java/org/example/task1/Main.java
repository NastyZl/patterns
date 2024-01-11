package org.example.task1;

import org.example.task1.factories.*;
import org.example.task1.models.Card;
import org.example.task1.models.TypeCard;

public class Main {
    public static void main(String[] args) {
        CardFactory cardFactory = createCardByType(TypeCard.CREDIT);
        Card card = cardFactory.createCard("123456789", 5000);
        card.transfer(500);

        cardFactory = createCardByType(TypeCard.DEBIT);
        card = cardFactory.createCard("987654321", 100_000);
        card.transfer(10_000);
    }

    static CardFactory createCardByType(TypeCard typeCard) {
        switch (typeCard) {
            case DEBIT: {
                return new DebitCardFactory();
            }
            case CREDIT: {
                return new CreditCardFactory();
            }
            default:
                throw new RuntimeException();
        }
    }
}
