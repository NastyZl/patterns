package org.example.task1;

import org.w3c.dom.ls.LSOutput;

public class Main {
    public static void main(String[] args) {

        CardFactory creditCardFactory = new CreditCardFactory();
        CardFactory debitCardFactory = new DebitCardFactory();

        creditCardFactory.transfer(500);
        debitCardFactory.transfer(1000);
    }
}
