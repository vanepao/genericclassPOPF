package po.pductos;

public class Elemento<T> {
    public T attrG;
    public Elemento siguiente;

    //Constructor
    public Elemento(T objeto){
        this.attrG=objeto;
        this.siguiente=null;
    }
}
