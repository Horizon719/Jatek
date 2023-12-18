package jatekprogram;

public class Nyugat extends Helyszin implements MasikIrany{
    
    @Override
    public String leiras() {
        return "Ez Nyugat!";
    }

    @Override
    public Helyszin egyikIrany() {
        return new Nyugat2();
    }

    @Override
    public String egyikFelirat() {
        return "nyugat2";
    }
    
    @Override
    public Helyszin masikIrany() {
        return new Nyugat1();
    }

    @Override
    public String masikFelirat() {
        return "nyugat1";
    }
}
