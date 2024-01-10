package org.example.task2;

public class CompletenessCheckHandler extends BaseHandler{
    @Override
    public boolean handle (Request request) {
        if (checkInputIsEmpty(request)) {
            System.out.print("Заявка клиента "+ request.getFullName() + " заполнена не полностью! ");
            return false;
        }
        return true;
    }
    private boolean checkInputIsEmpty(Request request) {
        return request.getCreditHistory().toString().isEmpty() ||
                request.getFullName().isEmpty() ||
                request.getIncome() == Double.MIN_VALUE ||
                request.getAge().toString().isEmpty() ||
                request.getInterestRate() == Double.MIN_VALUE ||
                request.getLoanTerm() ==  Integer.MIN_VALUE ||
                request.getMonthlyPayment() == Double.MIN_VALUE;
    }
}
