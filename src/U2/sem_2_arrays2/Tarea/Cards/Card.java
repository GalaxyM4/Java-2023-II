package U2.sem_2_arrays2.Tarea.Cards;

import Utils.PrintColor;

public class Card {
    int number;
    String symbol;

    public Card(int num, String symbol) {
        this.number = num;
        this.symbol = symbol;
    }

    public String toString() {
        if (symbol == DeckCards.symbols[2] || symbol == DeckCards.symbols[3]) {
            return PrintColor.RED + this.number + " " + this.symbol + PrintColor.RESET;
        }else {
            return this.number + " " + this.symbol;
        }
    }
}
