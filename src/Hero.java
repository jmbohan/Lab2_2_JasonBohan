import java.util.Random;

public class Hero {



    // data fields
    private String name;
    private String hClass;
    private int level;
    private int experience;
    private static final int MAX_LEVEL = 10;
    private static final int[] LEVELS = {5, 10, 15, 20, 30, 40, 50, 75, 100, 150};



    // aRandom is a random object
    //   there should only be
    //   one per program
    //   so set it to static
    private static Random aRandom;



    // constructor
    public Hero(String name) {



        // set the name to given value
        //   class to empty string
        //   level to 1 and
        //   experience to 0
        this.name = name;
        this.hClass = "";
        this.level = 1;
        this.experience = 0;
    }



    // accessor method
    public String getName() {



        // return name
        return name;
    }



    // modifier method
    public void setName(String name) {



        // set name
        this.name = name;
    }



    // accessor method
    public String getHClass() {



        // return class
        return hClass;
    }



    // modifier method
    public void setHClass(String hClass) {



        // set class
        this.hClass = hClass;
    }



    // accessor method
    public int getLevel() {



        // return level
        return level;
    }



    // modifier method
    public void setLevel(int level) {



        // set level
        this.level = level;
    }

    public static Random getRandom() {



        // return the random object
        // this is useful if
        //   random object is instantiated
        //   using Hero class
        //   i.e. setRandomLevel() is called
        return Hero.aRandom;
    }



    public static void setRandom(Random aRandom) {



        // set random object
        // this is useful if
        //   random object is instantiated
        //   outside Hero class
        Hero.aRandom = aRandom;


    }

    // sets a random level
    //   between 1 to 10
    public void setRandomLevel() {



        // if random object is null
        //   instantiate random object
        // set level to a number
        //   between 1 and 10
        // .nextInt(10) returns a
        //   number from 0 to 9
        // so add 1
        if (Hero.aRandom == null) {
            Hero.aRandom = new Random();
        }
        this.level = Hero.aRandom.nextInt(10) + 1;
    }



    // increases the experience of the
    //   hero
    public void gainExperience(int experience) {



        // increment experience by
        //   the value of parameter
        // if experience is greater than
        //   current level
        //   leftOver holds the left over
        //     value from experience minus
        //     maximum experience of current level
        //   increment level
        //   set experience to leftOver
        this.experience += experience;
        while (Hero.LEVELS[this.level - 1] < experience) {
            int leftOver = experience - Hero.LEVELS[this.level - 1];
            ++this.level;
            this.experience = leftOver;
        }
    }



    // return hero information
    @Override
    public String toString() {



        // return name, class, level and
        //   experience of the hero
        //   separated by comma
        return "Name: " + this.name +
                ", Class: " + this.hClass +
                ", Level: " + this.level +
                ", Experience: " + this.experience;
    }
}
