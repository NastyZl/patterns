package org.example.task1;

public class DebitCardFactory extends CardFactory{
    @Override
    public Card createCard() {
        System.out.println("Создана новая дебетовая карта");
        return new DebitCard();
    }
}
