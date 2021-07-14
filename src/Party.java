public class Party {


    // contains the Hero's
    //   current party
    private final Hero[] Heroes;


    // constructor
    public Party() {


        // initialize array to hold
        //   3 heroes
        this.Heroes = new Hero[3];
    }


    // add a hero
    public void addHero(int index, Hero hero) {


        // check if index is valid
        // if index is valid
        //   assign hero given the index
        if ((index >= 0) && (index < this.Heroes.length)) {
            this.Heroes[index] = hero;
        }
    }


    // remove a hero
    public Hero removeHero(int index) {


        // result holds the hero
        //   to be removed
        // set result to null
        // check if index is valid
        // if index is valid
        //   set result to the hero
        //     given the index
        //   set hero with the index
        //     to null
        // return result
        Hero result = null;
        if ((index >= 0) && (index < this.Heroes.length)) {
            result = this.Heroes[index];
            this.Heroes[index] = null;
        }
        return result;
    }


    // return a hero
    //   given an index
    public Hero getHero(int index) {


        // result holds the hero
        //   to be returned
        // set result to null
        // check if index is valid
        // if index is valid
        //   set result to the hero
        //     given the index
        // return result
        Hero result = null;
        if ((index >= 0) && (index < this.Heroes.length)) {
            result = this.Heroes[index];
        }
        return result;
    }


    // increase experience of
    //   all heroes in the party
    public void gainExperience(int experience) {


        // go through all the heroes
        // if hero is not null
        //   call gainExperience
        for (Hero hero : this.Heroes) {
            if (hero != null) {
                hero.gainExperience(experience);
            }
        }
    }


    // display the party's data
    @Override
    public String toString() {


        // result holds the string
        // go through all the heroes
        // if hero is not null
        //   add toString of hero
        //   to result and a space
        // return result excluding
        //   the last space
        StringBuilder result = new StringBuilder();
        for (Hero hero : this.Heroes) {
            if (hero != null) {
                result.append(hero).append(System.lineSeparator());
            }
        }
        return result.substring(0, result.length() - 1);
    }
}

