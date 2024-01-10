package org.example.task2;

public class DecisionProcessor extends BaseHandler {
    @Override
    public boolean handle(Request request) {
        if (!TypeCreditHistory.POOR.equals(request.getCreditHistory()) && request.getIncome()>10000 &&
                request.getIncome()*0.5>request.getMonthlyPayment()) {
            System.out.println("Кредит одобрен клиенту " + request.getFullName() + "!");
            return true;
        } else {
            System.out.print("Кредит не одобрен клиенту " + request.getFullName() + " ");
            return false;
        }
    }
}
