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
public class Projeto14HerancaAnimalAbstrat {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Gato Gato01 = new Gato();
        Gato01.setComida("Ração de gato");
        Gato01.setHabitat("Casas");
        Gato01.setRaca("Azul Russo");
        Gato01.makeNoise();
        System.out.println("Comida:"+Gato01.getComida());  
        System.out.println("Habitat:"+Gato01.getHabitat());     
        System.out.println("Raça:"+Gato01.getRaca());      
        System.out.println("\n");                
        
        Leao Leao01 = new Leao();
        Leao01.setComida("Carne de animais");
        Leao01.setHabitat("Selva");
        Leao01.setOrigem("África");
        Leao01.makeNoise();  
        System.out.println("Comida:"+Leao01.getComida());
        System.out.println("Habitat:"+Leao01.getHabitat());   
        System.out.println("Origem:"+Leao01.getOrigem());  
        System.out.println("\n");    
                          
        Tigre Tigre01 = new Tigre();
        Tigre01.setComida("Carne de animais");
        Tigre01.setHabitat("Selva");
        Tigre01.setCor("Laranja com listras pretas");        
        Tigre01.makeNoise();  
        System.out.println("Comida:"+Tigre01.getComida());
        System.out.println("Habitat:"+Tigre01.getHabitat());    
        System.out.println("Cor:"+Tigre01.getCor()); 
        System.out.println("\n");               
        
        Lobo Lobo01 = new Lobo();
        Lobo01.setComida("Carne de animais");
        Lobo01.setHabitat("Florestas");
        Lobo01.setPeso(80.00);
        Lobo01.makeNoise();
        System.out.println("Comida:"+Lobo01.getComida());
        System.out.println("Habitat:"+Lobo01.getHabitat());     
        System.out.println("Peso:"+Lobo01.getPeso());  
        System.out.println("\n");                      
        
        Cao Cao01 = new Cao();
        Cao01.setComida("Carne de animais");
        Cao01.setHabitat("Florestas");
        Cao01.setTamanho(1.30);
        Cao01.makeNoise();  
        System.out.println("Comida:"+Cao01.getComida());
        System.out.println("Habitat:"+Cao01.getHabitat());     
        System.out.println("Tamanho:"+Cao01.getTamanho());       
                           
    }
    
}
