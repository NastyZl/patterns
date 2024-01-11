package org.example.task1.factories;

import org.example.task1.models.Card;
import org.example.task1.models.DebitCard;

public class DebitCardFactory extends CardFactory {
    @Override
    public Card createCard(String id, double balance) {
        System.out.println("Создана новая дебетовая карта");
        return new DebitCard(id, balance);
    }
}
