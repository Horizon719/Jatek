package jatekprogram;

public class Jobb extends Helyszin implements MasikIrany{

    @Override
    public String leiras() {
        return "Ez a jobb! Délre vagy északra?";
    }

    @Override
    public Helyszin egyikIrany() {
        return new Del();
    }

    @Override
    public String egyikFelirat() {
        return "dél";
    }

    @Override
    public Helyszin masikIrany() {
        return new Eszak();
    }

    @Override
    public String masikFelirat() {
        return "észak";
    }
    
}
