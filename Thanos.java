import java.util.*;

public class Thanos {

    public static void main(String[] args) {

        ArrayList<Hero> heroes = new ArrayList<>();
        heroes.add(new Hero("Black Widow", 34));
        heroes.add(new Hero("Black Widow", 34));
        heroes.add(new Hero("Vision", 3));
        heroes.add(new Hero("Iron Man", 48));
        heroes.add(new Hero("Scarlet Witch", 29));
        heroes.add(new Hero("Thor", 1500));
        heroes.add(new Hero("Spider-Man", 18));
        heroes.add(new Hero("Hulk", 49));
        heroes.add(new Hero("Doctor Strange", 42));
        
        heroSix.setAge(1501);   // It's Thor birthday, now he's 1501
        Collections.shuffle(heroes);    // Shuffle the heroes list

        // TODO 5 : Keep only the half of the list

        // TODO 6 : Loop throught the list and display the name of the remaining heroes
    }
}