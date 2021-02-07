import java.util.ArrayList;

public class HardcodeCasesBot implements RPSLSBot {
    int counterStrategy = -1;
    int lastMove = 0;
    int lastOpponentMove = 0;
    ArrayList<Integer> lastOpponentMoves = new ArrayList<Integer>();
    ArrayList<Integer> lastMyMoves = new ArrayList<Integer>();

    public String getBotName() {
        return "HardcodeCasesBot";
    }

    public String getCoderName() {
        return "Aidan Din";
    }

    public void reset() {
        counterStrategy = -1;
        // -1 = play randoms and try to figure out strategy
        // 0 = unrecognized strategy
        // 1 = counter RockBot
        // 2 = counter CopyBot
        // 3 = counter RepeatUntilLossBot
        lastMove = 0;
        lastOpponentMove = 0;
        lastOpponentMoves.clear();
        lastMyMoves.clear();
    }

    public int getMove() {
        if (counterStrategy == -1) {
            // try to find strategy in first 10 moves
            int move = (int) (Math.random() * 5);
            lastMyMoves.add(move);
            if (lastOpponentMoves.size() == 10) {
                tryToFindPattern();
            }
            return move;
        } else if (counterStrategy == 0) {
            // play randoms if no strategy found
            return (int) (Math.random() * 5);
        } else if (counterStrategy == 1) {
            // beat RockBot by playing paper
            return 1;
        } else if (counterStrategy == 2) {
            // beat CopyBot by sticking it in a loss loop
            if (lastMove == 0) {
                lastMove = 1;
                return 1;
            } else if (lastMove == 1) {
                lastMove = 2;
                return 2;
            } else if (lastMove == 2) {
                lastMove = 0;
                return 0;
            }
            // beat RepeatUntiLossBot by finding what it will play next, and what beats it
        } else if (counterStrategy == 3) {
            if (judgeMatch(lastMove, lastOpponentMove) != 1) {
                for (int i = 0; i < 5; i++) {
                    if (judgeMatch(i, lastOpponentMove) == 1) {
                        lastMove = i;
                        return i;
                    }
                }
            } else {
                for (int i = 0; i < 5; i++) {
                    if (judgeMatch(i, (lastOpponentMove + 1) % 5) == 1) {
                        lastMove = i;
                        return i;
                    }
                }
            }
        }
        return (int) (Math.random() * 5);
    }

    public void opponentsLastMove(int move) {
        if (counterStrategy == -1) {
            lastOpponentMoves.add(move);
        }
        if (counterStrategy == 3) {
            lastOpponentMove = move;
        }
    }

    void tryToFindPattern() {
        // check for rock bot
        int rockCount = 0;
        for (int i = 0; i < lastOpponentMoves.size(); i++) {
            if (lastOpponentMoves.get(i) == 0) {
                rockCount++;
            }
        }
        if (rockCount == lastOpponentMoves.size()) {
            counterStrategy = 1;
            return;
        }
        // check for CopyBot
        int copyCount = 0;
        for (int i = 0; i < lastOpponentMoves.size() - 1; i++) {
            if (lastMyMoves.get(i) == lastOpponentMoves.get(i + 1)) {
                copyCount++;
            }
        }
        if (copyCount == lastOpponentMoves.size() - 1) {
            counterStrategy = 2;
            return;
        }
        // check for RepeatUntilLossBot
        int repeatCount = 0;
        for (int i = 0; i < lastOpponentMoves.size() - 1; i++) {
            if (judgeMatch(lastMyMoves.get(i), lastOpponentMoves.get(i)) == 1) {
                if ((lastOpponentMoves.get(i) + 1) % 5 == lastOpponentMoves.get(i + 1)) {
                    repeatCount++;
                }
            } else {
                if (lastOpponentMoves.get(i) == lastOpponentMoves.get(i + 1)) {
                    repeatCount++;
                }
            }
        }
        if (repeatCount == lastOpponentMoves.size() - 1) {
            counterStrategy = 3;
            return;
        } else {
        }
    }

    static int judgeMatch(int player1move, int player2move) {
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
}