public class Esercizio1Main {
    public static void main(String[] args) {
        Rettangolo r1 = new Rettangolo(5, 10);
        Rettangolo r2 = new Rettangolo(3, 7);

        // Stampa singolo rettangolo
        RettangoloUtils.stampaRettangolo(r1);

        // Stampa due rettangoli e le somme
        RettangoloUtils.stampaDueRettangoli(r1, r2);
    }
}


