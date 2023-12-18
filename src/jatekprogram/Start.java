package jatekprogram;

public class Start extends Helyszin{
    @Override
    public String leiras(){
        return "Ez a start! Menj tovább";
    }

    @Override
    public Helyszin egyikIrany() {
        return new Kezdes();
    }

    @Override
    public String egyikFelirat() {
        return "Tovább!";
    }
}
