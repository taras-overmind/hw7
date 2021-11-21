package com.taras.t2;

public class EmailSender {
    public void send(Email email, ILog log) {
        // ... sending...
        log.print(email);
    }
}
