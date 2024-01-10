package org.example.task2;

public class CompletenessCheckHandler extends BaseHandler{
    @Override
    public boolean handle (Request request){
        if(checkInputIsEmpty(request)){
            System.out.println("Заявка заполнена не полностью!");
        }
        return checkInputIsEmpty(request);
    }
    private boolean checkInputIsEmpty(Request request) {
        return request.getCreditHistory().isEmpty() ||
                request.getFullName().isEmpty() ||
                request.getIncome() == Double.MIN_VALUE ||
                request.getPersonalData().isEmpty() ||
                request.getInterestRate() == Double.MIN_VALUE ||
                request.getLoanTerm() ==  Integer.MIN_VALUE ||
                request.getMonthlyPayment() == Double.MIN_VALUE;
    }
}
