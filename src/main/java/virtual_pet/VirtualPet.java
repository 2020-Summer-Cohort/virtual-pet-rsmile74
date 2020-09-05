package virtual_pet;

import java.util.Random;

//This Class is VirtualPet
public class VirtualPet {
    private int hunger;
    private int thirst;
    private int boredom;
    private int tireness;
    private int sickness;

    //returns information
    public int getHunger() {
        int hunger = 1;
        return hunger;
    }

    public int getThirst() {
        int thirst = 2;
        return thirst;
    }

    public int getBoredom() {
        int boredom = 3;
        return boredom;
    }

    public int getTiredness() {
        int tiredness = 4;
        return tiredness;
    }

    public int getSickness() {
        int sickness = 5;
        return sickness;
    }

    public void tick() {
        hunger++;
        thirst++;
        boredom--;
        tireness--;
        sickness--;

    }


    public void feed() {
        hunger = +2;
    }

    public void thirst() {
        thirst += 2;
    }

    public void boredom() {
        boredom -= 1;
    }

    public void tireness() {
        tireness -= 1;
    }

    public void sickness() {
        sickness -= 1;
    }
}

