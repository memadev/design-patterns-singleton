package com.eshaghi.poc.designpatterns.singleton;

public class ContactService {

    private static ContactService INSTANCE;

    private ContactService() {
    }

    public synchronized static ContactService getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new ContactService();
        }

        return INSTANCE;
    }
}
