package U2.sem_2_arrays2.Tarea.Cards;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class DeckCards {
    public Card[] deck;
    public static String[] symbols = new String[]{"espada", "trebol", "corazon", "rombo"};

    public DeckCards() {
        System.out.println("Generando mazo...");
        this.generate_cards();
    }

    /**
     * Este método genera las cartas en orden.
     */
    private void generate_cards() {
        deck = new Card[13*4];
        for (int i = 0; i < symbols.length; i++) {
            var symb = symbols[i];
            for (int j = 0; j < 13; j++) {
                deck[j+(13*i)] = new Card(j+1, symb);
            }
        }
    }

    public void shuffle_cards() {
        if(deck.length == 0) {
            throw new Error("El mazo no está generado.");
        }
        List<Card> list_cards = Arrays.asList(deck);
        Collections.shuffle(list_cards);
        list_cards.toArray(deck);
    }

    public void printCards() { //Muestra todas las cartas en el orden de la lista.
        if(deck.length == 0) {
            throw new Error("El mazo no está generado.");
        }
        for (Card card : deck) {
            System.out.println(card);
        }
    }
}