
package musicainterface2805;

public class Piano extends InstrumentoCuerda{
    //attr
    private int nOctavas;
    
    //constructor
    public Piano(int nOctavas) {
        super(64);
        this.nOctavas = nOctavas;
    }
   
    //metodos
    public void tocar(){
        System.out.println("Tocando el piano");
    }
    
    public void afinar(){
        System.out.println("Llamando al afinador de pianos");
    }
}
