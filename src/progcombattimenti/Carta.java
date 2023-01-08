/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package progcombattimenti;

/**
 *
 * @author gigga
 */
public class Carta {
    private String nome;
    private int vita;
    private int attacco;
    private String ambiente;
    
    Carta(String nome, int vita,int attacco, String ambiente) {
        this.nome = nome;
        this.vita = vita;
        this.attacco = attacco;
        this.ambiente = ambiente;
    }
    
    public String getNome() {
        return nome;
    }
    
    public int getVita() {
        return vita;
    }
    
    public int getAttacco() {
        return attacco;
    }
    
    public String getAmbiente() {
        return ambiente;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public void setVita(int vita) {
        this.vita = vita;
    }
    
    public void setAttacco(int attacco) {
        this.attacco = attacco;
    }
    
    public void setAmbiente(String ambiente) {
        this.ambiente = ambiente;
    }
    
    //cartaBC.attacco(cartaAD);
    public void attacco(Carta cartaNemica, String ambiente) {
        int vitaNemica = cartaNemica.getVita();
        int moltiplicatoreDanni;
        float moltiplicatoreDifesa;
        
        if (ambiente.equals(this.ambiente)) {
            moltiplicatoreDanni = 2;
        } else {
            moltiplicatoreDanni = 1;
        }
        
        if(ambiente.equals(cartaNemica.getAmbiente())) {
            moltiplicatoreDifesa = 0.5f;
        } else {
            moltiplicatoreDifesa = 1;
        }
        
        vitaNemica -= (int) (attacco * moltiplicatoreDifesa * moltiplicatoreDanni);
        
        if (vitaNemica < 0) {
            vitaNemica = 0;
        }
        
        cartaNemica.setVita(vitaNemica);
    }
}
