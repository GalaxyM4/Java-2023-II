package U2.sem_2_arrays2.Tarea.Cards;

public class MainC {
    public static void main(String[] args) {
        DeckCards d = new DeckCards();
        System.out.println(" ------------------ NORMAL ------------------ ");
        d.printCards();
        System.out.println(" ------------------ SHUFFLED ------------------ ");
        d.shuffle_cards();
        d.printCards();
    }
}
