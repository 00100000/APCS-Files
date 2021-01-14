public class MonteCarlo {
    public static void main(String[]args) {
        double win = 0;
        for (int i = 0; i < 1000000; i++) {
            if(rollEm()) win++;
        }
        System.out.println(win/1000000);
    }
    public static int roll() {
        return (int)(Math.random()*6) + 1;
    }
    public static boolean rollEm() {
        for(int i = 0 ; i < 4; i++) {
            if(roll() == 6) return false;
        }
        return true;
    }
}