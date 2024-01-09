package org.example.task1;

import java.math.BigDecimal;

public class CreditCard implements Card{
    private String id;
    private final TypeCard type = TypeCard.CREDIT;
    private double balance;

    @Override
    public void transfer(double amount) {
        System.out.println("«Передача на сумму " + amount +  " прошла успешно!» (" + type.toString() + ")");
    }
}
