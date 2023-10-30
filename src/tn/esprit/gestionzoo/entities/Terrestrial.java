package tn.esprit.gestionzoo.entities;

import tn.esprit.gestionzoo.Interface.Food;
import tn.esprit.gestionzoo.Interface.Omnivore;

public final class Terrestrial extends Animal implements Omnivore<Food> {

    private int nbrLegs;

    public Terrestrial() {
    }

    public Terrestrial(String family, String name, int age, boolean isMammal, int nbrLegs) {
        super(family, name, age, isMammal);
        this.nbrLegs = nbrLegs;
    }

    @Override
    public String toString() {
        return super.toString() + ", nbrLegs:" + nbrLegs;
    }


    @Override
    public void eatMeat(Object meat) {
        System.out.println("terestrial is eating meat");    
    }

    @Override
    public Void eatPlant(Object plant) {
        return null;
    }

    @Override
    public void eatPlantAndMeet(Food food) {

    }
}
