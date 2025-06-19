package task2;

import java.util.Arrays;

public class Task2 {
    public static void main(String[] args) {
        Sim voxi = new Sim("3501151953");

        Call callRobin = new Call("38850116741", 10);
        Call callTed = new Call("34543976513", 2);
        Call callBarney = new Call("37183945134", 54);
        Call callLily = new Call("35011234311", 43);
        Call callMarshall = new Call("33894392384", 5);

        Call[] lastFiveCalls = new Call[5];
        lastFiveCalls[0] = callRobin;
        lastFiveCalls[1] = callTed;
        lastFiveCalls[2] = callBarney;
        lastFiveCalls[3] = callLily;
        lastFiveCalls[4] = callMarshall;

        voxi.setCallList(lastFiveCalls);
        voxi.printSim();


    }
}
