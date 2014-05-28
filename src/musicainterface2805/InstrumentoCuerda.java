package musicainterface2805;
//los hijos necesariamente implementan los metodos que faltan aqui(abstract)
public abstract class InstrumentoCuerda implements InstrumentoMusical{
    //attr
   private int nCuerdas;
    
    //constructor
    public InstrumentoCuerda(int nCuerdas) {
        this.nCuerdas = nCuerdas;
    }
    //implementar tipoIntrumento
    public String tipoInstrumento(){
        return "Instrumento de cuerda";
    }
    public int getCuerdas(){
        return this.nCuerdas;
    }
}
