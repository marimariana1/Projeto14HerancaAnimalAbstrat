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
public class Cao extends Canino{
    private Double Tamanho;

    public Cao() {
    }

    public Cao(Double Tamanho, String Comida, String Habitat) {
        super(Comida, Habitat);
        this.Tamanho = Tamanho;
    }

    public Double getTamanho() {
        return Tamanho;
    }

    public void setTamanho(Double Tamanho) {
        this.Tamanho = Tamanho;
    }
    
    
    @Override
    public void makeNoise(){
        System.out.println("Lobo : AUAU");
    }     
    
}
