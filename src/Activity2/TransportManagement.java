package Activity2;

public class TransportManagement {

    public static Road[] allRoads;
    public static Transport[] allTransport;
    public static void initSystem (int numOfRoad,int numOfTransport){
        allRoads = new Road[numOfRoad];
        allTransport = new Transport[numOfTransport];
    }

}