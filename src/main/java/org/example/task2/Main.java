package org.example.task2;

public class Main {
    public static void main(String[] args) {
        Request request1 = new Request("Иванов И.И.", 21, 150000, TypeCreditHistory.GOOD,
                12.0, 15, 30000, false);
        Request request2 = new Request("Петров П.П.", 21, 150000, TypeCreditHistory.GOOD,
                12.0, 15, 30000, true);
        Request request3 = new Request("Смирнов С.С.", 21, 150000, TypeCreditHistory.POOR,
                12.0, 15, 30000, false);

        BaseHandler completenessCheckHandler = new CompletenessCheckHandler();
        BaseHandler complianceCheckHandler = new ComplianceCheckHandler();
        BaseHandler decisionProcessor = new DecisionProcessor();

        completenessCheckHandler.setNext(complianceCheckHandler);
        complianceCheckHandler.setNext(decisionProcessor);

        completenessCheckHandler.process(request1);
        completenessCheckHandler.process(request2);
        completenessCheckHandler.process(request3);
    }
}
