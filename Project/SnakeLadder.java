class Player
{
    boolean flag = false;
    int counter = 0;
    int position = 0;
    int Dice = 0;
    String playerName;

    Player(String playerName)
    {
        this.playerName = playerName;
    }

    synchronized public void rollDice()
    {
        Dice = 1 + ((int)(Math.random() * 6));
        
        if(!flag && Dice == 1)
        {
            flag = true;
        }
    }
}

public class SnakeLadder
{
    static boolean checkWinner(Player p)
    {
        if(p.position == 100) return true;
        else return false;
    }
    static void movePointer(Player p)
    {
        if(!p.flag)
        {
            System.out.println(p.playerName +" Position is      : "+ p.position);
            return;
        }

        if((p.position + p.Dice) > 100)
        {
            System.out.println(p.playerName +" Position is      : "+ p.position);
            return;
        }

        p.position = p.position + p.Dice;
        switch(p.position)
        {
            // for Ladders 
            case 6: p.position = p.position + 25;break;
            case 21: p.position = p.position + 69;break;
            case 29: p.position = p.position + 12;break;
            case 46: p.position = p.position + 7;break;
            case 60: p.position = p.position + 11;break;
            case 76: p.position = p.position + 19;break;

            //for Snakes
            case 99: p.position = p.position - 15;break;
            case 97: p.position = p.position - 18;break;
            case 94: p.position = p.position - 38;break;
            case 14: p.position = p.position - 7;break;
            case 35: p.position = p.position - 15;break;
            case 59: p.position = p.position - 16;break;
            case 66: p.position = p.position - 38;break;
        } 

        System.out.println(p.playerName +" Position is      : "+ p.position);
    }
    public static void main(String[] args)
    {
        Player p1 = new Player("Aryan");
        Player p2 = new Player("Neel");

        while(true)
        {
            p1.rollDice();
            movePointer(p1);
            if(checkWinner(p1))
            {
                System.out.println("--------------------------------------");
                System.out.println("Winner : "+p1.playerName);
                break;
            }

            try{Thread.sleep(500);}catch(Exception ex){}

            p2.rollDice();
            movePointer(p2);
            if(checkWinner(p2))
            {
                System.out.println("--------------------------------------");
                System.out.println("Winner : "+p2.playerName);
                break;
            }

            try{Thread.sleep(500);}catch(Exception ex){}
            System.out.println("--------------------------------------");
        }
    }
}