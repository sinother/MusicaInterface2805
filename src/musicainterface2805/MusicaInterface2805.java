package musicainterface2805;

public class MusicaInterface2805 {

    public static void main(String[] args) {
        InstrumentoMusical[] orquesta = new InstrumentoMusical[5];
        
        orquesta[0] = new Piano(100);
        orquesta[1] = new Flauta(5);
        orquesta[2] = new Flauta(4);
        orquesta[3] = new Piano(5);
        orquesta[4] = new Flauta(8);
        
        for(int i=0;i<orquesta.length;i++){
            orquesta[i].afinar();
        }
        for(int i=0;i<orquesta.length;i++){
            orquesta[i].tocar();
        }
        
        /*declaracion de variable
        InstrumentoMusical instrumento1, instrumento2;
        instrumento1 = new Piano(300);
        instrumento2 = new Flauta(5);
        
        instrumento1.tocar();
        instrumento1.afinar();
        System.out.println(instrumento1.tipoInstrumento());
        instrumento2.tocar();
        instrumento2.afinar();
        System.out.println(instrumento2.tipoInstrumento());*/
    }
    
}
