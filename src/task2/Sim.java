package task2;

import java.util.Arrays;

public class Sim {

    private String phoneNumber;
    private int credit;
    private String[] callList;

    public Sim(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        this.credit = 0;
        this.callList = new String[5];
    }

    public void printSim() {
        System.out.println("This Sim phone number is: " + phoneNumber);
        System.out.println("It has: " + credit + "credit");
        System.out.println("The last 5 calls made were: " + Arrays.toString(callList));
    }
}
