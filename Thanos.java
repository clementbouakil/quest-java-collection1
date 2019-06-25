import java.util.*;

public class Thanos {

    public static void main(String[] args) {

        ArrayList<Hero> heroes = new ArrayList<>();

        heroes.add(new Hero("Black Widow", 34));
        heroes.add(new Hero("Captain America", 100));
        heroes.add(new Hero("Vision", 3));
        heroes.add(new Hero("Iron Man", 48));
        heroes.add(new Hero("Scarlet Witch", 29));
        heroes.add(new Hero("Thor", 1500)); // indice 5
        heroes.add(new Hero("Spider-Man", 18));
        heroes.add(new Hero("Hulk", 49));
        heroes.add(new Hero("Doctor Strange", 42));

        Hero thor = heroes.get(5);
        thor.setAge(1501);   // It's Thor birthday, now he's 1501
        Collections.shuffle(heroes);    // Shuffle the heroes list

        int length = heroes.size();
        List<Hero> alive = heroes.subList(0, (length/2));

        // METHODE AVEC BOUCLE FOR
        /* for (int i = 0; i < alive.size(); i++) {
            Hero stuff = alive.get(i);
            System.out.println(stuff.getName());
        } */

        // METHODE AVEC FOR EACH
        for (Hero hero : alive) {
            System.out.println(hero.getName());
        }
    }
}