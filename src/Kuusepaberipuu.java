public class Kuusepaberipuu extends Kuusk{

    public Kuusepaberipuu(double keskosaDiameetercm, double palgiPikkus, int kogus, String puuliik) {
        super(keskosaDiameetercm, palgiPikkus, kogus, puuliik);
    }

    @Override
    public void arvutaHind() {
        System.out.println("Kuusepaberipuidu eest saadav raha on " + Math.round((super.arvutaTihumeeter()*42.04*getKogus())*100)/100.0);
    }
}