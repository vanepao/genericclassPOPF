package po.pductos;

public class Listatickets<T> {
    Elemento<T> pivote, inicio;
    int nelementos;

    //Constructor inicial
    public Listatickets(){
        inicio=pivote=null;
        nelementos=0;
    }


    public Listatickets(Elemento<T> objeto){
        inicio=pivote=objeto;
        nelementos=1;
    }

    public void insertaren(Elemento<T> objeto){
        if(nelementos==0){
            inicio=pivote=objeto;
        } else{
            objeto.siguiente=inicio;
            inicio=pivote=objeto;
        }
        nelementos++;
    }

    public String recorreren(){
        String data = "";
        pivote=inicio;
        for(int i=0; i<nelementos; i++){
            data += pivote.attrG.toString();
            pivote=pivote.siguiente;
        }
        return data;
    }
    public void eliminaren() {
        inicio = inicio.siguiente;
        nelementos--;
        if (nelementos == 0) {
            inicio = pivote = null;

        }
    }
}
