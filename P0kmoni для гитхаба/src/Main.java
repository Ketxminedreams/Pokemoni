import Pokem0n1.*;
import ru.ifmo.se.pokemon.Battle;
public class Main {
    public static void main(String[] args) {
        start();
    }

    private static void start() {
        Battle b = new Battle();
        barboach p1 = new barboach("banan", 20);
        Kartana p2 = new Kartana("Kamen'", 20);
        Pichu p3 = new Pichu("mini", 20);
        Pikachu p4 = new Pikachu("Electronka", 20);
        Raichu p5 = new Raichu("Electronka2",20);
        Whiscash p6 = new Whiscash("Vodn1k", 20);
        b.addAlly(p1);
        b.addAlly(p2);
        b.addAlly(p5);

        b.addFoe(p3);
        b.addFoe(p4);
        b.addFoe(p6);
        b.go();
    }
}
