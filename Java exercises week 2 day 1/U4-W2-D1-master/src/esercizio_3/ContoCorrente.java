package esercizio_3;

import exceptions.BancaException;

public class ContoCorrente {

    final int maxMOvimenti = 50;

    //    ATTRIBUTES
    String titolare;
    int nMovimenti;
    double saldo;

    //    CONSTRUCTOR
    public ContoCorrente(String titolare, double saldo) {
        this.titolare = titolare;
        this.saldo = saldo;
    }

    //    METHODS
    void preleva(double x) throws BancaException {

        if (nMovimenti < maxMOvimenti)
            saldo = saldo - x;

        else
            saldo = saldo - x - 0.50;
        if (saldo < 0) {
            throw new BancaException("il conto è in rosso");
        }
        nMovimenti++;


    }

    public double restituisciSaldo() {
        return saldo;
    }
}