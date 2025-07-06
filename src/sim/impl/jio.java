package sim.impl;

import trai.sim.Sim;

public class jio implements Sim {
    @Override
    public void calling(int reciverNumber) {
        System.out.println("jio number calling " + reciverNumber);

    }

    @Override
    public int sendMsgs(int reciverNumber, String msg) {
        System.out.println("Jio number Calling " + reciverNumber + msg );
        return 0;
    }

    @Override
    public String dataPacket(String data) {

        System.out.println("Jio " + data + " packet");
        return "";
    }
}
