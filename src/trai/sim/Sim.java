package trai.sim;

public interface Sim {


    void calling(int reciverNumber);


    int sendMsgs(int reciverNumber, String msg);

    String dataPacket(String data);



}
