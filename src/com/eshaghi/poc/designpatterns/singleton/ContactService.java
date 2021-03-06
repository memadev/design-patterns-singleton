package com.eshaghi.poc.designpatterns.singleton;

public class ContactService {

    private static ContactService INSTANCE;

    private ContactService() {
    }

    public static ContactService getInstance() {
        if (INSTANCE == null) {
            synchronized (ContactService.class) {
                if (INSTANCE == null) {
                    INSTANCE = new ContactService();
                }
            }
        }

        return INSTANCE;
    }
}
