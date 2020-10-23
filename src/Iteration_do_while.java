import javax.swing.*;

public class Iteration_do_while {
    public static void main(String[] args) {
        int tal = Integer.parseInt(JOptionPane.showInputDialog("Vilket tal?"));
        int i = 1;
        do {
            System.out.println(i * tal);
            i++;
        } while (i < 11);
    }
}
