package tn.esprit.gestionzoo.entities;

import tn.esprit.gestionzoo.Interface.Carnivore;
import tn.esprit.gestionzoo.Interface.Food;

public abstract non-sealed class Aquatic extends Animal implements Carnivore<Food> {

    protected String habitat;

    public Aquatic() {
    }

    public Aquatic(String family, String name, int age, boolean isMammal, String habitat) {
        super(family, name, age, isMammal);
        this.habitat = habitat;
    }


    public abstract void swim();

    @Override
    public String toString() {
        return super.toString() + ", habitat:" + habitat;
    }

    @Override
    public void eatMeat(Food meat) {
        System.out.println("This aquatic is eating meat."+meat);

    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) return true;
        if (obj == null) return false;
        if (obj instanceof Aquatic aquatic) {
            return aquatic.habitat.equals(habitat) && aquatic.getName().equals(super.getName()) && aquatic.getAge() == super.getAge();
        }
        return false;
    }
}
