
import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
     int numero;
    String frase;
    frase = JOptionPane.showInputDialog("Digite sua frase: ");
    numero = Integer.parseInt(JOptionPane.showInputDialog("Quantas repetições?"));
    for (int n=1 ; n<=numero ; n++) {
        System.out.println(frase);
    }
    }
}