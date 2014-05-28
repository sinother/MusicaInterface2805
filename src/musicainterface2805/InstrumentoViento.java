package musicainterface2805;
//porque no implementoi todos los tipos(abstracts)
public abstract class InstrumentoViento implements InstrumentoMusical{
     //attr
   private int nAgujeros;
    
    //constructor
    public InstrumentoViento(int nAgujeros) {
        this.nAgujeros = nAgujeros;
    }
    //implementar tipoIntrumento(metodos)
    public String tipoInstrumento(){
        return "Instrumento de viento";
    }
    public int getAgujeros(){
        return this.nAgujeros;
    }
}
