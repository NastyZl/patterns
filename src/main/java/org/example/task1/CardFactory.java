package org.example.task1;

public abstract class CardFactory {
    public abstract Card createCard();
    public void transfer(double amount){
        Card card = createCard();
        card.transfer(amount);
    }
}
