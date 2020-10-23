import javax.swing.*;

public class Iteration_diagnos {
    public static void main(String[] args) {
        int i = 1;
        int tal = Integer.parseInt(JOptionPane.showInputDialog("Vilket tal?"));
        while (i < 11) {
            System.out.println(i + "*" + tal + "=" + i * tal);
            i++;
        }
    }
}
