package org.example.task1.factories;

import org.example.task1.models.Card;

public abstract class CardFactory {
    public abstract Card createCard(String id, double balance);
}
