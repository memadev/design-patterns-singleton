package com.eshaghi.poc.designpatterns.singleton;

public class ContactService {

    private static final ContactService INSTANCE = new ContactService();

    private ContactService() {
    }

    public static ContactService getInstance() {
        return INSTANCE;
    }
}
