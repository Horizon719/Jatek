package jatekprogram;

public class Nyugat2  extends Helyszin{
    @Override
    public String leiras() {
        return "Ez nyugat 2!";
    }

    @Override
    public Helyszin egyikIrany() {
        return new Kelet();
    }

    @Override
    public String egyikFelirat() {
        return "kelet";
    }
}
