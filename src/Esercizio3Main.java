public class Esercizio3Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("C001", "Mario", "Rossi", "mario.rossi@example.com", "2025-09-10");

        Articolo a1 = new Articolo("A100", "Mouse", 19.99, 50);
        Articolo a2 = new Articolo("A200", "Tastiera", 29.99, 30);
        Articolo a3 = new Articolo("A300", "Monitor", 149.90, 20);

        Carrello carrello = new Carrello(cliente, 10);
        carrello.aggiungiArticolo(a1);
        carrello.aggiungiArticolo(a2);
        carrello.aggiungiArticolo(a3);

        carrello.stampaRiepilogo();
    }
}


