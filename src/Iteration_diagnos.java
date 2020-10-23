import javax.swing.*;

public class Iteration_diagnos {
    public static void main(String[] args) {
        String igen = "ja";
        while (igen.equals("ja")) {
            int i = Integer.parseInt(JOptionPane.showInputDialog("Vart ska tabellen börja?"));
            int slut = Integer.parseInt(JOptionPane.showInputDialog("Vart ska tabellen sluta?"));
            int tal = Integer.parseInt(JOptionPane.showInputDialog("Vilket tal ska multipliceras?"));
            while (i <= slut) {
                System.out.println(i + "*" + tal + "=" + i * tal);
                i++;
            }
            igen = JOptionPane.showInputDialog("Igen?(ja/nej)");
            igen = igen.toLowerCase();
        }
    }
}
