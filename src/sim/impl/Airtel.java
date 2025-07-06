package sim.impl;

import trai.sim.Sim;

public class Airtel implements Sim {


    @Override
    public void calling(int reciverNumber) {

        System.out.println("Airtel number calling" + reciverNumber);
    }

    @Override
    public int sendMsgs(int reciverNumber, String msg) {

        System.out.println("Airtel number"+  reciverNumber +  msg);
        return 0;
    }

    @Override
    public String dataPacket(String dataType) {

        System.out.println("Airtel" +  dataType  + "data");
        return "";
    }
}
