public class Esercizio2Main {
    public static void main(String[] args) {
        SIM sim = new SIM("3401234567");
        sim.ricarica(10.0);

        sim.aggiungiChiamata(new Chiamata("3201111111", 3));
        sim.aggiungiChiamata(new Chiamata("3202222222", 5));
        sim.aggiungiChiamata(new Chiamata("3203333333", 2));
        sim.aggiungiChiamata(new Chiamata("3204444444", 7));
        sim.aggiungiChiamata(new Chiamata("3205555555", 1));
        sim.aggiungiChiamata(new Chiamata("3206666666", 4));

        sim.stampaDatiSIM();
    }
}


