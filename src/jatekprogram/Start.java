package jatekprogram;

public class Start extends Helyszin{
    @Override
    public String leiras(){
        return "Ez a start!";
    }

    @Override
    public Helyszin egyikIrany() {
        return new Kezdes();
    }
}
