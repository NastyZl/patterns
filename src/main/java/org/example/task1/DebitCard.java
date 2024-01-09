package org.example.task1;

import java.math.BigDecimal;

public class DebitCard implements Card {
    private String id;
    private final TypeCard type = TypeCard.DEBIT;
    private BigDecimal balance = BigDecimal.ZERO;
    @Override
    public void transfer(double amount) {
        System.out.println("«Передача на сумму " + amount +  " прошла успешно!» (" + type.toString() + ")");
    }
}
