package U2.sem_1_polimosfirm.Account;

public class AccountFixed extends Account {
    @Override
    public double interes() {
        return this.saldo;
    }
}
