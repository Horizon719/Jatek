package jatekprogram;

public class Jatek {

    public static void main(String[] args) {
        Karakter karakter = new Karakter();
        
        karakter.felvesz(new Targy("a", "ASD"), 1);
        karakter.felvesz(new Targy("d", "DAS"), 6);
        karakter.felvesz(new Targy("a", "ASD"), 1);
        karakter.felvesz(new Targy("a", "ASD"), 4);
        karakter.felvesz(new Targy("b", "SAD"));
        karakter.felvesz(new Targy("c", "DSA"), 3);
        karakter.felvesz(new Targy("b", "SAD"), 2);
        karakter.felvesz(new Targy("d", "DAS"), 10);
        karakter.felvesz(new Targy("d", "DAS"), 2);
        karakter.felvesz(new Targy("d", "DAS"), 2);
        karakter.felvesz(new Targy("c", "DSA"), 1);
        karakter.felvesz(new Targy("b", "SAD"), 1);
        
        karakter.hasznal("a", 6);
        karakter.hasznal("b", 2);
        karakter.hasznal("c", 5, false);
        karakter.hasznal("d", 20);
        karakter.hasznal("a");
        karakter.hasznal("e");
    }
    
}
