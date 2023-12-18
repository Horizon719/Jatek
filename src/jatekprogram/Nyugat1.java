package jatekprogram;

public class Nyugat1 extends Helyszin{
    @Override
    public String leiras() {
        return "Ez nyugat 1!";
    }

    @Override
    public Helyszin egyikIrany() {
        return new Nyugat();
    }

    @Override
    public String egyikFelirat() {
        return "nyugat";
    }
}
