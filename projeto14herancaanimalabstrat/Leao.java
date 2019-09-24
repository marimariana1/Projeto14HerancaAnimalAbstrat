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
public class Leao  extends Felino{
    private String Origem;

    public Leao() {
    }

    public Leao(String Origem, String Comida, String Habitat) {
        super(Comida, Habitat);
        this.Origem = Origem;
    }

    public String getOrigem() {
        return Origem;
    }

    public void setOrigem(String Origem) {
        this.Origem = Origem;
    }
    
    @Override
    public void makeNoise(){
        System.out.println("Leão : ROARR");
    }    
      
}
