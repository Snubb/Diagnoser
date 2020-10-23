import javax.swing.*;

public class Iteration_for {
    public static void main(String[] args) {
        int tal = Integer.parseInt(JOptionPane.showInputDialog("Vilket tal?"));
        for (int i = 1 ; i < 11 ; i++) {
            System.out.println(i + "*" + tal + "=" + i * tal);
        }
    }
}
