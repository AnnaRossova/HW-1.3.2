public class Main {
    public static void main(String[] args) {
        double balance = 578345.90;
        double transfer = 6779.45;
        int bonus = (int) (transfer / 100);
        int totalbonus;
             if (transfer >= 1000) {
                totalbonus = bonus;}
             else {
                 totalbonus=0;
             }
        System.out.println(totalbonus); }

    }
