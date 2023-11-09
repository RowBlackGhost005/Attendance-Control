package popup;

import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.ImageIcon;
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

    public static void mostrarAviso(String mensaje, String titulo, String rutaImagen) {

        JFrame frame = new JFrame(titulo);
        JPanel panel = new JPanel();

        // Agregar etiqueta
        JLabel etiqueta = new JLabel(mensaje);
        panel.add(etiqueta);

        // Cargar la imagen y ajustar su tamaño
        ImageIcon imagenIcon = new ImageIcon(rutaImagen);
        Image imagen = imagenIcon.getImage();
        Image imagenRedimensionada = imagen.getScaledInstance(150, 150, Image.SCALE_SMOOTH);
        ImageIcon imagenRedimensionadaIcon = new ImageIcon(imagenRedimensionada);

        // Crear una etiqueta para mostrar la imagen
        JLabel imagenLabel = new JLabel(imagenRedimensionadaIcon);
        panel.add(imagenLabel);

        frame.add(panel);
        // Centrar en la pantalla
        frame.setSize(400, 200); // Establece el tamaño deseado
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        frame.setLocation(dim.width / 2 - frame.getSize().width / 2, dim.height / 2 - frame.getSize().height / 2);

        frame.setVisible(true);
    }
}
