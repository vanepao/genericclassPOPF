package po.pductos;

public class Listatickets<T> {
    public Tickets<T> pivote, inicio;
    int nelementos;

    //Constructor inicial
    public Listatickets(){
        inicio=pivote=null;
        nelementos=0;
    }


    public Listatickets(Tickets<T> objeto){
        inicio=pivote=objeto;
        nelementos=1;
    }

    public void insertaren(Tickets<T> objeto){
        if(nelementos==0){
            inicio=pivote=objeto;
        } else{
            objeto.siguiente=inicio;
            inicio=pivote=objeto;
        }
        nelementos++;
    }

    public String recorrer(){
        String data = "";
        pivote=inicio;
        for(int i=0; i<nelementos; i++){
            data += pivote.attrGr.toString();
            pivote=pivote.siguiente;
        }
        return data;
    }
    public String eliminar(){
        String data="";
        pivote=inicio;
        for(int i=1;i<nelementos; i++){
            data +=pivote.attrGr.toString();
            pivote =pivote.siguiente;
        }
        return data;
    }

}

