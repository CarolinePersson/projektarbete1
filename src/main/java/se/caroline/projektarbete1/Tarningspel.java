package se.caroline.projektarbete1;


import java.util.Random;
import java.util.Scanner;
public class Tarningspel {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        System.out.println("Välkommen till tärningspelet \uD83C\uDFB2 ");
        System.out.println("I detta spel är ni två spelare. Den spelare som får högst poäng vinner! ");


        // Här använder jag variabler för att hålla reda på poängen.
        int spelare1Poäng = 0;
        int spelare2Poäng = 0;

        // Tur för spelare 1
        System.out.println("Spelare 1, din tur vänligen  tryck på Enter för att kasta tärningarna...");
        scanner.nextLine();  // Vänta på att spelaren ska trycka på Enter
        int kast1 = random.nextInt(6) + 1; // Första tärning
        int kast2 = random.nextInt(6) + 1; // Andra tärning
        spelare1Poäng = kast1 + kast2;
        System.out.println("Spelare 1 kastade: " + kast1 + " och " + kast2 + ". Totalt: " + spelare1Poäng);

        // Tur för spelare 2
        System.out.println("Spelare 2, tryck på Enter för att kasta tärningarna...");
        scanner.nextLine();
        int kast3 = random.nextInt(6) + 1; // Första tärning
        int kast4 = random.nextInt(6) + 1; // Andra tärning
        spelare2Poäng = kast3 + kast4;
        System.out.println("Spelare 2 kastade: " + kast3 + " och " + kast4 + ". Totalt: " + spelare2Poäng);

        // Här avgörs vinnare, via if metoden.
        if (spelare1Poäng > spelare2Poäng) {
            System.out.println("Spelare 1 vinner med " + spelare1Poäng + " poäng! \uD83D\uDE01");
        } else if (spelare2Poäng > spelare1Poäng) {
            System.out.println("Spelare 2 vinner med " + spelare2Poäng + " poäng! \uD83D\uDE01");
        } else
            System.out.println("Det blev oavgjort!");

        System.out.println("Vänligen starta om spelet och spela igen \uD83E\uDD2A");

        scanner.close();
    }

}
