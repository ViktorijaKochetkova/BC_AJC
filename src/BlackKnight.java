public class BlackKnight {
    private byte arms = 2;
    private byte legs = 2;
    private byte head=1;
    private boolean alive = true;
    private String name;

    public static int numOfAliveKnights = 0;
    public static int numOfDeadKnights = 0;

    public static BlackKnight[] allKnights = new BlackKnight[10];

    public void cutOfArm(){

        arms --;
} public void cutOfLegs(){

        legs --;
    }

    public void cutOfHead(){

        head --;
    }

    public String toString(){
        return "BlackKnight { " +
                "name is" + name + "\n" +
                "arms is" + arms + "\n" +
                "legs is "+ legs + "\n" +
                "head is "+ head + "\n" +
                "alive is "+ alive + "\n" +
                ")";
    }
    public void strike (){
        if(alive){
            if(arms>0){
                cutOfArm();

            }else if (legs>0){
                cutOfLegs();
            }else {
                cutOfHead();
                alive=!alive;
            }

    }else {
            System.out.println("Stop! He is already dead");}
    }

    public BlackKnight(String name){
        this.name = name;
    }
    //constructor overload
    public BlackKnight(){
        this.name = "Anonymus Knight";
    }
    public static void main (String[] args){
        BlackKnight knight1 = new BlackKnight("Arthur");
        allKnights[0] = knight1;
        BlackKnight.numOfAliveKnights++;
         BlackKnight knight2 = new BlackKnight();
        System.out.println(allKnights[0].toString());
    }


}
