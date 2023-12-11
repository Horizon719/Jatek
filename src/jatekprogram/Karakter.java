package jatekprogram;

import java.util.ArrayList;
import java.util.Random;

public class Karakter {
    private int eletero, ugyesseg, szerencse;
    ArrayList<Targy> felszereles;
    private final Random RND = new Random();

    public Karakter() {
        this.eletero = dobas()+dobas()+12;
        this.ugyesseg = dobas()+6;
        this.szerencse = dobas()+6;
        this.felszereles = new ArrayList<>();
    }

    public int getEletero() {
        return eletero;
    }

    public int getUgyesseg() {
        return ugyesseg;
    }

    public int getSzerencse() {
        return szerencse;
    }
    
    public void felvesz(Targy targy){
        this.felvesz(targy, 1);
    }
    
    public void felvesz(Targy targy, int db){
        for (int i = 0; i < db; i++) {
            this.felszereles.add(targy);
        }
    }
    
    public void hasznal(String nev){
        this.hasznal(nev, 1);
    }
    
    public void hasznal(String nev, int mennyit){
        this.hasznal(nev, mennyit, true);
    }
    
    public void hasznal(String nev, int mennyit, boolean levon){
        int dbVan = 0;
        for (Targy elem : felszereles) {
            if (elem.getNev().equals(nev)) {
                dbVan++;
            }
        }
        if (levon || dbVan >= mennyit) {
            int i = 0;
            int levonandoDb = mennyit;
            while(i < felszereles.size() && levonandoDb != 0){
                if(felszereles.get(i).getNev().equals(nev)){
                    felszereles.remove(i);
                    levonandoDb--;
                }
                i++;
            }
            System.out.printf("%s-ból/ből sikeresen felhasználva %d db\n", nev, mennyit);
        } else {
            System.out.printf("A %s-t nem sikreült felhasználni! (%d/%d)\n", nev, mennyit, dbVan);
        }
    }
    
    public int dobas(){
        return RND.nextInt(6-1+1)+1;
    }
}
