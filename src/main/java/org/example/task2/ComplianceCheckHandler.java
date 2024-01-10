package org.example.task2;

public class ComplianceCheckHandler extends BaseHandler{
    @Override
    public boolean handle(Request request) {
        if (!request.isBlackList()) {
            return true;
        } else {
            System.out.print("Клиент " + request.getFullName() + " в черном списке! ");
            return false;
        }
    }
}
