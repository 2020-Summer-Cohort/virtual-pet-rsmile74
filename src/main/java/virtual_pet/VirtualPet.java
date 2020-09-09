package virtual_pet;

import java.util.Random;

//This Class is VirtualPet
public class VirtualPet {
    private int hunger = 50;
    private int thirst = 50;
    private int boredom = 50;
    private int tiredness = 50;
    private int sickness = 50;

    //returns information
    public int getHunger() {

        return hunger;
    }

    public int getThirst() {

        return thirst;
    }

    public int getBoredom() {

        return boredom;
    }

    public int getTiredness() {

        return tiredness;
    }

    public int getSickness() {

        return sickness;
    }

    public void tick() {
        hunger--;
        thirst--;
        boredom++;
        tiredness++;
        sickness--;

    }


    public void feed() {
        hunger -= 2;
    }

    public void thirst() {
        thirst += 2;
    }

    public void boredom() {
        boredom -= 1;
    }

    public void tiredness() {
        tiredness -= 1;
    }

    public void sickness() {
        sickness -= 1;
    }
}

