package org.example.task2;

public interface Handler {
    void setNext(Handler next);

    void process(Request request);
}
