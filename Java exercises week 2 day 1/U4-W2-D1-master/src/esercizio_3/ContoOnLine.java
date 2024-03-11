package esercizio_3;

import exceptions.BancaException;

public class ContoOnLine extends ContoCorrente {

    //    ATTRIBUTES
    double maxPrelievo;

    //    CONSTRUCTOR
    public ContoOnLine(String titolare, double saldo, double maxPrelievo) {
        super(titolare, saldo);
        this.maxPrelievo = maxPrelievo;
    }

    //    METHODS
    void stampaSaldo() {
        System.out.println("Titolare: " + titolare + " - Saldo: " + saldo + " - Num movimenti: " + nMovimenti + " - Massimo movimenti: " + maxMOvimenti + " - Massimo prelievo possibile: " + maxPrelievo);
    }

    void preleva(double x) throws BancaException {

        if (x <= maxPrelievo) {
            super.preleva(x);
        } else {
            throw new BancaException("il prelievo non è disponibile");
        }
    }
}
