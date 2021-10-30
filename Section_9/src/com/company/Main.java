package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        ITelephone dillansPhone;
        dillansPhone = new DeskPhone(12345);
        dillansPhone.powerOn();
        dillansPhone.callPhone(12345);
        dillansPhone.answer();

        dillansPhone = new MobilePhone(654321);
        dillansPhone.powerOn();
        dillansPhone.callPhone(654321);
        dillansPhone.answer();
    }
}
