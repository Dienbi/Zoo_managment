package tn.esprit.gestionzoo.Interface;

public interface Omnivore <T> extends Carnivore, Herbivore{
void eatPlantAndMeet(T food);
}
