package com.yoprogramo;

public class Tester {

    public static void main(String[] args) {
        // write your code here

        new Tester();
    }

    public Tester() {
        Phone landLinePhone = new Phone();
        SmartPhone smartPhone = new SmartPhone();
        System.out.println("About to test a land line phone " +
                "as a phone...");
        testPhone(landLinePhone);
        System.out.println("\nAbout to test a smart phone " +
                "as a phone...");
        testPhone(smartPhone);
        System.out.println("\nAbout to test a smart phone " +
                "as a smartphone...");
        testSmartPhone(smartPhone);


    }

    private void testPhone(Phone phone) {
        phone.callNumber(5559869447L);
        phone.isRinging();
    }

    private void testSmartPhone(SmartPhone phone) {
        phone.sendEmail("Hi", "yoprogramo83@gmail.com");
    }

}
