package U2.sem_3_recursion.DigitsNumber;

import Utils.PrintColor;

public class MainD {
    public static void main(String[] args) {
        var dig = new DigitsNumber();
        dig.show(5874);
        PrintColor.printlnColor("El número tiene " + dig.count + " cifras.", PrintColor.GREEN);
    }
}
