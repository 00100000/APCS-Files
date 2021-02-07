public class RockPaperScissorsLizardSpock {
    public static void main(String[] args) {
        playRPSLSMatch(new HardcodeCasesBot(), new RockBot(), 100, true);
        playRPSLSMatch(new HardcodeCasesBot(), new CopyBot(), 100, true);
        playRPSLSMatch(new HardcodeCasesBot(), new RepeatUntilLossBot(), 100, true);
    }

    public static int judgeRPSLS(int player1move, int player2move) {
        if (player1move < 0 || player1move > 4 || player2move < 0 || player2move > 4) {
            throw new IllegalArgumentException();
        }

        if (player1move == player2move)
            return 0;
        if (player1move == 0) {
            if (player2move == 2 || player2move == 3)
                return 1;
            return 2;
        } else if (player1move == 1) {
            if (player2move == 0 || player2move == 4)
                return 1;
            return 2;
        } else if (player1move == 2) {
            if (player2move == 1 || player2move == 3)
                return 1;
            return 2;
        } else if (player1move == 3) {
            if (player2move == 1 || player2move == 4)
                return 1;
            return 2;
        } else if (player1move == 4) {
            if (player2move == 0 || player2move == 2)
                return 1;
            return 2;
        }
        return 0;
    }

    public static void playRPSLSMatch(RPSLSBot player1, RPSLSBot player2, int numGames, boolean verbose) {
        int p1Wins = 0, p2Wins = 0;

        player1.reset();
        player2.reset();

        for (int i = 0; i < numGames; i++) {
            // get moves and determine result
            int p1Move = player1.getMove();
            int p2Move = player2.getMove();
            int result = judgeRPSLS(p1Move, p2Move);
            // record winner and print out winner if verbose
            if (result == 0) {
                if (verbose) {
                    System.out.println(i + ". " + player1.getBotName() + ": " + verbosify(p1Move) + "\t"
                            + player2.getBotName() + ": " + verbosify(p2Move) + "\tIt's a tie!");
                }
            } else if (result == 1) {
                p1Wins++;
                if (verbose) {
                    System.out.println(i + ". " + player1.getBotName() + ": " + verbosify(p1Move) + "\t"
                            + player2.getBotName() + ": " + verbosify(p2Move) + "\t" + player1.getBotName() + " wins!");
                }
            } else {
                p2Wins++;
                if (verbose) {
                    System.out.println(i + ". " + player1.getBotName() + ": " + verbosify(p1Move) + "\t"
                            + player2.getBotName() + ": " + verbosify(p2Move) + "\t" + player2.getBotName() + " wins!");
                }
            }
            // pass moves to each bot
            player1.opponentsLastMove(p2Move);
            player2.opponentsLastMove(p1Move);
        }

        if (verbose) System.out.println("");
        // print match results
        System.out.println(player1.getBotName() + ": " + p1Wins + "\n" + player2.getBotName() + ": " + p2Wins + "\n"
                + (p1Wins == p2Wins ? "It's a tie!"
                    : p1Wins > p2Wins ? player1.getBotName() + " wins!" :
                        "\t" + player2.getBotName() + " wins!"));
        System.out.println(
                "Player 1 Coder Name: " + player1.getCoderName() + "\nPlayer 2 Coder Name: " + player2.getCoderName());
    }

    static String verbosify(int n) {
        switch (n) {
            case 0:
                return "Rock";
            case 1:
                return "Scissors";
            case 2:
                return "Paper";
            case 3:
                return "Lizard";
            case 4:
                return "Spock";
        }
        return "";
    }
}