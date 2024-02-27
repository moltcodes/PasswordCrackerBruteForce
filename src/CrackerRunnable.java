public class CrackerRunnable implements Runnable{
     char start;
     String pass;


    public CrackerRunnable(char start, String pass) {
        this.start = start;
        this.pass = pass;
    }

    @Override
    public  void run() {
        int len = pass.length();
        String atk = start + "a".repeat(len-1);

        while(!atk.equals(pass) && !Main.isCorrect){
            System.out.println(atk);
            int i;
            for(i = len-1; atk.charAt(i) == 'z'; i--);
            String first = atk.substring(0 , i);
            char next = (char) (atk.charAt(i) + 1);
            String after = "a".repeat(len-i-1);
            atk = first + next + after;
        }

        if(!Main.isCorrect){
            System.out.println(atk);
        }

        Main.isCorrect = true;

    }
}
