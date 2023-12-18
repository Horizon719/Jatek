package jatekprogram;

public class Kezdes extends Helyszin{

    @Override
    public String leiras() {
        return "Ez a kezdés! Menj balra!";
    }

    @Override
    public Helyszin egyikIrany() {
        return new Bal();
    }

    @Override
    public String egyikFelirat() {
        return "balra";
    }
    
}
