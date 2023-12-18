package jatekprogram;

public class Bal extends Helyszin implements MasikIrany{

    @Override
    public String leiras() {
        return "Ez a bal! Keletre vagy nyugatra?";
    }

    @Override
    public Helyszin egyikIrany() {
        return new Kelet();
    }

    @Override
    public String egyikFelirat() {
        return "keletre";
    }

    @Override
    public Helyszin masikIrany() {
        return new Nyugat();
    }

    @Override
    public String masikFelirat() {
        return "nyugatra";
    }
    
}
