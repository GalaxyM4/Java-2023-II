package U2.sem_1_polimosfirm.executables;
import U2.sem_1_polimosfirm.Account.*;

public class MainA {
    public static void main(String[] args) {
        AccountSaving c_aho = new AccountSaving();
        c_aho.saldo = 5000;
        System.out.println("Interes cta ahorros: " + c_aho.interes());
        AccountFixed a_fix = new AccountFixed();
        a_fix.saldo = 5000;
        System.out.println("Interes cta fijo: " + a_fix.interes());
    }
}
