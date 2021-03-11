import java.util.Random;

public class gameLibrary {
    /**
     * make new superarray
     */
       SuperArray gameList, gameScore;
   public gameLibrary() {
       String[] list = new String[]{"Portal", "CSGO", "Tf2"};
       this.gameList = new SuperArray(list);
       this.gameScore = new SuperArray(gameList.length);

        
   }
   /**
    * Add score to a specific game, 
    * @param index | Int 
    * @param score | Str
    */

    public void add_score(int index, String score) {
        this.gameScore.set(index, score);

    }
    /**
     * @name random_game()
     * @purpose | Random game to play when youa re bored
     * @return String
     */

    public String random_game() {
        String randGame = "";
        Random rand = new Random();

        randGame = this.gameList.get(rand.nextInt(this.gameList.length));

        return randGame;

    }
    /***
     * 
     * @purpose | removes a certain game.
     * @param index
     */

    public void remove_game(int... index) {
        for (int i : index) this.gameList.remove(i);
    }
    /**
     * @purpose | display games.
     */

    public void display_games() {
        System.out.println(this.gameList.toString());
    }
    /**
     * @purpose | add games.
     * @param games
     */

    public void add_game(String... games){
        for (String game : games) {
            this.gameList.add(game);
            this.gameList.grow(1);
        }
        

    }

    /**
     * @purpose add to the back of the gameList
     */
    public void append_game(String... games) {
        add_game(games);

    }
    /**
     * @purpose | removes scores
     * @param scores
     */

    public void remove_score(int... scores) {
        for (int score : scores) this.gameScore.remove(score);

    }

    
}
