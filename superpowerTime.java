// Dinesh is fond of video games. Due to the pandemic, he designs a video game called the Corona world. In this game, the player enters the game with a certain energy. The player should defeat all the corona infected zombies to reach the next level. When time increases the zombies will increase double the previous minute. Anyhow the player can manage to fight against all the zombies. In this case, definitely the player can not achieve the promotion. Hence the player gets a superpower to destroy all the zombies in the current level when the current game time is a palindrome. Anyhow the player can manage only if he knows the time taken to get the superpower. Help the player by providing the minimum minutes needed to get the superpower by which he can destroy all the zombies. You will be provided with the starting time of the game.

// Input Format

// First-line contains a string representing the starting time.

// Constraints

// Input time will be in 24 hours format

// Output Format

// A string representing the minimum minutes needed to get the superpower.

// Sample Input 0

// 05:39
// Sample Output 0

// 11
// Explanation 0

// It takes 11 minutes for minute value to become 50, 05:50 is a palindromic time.
import java.util.*;
public class superpowerTime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String time = sc.next();
        int hr = Integer.parseInt(time.substring(0, 2));
        int min = Integer.parseInt(time.substring(3, 5));
        int minutesWaited = 0;
        while (true) {
            String hrS = (hr < 10 ? "0" : "") + hr;
            String minS = (min < 10 ? "0" : "") + min;
            String candidate = hrS + minS;
            String reverse = new StringBuilder(candidate).reverse().toString();
            if (candidate.equals(reverse)) {
                System.out.println(minutesWaited);
                break;
            }
            minutesWaited++;
            min++;
            if (min == 60) {
                min = 0;
                hr++;
                if (hr == 24) hr = 0;
            }
        }
    }
}
