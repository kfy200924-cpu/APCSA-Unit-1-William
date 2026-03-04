package Unit7.UnitTest;

import java.util.ArrayList;

public class BabySitter {
    private String name;
    private int exp;
    private ArrayList<BabySitter> sitterList;
    public BabySitter(String name, int exp) {
        this.name = name;
        this.exp = exp;
    }

    public String getName() {
        return name;
    }

    public int getYears() {
        return exp;
    }

    public void addNewSitters(String[] names) {
        //We need to iterate over each name in the array of names
        //Compares it with the name of each Babysitter name
        //If we do not find a match - add the new babysitter to the list
        for(String name : names) {
            boolean isFound = false;
            for(BabySitter babysitter : sitterList) {
                if(babysitter.getName().equals(name)) {
                    isFound = true;
                    break;
                }
            }
            if(!isFound) {
                sitterList.add(new BabySitter(name, 0));
            }
        }
    }
    public ArrayList<BabySitter> affordableSitters(double budget, int numChildren, int hours) {
        ArrayList<BabySitter> affordableSitters = new ArrayList<>();
        for(BabySitter sitter : sitterList) {
            int exp = sitter.getYears();
            int cost = 0;
            if(exp == 0) cost = 2;
            else if (exp < 4) cost = 2 + exp;
            else cost = 6;

            int charge = cost * numChildren * hours;

            if(charge <= budget) {
                affordableSitters.add(sitter);
            }
        }
        return affordableSitters;
    }
}
