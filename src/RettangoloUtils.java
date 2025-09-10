public class RettangoloUtils {
    public static void stampaRettangolo(Rettangolo r) {
        System.out.println("Rettangolo:");
        System.out.println(" - Altezza: " + r.getAltezza());
        System.out.println(" - Larghezza: " + r.getLarghezza());
        System.out.println(" - Area: " + r.calcolaArea());
        System.out.println(" - Perimetro: " + r.calcolaPerimetro());
    }

    public static void stampaDueRettangoli(Rettangolo r1, Rettangolo r2) {
        System.out.println("--- Primo ---");
        stampaRettangolo(r1);
        System.out.println("--- Secondo ---");
        stampaRettangolo(r2);

        double sommaAree = r1.calcolaArea() + r2.calcolaArea();
        double sommaPerimetri = r1.calcolaPerimetro() + r2.calcolaPerimetro();

        System.out.println("Somma aree: " + sommaAree);
        System.out.println("Somma perimetri: " + sommaPerimetri);
    }
}


