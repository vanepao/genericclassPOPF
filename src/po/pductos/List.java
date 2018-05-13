package po.pductos;

import java.util.Scanner;

public class List <T> {
    public Elemento<T> pivote, inicio;
    int nelementos;

    public List(){
        inicio=pivote=null;
        nelementos=0;
    }
    public List(Elemento<T> objeto){
        inicio=pivote=objeto;
        nelementos=1;
    }

    public void insertar(Elemento<T> objeto){
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
            data += pivote.attrG.toString();
            pivote=pivote.siguiente;
        }
        return data;
    }
    public String eliminar(){
        String data="";
        pivote=inicio;
        for(int i=1;i<nelementos; i++){
            data = data + pivote.attrG.toString();
            pivote=pivote.siguiente;
        }
        return data;
    }

}
