public class CopyBot implements RPSLSBot {
    private int lastMove;
    
    public CopyBot() {
        reset();
    }
    public String getBotName() {
        return "CopyBot";
    }
    public String getCoderName() {
        return "Aidan Din";
    }
    public void reset() {
        lastMove = -1;
    }
    public int getMove() {
        if (lastMove == -1) return (int)(Math.random() * 5);
        return lastMove;
    }
    public void opponentsLastMove(int move) {
        lastMove = move;
    }
}
