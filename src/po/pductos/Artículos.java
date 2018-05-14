package po.pductos;

import java.util.Scanner;

public class Artículos {
    private String keyproduct;
    private String description;
    private int price;
    int cantidad;
    private String expiration;

    public Artículos() {
        this.keyproduct = "";
        this.description = "";
        this.price = 0;
        this.expiration = "";
    }

    public Artículos(int cantidad) {
        this.cantidad = cantidad;
    }

    public Artículos(String k, String d, int p, String e) {
        this.keyproduct = k;
        this.description = d;
        this.price = p;
        this.expiration = e;
    }


    @Override
    public String toString() {
        return "{" + "Keyproduct: " + keyproduct + " Brief description: " + description + " Price: " + price + " Expiration date: " + expiration + "} \n";
    }

    public String getKeyproduct() {
        return keyproduct;
    }

    public void setKeyproduct(String keyproduct) {
        this.keyproduct = keyproduct;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getExpiration() {
        return expiration;
    }

    public void setExpiration(String expiration) {
        this.expiration = expiration;
    }

    public int getCantidad() {
       return this.cantidad = cantidad;
    }
}
