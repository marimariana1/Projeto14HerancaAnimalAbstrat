/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Projeto14HerancaAnimalAbstrat;

/**
 *
 * @author thais
 */
public abstract class Animal {
    private String Comida;
    private String Habitat;

    public Animal() {
    }

    public Animal(String Comida, String Habitat) {
        this.Comida = Comida;
        this.Habitat = Habitat;
    }

    public void setComida(String Comida) {
        this.Comida = Comida;
    }

    public void setHabitat(String Habitat) {
        this.Habitat = Habitat;
    }

    public String getComida() {
        return Comida;
    }

    public String getHabitat() {
        return Habitat;
    }
    
    public abstract void makeNoise();
    
}
