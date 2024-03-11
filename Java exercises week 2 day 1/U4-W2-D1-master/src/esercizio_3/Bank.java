package esercizio_3;

import exceptions.BancaException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Bank {

    private static Logger logger = LoggerFactory.getLogger(Bank.class);

    public static void main(String[] args) {
        ContoCorrente conto1 = new ContoCorrente("Luciani Marco", 1000.0);

        System.out.println("Saldo conto: " + conto1.restituisciSaldo());

        try {
            conto1.preleva(1750.50);
            System.out.println("Saldo conto: " + conto1.restituisciSaldo());
        } catch (BancaException e) {
            logger.error("Errore durante il prelievo " + e);
            e.printStackTrace();
        }

        ContoOnLine conto2 = new ContoOnLine("Salvatore Levi", 50350.0, 1500);
        conto2.stampaSaldo();

        try {
            conto2.preleva(2000);
            conto2.stampaSaldo();
        } catch (BancaException e) {
            logger.error("Errore durante il prelievo " + e);
            e.printStackTrace();
        }
    }
}
