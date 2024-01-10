package org.example.task2;

public abstract class BaseHandler implements Handler{
    private Handler next;
    @Override
    public void setNext(Handler next) {
        this.next = next;
    }
    @Override
    public void tooltip(Request request) {
        if (next!=null){
            next.tooltip(request);
        } else {
            System.out.println("Заявка отклонена!!!");
        }
    }
    public abstract boolean handle(Request request);
}
