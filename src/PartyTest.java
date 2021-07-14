import java.util.Random;
import java.util.Scanner;

public class PartyTest {

    public static void main(String[] args) {

        // instantiate the party
        //   object
        // create a new random object
        // set that random object
        //   for the use of hero class
        Party party = new Party();
        Random aRandom = new Random();
        Hero.setRandom(aRandom);

        // create an array of
        //   valid class names
        String[] validClassNames = {"Bruiser", "Healer", "Assassin",
                "Support", "Tank"};

        // create 4 hero objects
        // I used "Arianna Holland",
        // "Claude Wolf", "Calista Truong"
        // and "Che Woods" as names
        // from name-generator
        Hero[] heroObject = new Hero[4];
        heroObject[0] = new Hero("Arianna Holland");
        heroObject[1] = new Hero("Claude Wolf");
        heroObject[2] = new Hero("Calista Truong");
        heroObject[3] = new Hero("Che Woods");

        // create a scanner object
        // get input from keyboard
        // go through each hero
        // display the choices
        Scanner aScanner = new Scanner(System.in);
        for (Hero value : heroObject) {
            for (int ctr2 = 0; ctr2 < validClassNames.length; ++ctr2) {

                // note that in Java
                // indices start at 0
                // so add 1 to start at 1
                System.out.println((ctr2 + 1) + ". " + validClassNames[ctr2]);
            }
            System.out.println(value);

            // chosenClass holds the
            //   chosen class for that hero
            // loop
            // get input
            // if input is a valid integer
            //   and input has a valid class
            //   name, set the class name
            //   for that hero and exit
            //   the loop
            // otherwise continue with
            //   the loop
            int chosenClass;
            while (true) {
                System.out.print("Choose a class for the hero.  Enter a number: ");
                try {
                    chosenClass = Integer.parseInt(aScanner.nextLine());
                    if ((chosenClass >= 1) &&
                            (chosenClass <= validClassNames.length)) {
                        value.setHClass(
                                validClassNames[chosenClass - 1]);
                        break;
                    }
                } catch (NumberFormatException ignored) {
                }
            }
            System.out.println();
        }

        // close the scanner object
        // display all hero information
        aScanner.close();

        for (Hero hero : heroObject) {
            System.out.println(hero);
        }
        System.out.println();

        // test the party
        // since you can only add 3 heroes
        //   add the first 3
        // display party information
        party.addHero(0, heroObject[0]);
        party.addHero(1, heroObject[1]);
        party.addHero(2, heroObject[2]);
        System.out.println(party);
    }
}
 