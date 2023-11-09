package popup;

import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JTextPane;

/**
 *
 * @author giova
 */
public class popUpAviso {

    public static void mostrarAviso(String mensaje, String titulo) {

        JFrame frame = new JFrame(titulo);
        JPanel panel = new JPanel();
        
        // Agregar etiqueta
        
        JLabel etiqueta = new JLabel(mensaje);
        panel.add(etiqueta);
        


        
        frame.add(panel);
        // Centrar en la pantalla
        frame.setSize(400, 200); // Establece el tamaño deseado
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        frame.setLocation(dim.width / 2 - frame.getSize().width / 2, dim.height / 2 - frame.getSize().height / 2);

        frame.setVisible(true);
    }
}
