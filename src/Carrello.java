public class Carrello {
    private Cliente cliente;
    private Articolo[] articoli;
    private double totale;

    public Carrello(Cliente cliente, int capacità) {
        this.cliente = cliente;
        this.articoli = new Articolo[capacità];
        this.totale = 0.0;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public Articolo[] getArticoli() {
        return articoli;
    }

    public double getTotale() {
        return totale;
    }

    public boolean aggiungiArticolo(Articolo articolo) {
        for (int i = 0; i < articoli.length; i++) {
            if (articoli[i] == null) {
                articoli[i] = articolo;
                totale += articolo.getPrezzo();
                return true;
            }
        }
        return false;
    }

    public void stampaRiepilogo() {
        System.out.println("Carrello di: " + cliente.getNome() + " " + cliente.getCognome());
        System.out.println("Articoli:");
        for (Articolo a : articoli) {
            if (a != null) {
                System.out.println(" - [" + a.getCodice() + "] " + a.getDescrizione() + ": " + a.getPrezzo() + "€");
            }
        }
        System.out.println("Totale: " + totale + "€");
    }
}


