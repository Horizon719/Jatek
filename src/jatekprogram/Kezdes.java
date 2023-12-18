package jatekprogram;

public class Kezdes extends Helyszin implements MasikIrany{

    @Override
    public String leiras() {
        return "Ez a kezdés! jobbra vagy balra?";
    }

    @Override
    public Helyszin egyikIrany() {
        return new Jobb();
    }

    @Override
    public String egyikFelirat() {
        return "jobbra";
    }

    @Override
    public Helyszin masikIrany() {
        return new Bal();
    }

    @Override
    public String masikFelirat() {
        return "balra";
    }
    
}
