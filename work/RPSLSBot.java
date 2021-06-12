public interface RPSLSBot {
    // Returns the name of the bot.
    public String getBotName();

    // Returns the name of the coder (your full name).
    public String getCoderName();

    // Informs the bot that a new match is going to start, allowing it to
    // reset or reinstantiate any necessary instance variables.
    public void reset();

    // Returns the choice of move for the next turn of the bot.
    // Note: this method MUST return a value between 0 and 4, inclusive.
    // 0 = rock, 1 = paper, 2 = scissors, 3 = lizard, 4 = Spock
    public int getMove();

    // Informs the bot of the move just made by the bot's opponent.
    // This information can be used to guide the bot's choice of next move.
    public void opponentsLastMove(int move);
}