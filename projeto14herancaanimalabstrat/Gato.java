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
public class Gato extends Felino{
    private String Raca;

    public Gato() {        
    }

    public Gato(String Raca, String Comida, String Habitat) {
        super(Comida, Habitat);
        this.Raca = Raca;
    }

    public String getRaca() {
        return Raca;
    }

    public void setRaca(String Raca) {
        this.Raca = Raca;
    }

    @Override
    public void makeNoise(){
        System.out.println("Gato : MIAUU");
    }

  
}
