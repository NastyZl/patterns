package org.example.task2;

public abstract class BaseHandler implements Handler{
    private Handler next;

    @Override
    public void setNext(Handler next) {
        this.next = next;
    }

    @Override
    public void process(Request request) {
        if (handle(request)) {
            if (next != null) {
                next.process(request);
            }
        } else {
            System.out.println("Заявка отклонена!");
        }
    }
    public abstract boolean handle(Request request);
}
