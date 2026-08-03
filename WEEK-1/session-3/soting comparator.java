// PROGRAM
import java.util.*;

// Player class
class Player {
    String name;
    int score;

    Player(String name, int score) {
        this.name = name;
        this.score = score;
    }
}

// Checker class that implements Comparator
class Checker implements Comparator<Player> {

    @Override
    public int compare(Player a, Player b) {

        // Sort by score in descending order
        if (a.score != b.score) {
            return b.score - a.score;
        }

        // If scores are equal, sort by name in ascending order
        return a.name.compareTo(b.name);
    }
}

// Main class
public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        Player[] players = new Player[n];

        // Read player details
        for (int i = 0; i < n; i++) {
            String name = sc.next();
            int score = sc.nextInt();

            players[i] = new Player(name, score);
        }

        // Create Checker object
        Checker checker = new Checker();

        // Sort players using comparator
        Arrays.sort(players, checker);

        // Print sorted players
        for (Player p : players) {
            System.out.println(p.name + " " + p.score);
        }

        sc.close();
    }
}

// INPUT
5
amy 100
david 100
heraldo 50
aakansha 75
aleksa 150


// OUTPUT
aleksa 150
amy 100
david 100
aakansha 75
heraldo 50
