package org.example.task1.models;

public enum TypeCard {
    DEBIT("Дебетовая карта"),
    CREDIT("Кредитная карта"),
    ;

    private final String title;

    TypeCard(String title) {
        this.title = title;
    }
    @Override
    public String toString() {
        return title;
    }
}
