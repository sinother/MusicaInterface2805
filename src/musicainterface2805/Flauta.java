package musicainterface2805;

public class Flauta extends InstrumentoViento{
     //attr
    private int nOctavas;
    
    //constructor
    public Flauta(int nOctavas) {
        super(64);
        this.nOctavas = nOctavas;
    }
   
    //metodos
    public void tocar(){
        System.out.println("Tocando la flauta");
    }
    
    public void afinar(){
        System.out.println("Llamando al afinador de flautas");
    }
}
