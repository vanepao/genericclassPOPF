package po.pductos;

import java.util.Scanner;

public class List <T> {
    public Elemento<T> pivote, inicio;
    public Tickets<T> pivote2, inicio2;

    int nelementos;

    //Constructor inicial
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
    public void insertar(Tickets<T> objeto){
        if(nelementos==0){
            inicio2=pivote2=objeto;
        } else{
            objeto.siguiente=inicio2;
            inicio2=pivote2=objeto;
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
            data +=pivote.attrG.toString();
            pivote =pivote.siguiente;
        }
        return data;
    }

}
