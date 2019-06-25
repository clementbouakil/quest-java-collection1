import java.util.*;

public class Thanos {

    public static void main(String[] args) {

        Hero heroOne = new Hero("Black Widow", 34);
        Hero heroTwo = new Hero("Captain America", 100);
        Hero heroThree = new Hero("Vision", 3);
        Hero heroFour = new Hero("Iron Man", 48);
        Hero heroFive = new Hero("Scarlet Witch", 29);
        Hero heroSix = new Hero("Thor", 1500);
        Hero heroSeven = new Hero("Spider-Man", 18);
        Hero heroEight = new Hero("Hulk", 49);
        Hero heroNine = new Hero("Doctor Strange", 42);

        ArrayList<Hero> heroes = new ArrayList<>();
        heroes.add(heroOne);
        heroes.add(heroTwo);
        heroes.add(heroThree);
        heroes.add(heroFour);
        heroes.add(heroFive);
        heroes.add(heroSix);
        heroes.add(heroSeven);
        heroes.add(heroEight);
        heroes.add(heroNine);
        
        heroSix.setAge(1501); // It's Thor birthday, now he's 1501

        // TODO 4 : Shuffle the heroes list

        // TODO 5 : Keep only the half of the list

        // TODO 6 : Loop throught the list and display the name of the remaining heroes
    }
}