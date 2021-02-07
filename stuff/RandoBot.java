public class RandoBot implements RPSLSBot {
    public String getBotName() {
        return "RandoBot";
    }

    public String getCoderName() {
        return "Aidan Din";
    }

    public void reset() {
    }

    public int getMove() {
        return (int) (Math.random() * 5);
    }

    public void opponentsLastMove(int move) {
    }
}