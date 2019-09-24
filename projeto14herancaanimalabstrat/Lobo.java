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
public class Lobo extends Canino{
    private Double Peso;

    public Lobo() {
    }

    public Lobo(Double Peso, String Comida, String Habitat) {
        super(Comida, Habitat);
        this.Peso = Peso;
    }

    public Double getPeso() {
        return Peso;
    }

    public void setPeso(Double Peso) {
        this.Peso = Peso;
    }
    
    
    @Override
    public void makeNoise(){
        System.out.println("Lobo : AUUUU");
    }     
    
}
