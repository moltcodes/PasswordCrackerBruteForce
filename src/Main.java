import java.util.Scanner;
import java.util.*;

public class Main {

    public static boolean isCorrect = false;
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        System.out.print("Enter pasword: ");
        String pass  =  sc.nextLine();
        int len = pass.length();
        String atk = "a".repeat(len);

        ArrayList<Thread> threads = new ArrayList<>();

        for (int i = 0; i < 26; i++) {
            threads.add(new Thread(new CrackerRunnable((char)('a' + i), pass)));
        }

        for (int i = 0; i < 26; i++) {
            threads.get(i).start();
        }

    }
}