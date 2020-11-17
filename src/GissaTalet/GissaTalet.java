package GissaTalet;

import javax.swing.*;

public class GissaTalet {
    public static void main(String[] args) {
        int tal = (int) (Math.random() * (100 - 1 + 1) + 1);
        int guess = 101;
        int tries = 0;
        while (tal != guess) {
            try {
                guess = Integer.parseInt(JOptionPane.showInputDialog("Gissa talet(1-100)"));
            } catch (NumberFormatException e) {
                guess = Integer.parseInt(JOptionPane.showInputDialog("Du måste ange ett heltal\nGissa talet(1-100)"));
            }

            if (guess < tal) {
                tries++;
                JOptionPane.showMessageDialog(null, "Du gissade för lågt\nFörsök igen");
            } else if (guess > tal) {
                tries++;
                JOptionPane.showMessageDialog(null, "Du gissade för högt\nFörsök igen.");
            } else {
                tries++;
                JOptionPane.showMessageDialog(null, "Du gissade rätt!\nDet tog " + tries + " försök!");
            }
        }
    }
}
