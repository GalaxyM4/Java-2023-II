package U2.sem_1_polimosfirm.Account;

public class AccountSaving extends Account{
    @Override
    public double interes() {
        return this.saldo*0.05d;
    }
}
