public class bestGames {
    public static void main(String[] args) {
        //I want to organize some games that I like.
        String[] myGameLibrary;
        myGameLibrary = new String[]{"Minecraft", "CSGO", "League", "Valorant"};
        //I transfered my game library from Origin to Steam (library platforms)
        SuperArray steamGames = new SuperArray(myGameLibrary); //steam being the new superArray
        System.out.println(steamGames.toString() + "  | 1 | A new game library ported over from an old one.\n");
        
        //I don't like League anymore so I want to remove it.
        steamGames.remove(2);
        System.out.println(steamGames.toString() + "  | 2 | I hate league, so I remove it from my game library.\n");

        //I gain a bundle of games that I got from valve, the orange box. (Includes hl2, portal2 and tf2)
        steamGames.append("Half Life 2", "Pertal 2", "Team Fortress 2");
        System.out.println(steamGames.toString() + "  | 3 | I gain a bundle of games that I got from valve, the orange box. (Includes hl2, portal2 and tf2)\n");
        
        //turns out "pertal 2" wasn't the actual name so we will have to rename it ourselves.
        steamGames.set(4, "Portal 2"); //## remember, league was dumped so we naturally have one less.
        System.out.println(steamGames.toString() + "  | 4 | turns out \"pertal 2\" wasn't the actual name so we will have to rename it ourselves.\n");
        
        //random hackers got into my pc and deleted every game except valorant.
        steamGames.remove(0, 1, 3, 4, 5);
        System.out.println(steamGames.toString() + "  | 5 | random hackers got into my pc and deleted every game except valorant.\n");
        

        //I buy new games but valve messes up and just gave me blank ones
        steamGames.grow(4);
        System.out.println(steamGames.toString() + "  | 6 | I buy new games but valve messes up and just gave me blank ones. \n");

        //I wanted to see if the new games were empty inside so I used a tool to see if it is
        System.out.println(steamGames.isEmpty(2) + " <-- Empty? " + "  | 6 | I wanted to see if the new games were empty inside so I used a tool to see if they were \n");

        System.out.println("Finally, I had enough and tossed my pc into my bathtub.");

        
       
        

        



      }
    
}
