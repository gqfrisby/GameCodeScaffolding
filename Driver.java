public class Driver
{
    Player player = new Player();
    Enemy enemy = new Enemy();

    public static void main(String[] args)
    {
        Player player;
        Enemy enemy;
        intro();
    }

    public static void intro(){
        Scanner kb = new Scanner(System.in);
        System.out.println("A strange, ornate letter sits atop your lopsided, peeling table. Very strange, considering you live" +
                "alone. ...And you locked the door before you left this morning. You should read it." +
                "\n'TO WHOM IT MAY CONCERN," +
                "\n[come back]");
    }

    public void battle(Player player, Enemy enemy)
    {

    }
    public String winMessage()
    {
        return "";
    }
    public String lossMessage()
    {
        return "";
    }
    public String introduction()
    {
        return "";
    }
}
