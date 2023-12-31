package jatekprogram;

import java.util.ArrayList;
import java.util.Random;

public class Karakter {
    private int eletero, ugyesseg, szerencse;
    ArrayList<String> felszereles;
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
    
    public int dobas(){
        return RND.nextInt(6-1+1)+1;
    }
}
