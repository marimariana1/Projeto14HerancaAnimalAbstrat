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
public class Tigre extends Felino{
    private String Cor;

    public Tigre() {
    }

    public Tigre(String Cor, String Comida, String Habitat) {
        super(Comida, Habitat);
        this.Cor = Cor;
    }

    public String getCor() {
        return Cor;
    }

    public void setCor(String Cor) {
        this.Cor = Cor;
    }
   
    @Override
    public void makeNoise(){
        System.out.println("Tigre : GRRR");
    }    
        
}
