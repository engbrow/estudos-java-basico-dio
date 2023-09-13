import javax.sound.midi.Soundbank;

public class SmartTv {
    boolean ligada=false;
    int canal=1;
    int volume=25;

    
    public void mudarCanal (int novoCanal){
        canal = novoCanal;

    }

    public void mudarCanalAcima(){
        canal++;
        System.out.println("Mudando canal acima: " + canal);

    }

    
    public void mudarCanalAbaixo(){
        canal--;
        System.out.println("Mudando canal baixo: " + canal);

    }
    
    public void aumentarVolume(){
        volume++;
        System.out.println("Aumentando o volume para: " + volume);
    }
    
    public void diminuirVolume(){
        volume--;
         System.out.println("Diminuindo o volume para: " + volume);
    }
    
    public void ligar(){
        ligada=true;
    }
    
    public void desligar(){
        ligada=false;
    }
    
}