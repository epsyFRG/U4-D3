public class SIM {
    private String numeroTelefono;
    private double credito;
    private Chiamata[] ultimeChiamate;

    public SIM(String numeroTelefono) {
        this.numeroTelefono = numeroTelefono;
        this.credito = 0.0;
        this.ultimeChiamate = new Chiamata[5];
    }

    public String getNumeroTelefono() {
        return numeroTelefono;
    }

    public double getCredito() {
        return credito;
    }

    public void ricarica(double importo) {
        if (importo > 0) {
            credito += importo;
        }
    }

    public Chiamata[] getUltimeChiamate() {
        return ultimeChiamate;
    }

    public void aggiungiChiamata(Chiamata chiamata) {
        for (int i = ultimeChiamate.length - 1; i > 0; i--) {
            ultimeChiamate[i] = ultimeChiamate[i - 1];
        }
        ultimeChiamate[0] = chiamata;
    }

    public void stampaDatiSIM() {
        System.out.println("SIM");
        System.out.println(" - Numero: " + numeroTelefono);
        System.out.println(" - Credito: " + credito + "€");
        System.out.println(" - Ultime chiamate:");
        for (int i = 0; i < ultimeChiamate.length; i++) {
            Chiamata c = ultimeChiamate[i];
            if (c != null) {
                System.out.println("   #" + (i + 1) + ": " + c.getNumeroChiamato() + " - " + c.getDurataMinuti() + " min");
            }
        }
    }
}


