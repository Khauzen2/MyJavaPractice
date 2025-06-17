import java.util.Scanner;

public class musicPlayer {
    public static void main(String[] args) {
        for (;;) {
            System.out.println("Welcome to my music player");
            String[] songs = { "Almost Famours by Eminem", "In The Club by 50 cent", "Dogg Pound by Snoop Dogg",
                    "Cheers by Obie Trice" };
            Scanner input = new Scanner(System.in);
            System.out.println("Please select your song below");
            System.out.println("1 - Almost Famous by Eminem");
            System.out.println("2 - In The Club by 50 cents");
            System.out.println("3 - Dogg Pound by Snoop Dogg");
            System.out.println("4 - Cheers by Obie Trice");
            int option = input.nextInt();
            if (option == 1) {
                System.out.println(songs[0]);
                nowPlaying();
            } else if (option == 2) {
                System.out.println(songs[1]);
                nowPlaying();
            } else if (option == 3) {
                System.out.println(songs[2]);
                nowPlaying();
            } else if (option == 4) {
                System.out.println(songs[3]);
                nowPlaying();
            } else {
                System.out.println("INVALID! Please select from track 1 - 4");
            }
        }

    }

    public static void nowPlaying() {
        System.out.println(" is now playing...");
    }
}
