package task2;

public class Call {
    private String calledNumber;
    private int callDuration;

    public Call(String calledNumber, int callDuration) {
        this.calledNumber = calledNumber;
        this.callDuration = callDuration;
    }

    public String getCalledNumber() {
        return this.calledNumber;
    }

    public int getCallDuration() {
        return this.callDuration;
    }
}
