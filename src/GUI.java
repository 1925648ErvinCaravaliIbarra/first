/**
 *
 * @author leovi
 */
import javax.swing.*;

public class GUI extends JFrame{
    JButton bImagen, bColor;
    JLabel lImagen, lMensaje;
    JPanel pBotones;
    
    
    public GUI()
    {
        bColor = new JButton("Cambiar Color");
        bImagen = new JButton("Mostrar imagen");
        pBotones = new JPanel();
        
        pBotones.add(bImagen);
        pBotones.add(bColor);
        
        lMensaje = new JLabel("Iniciando....");
        lImagen = new JLabel();
        
        add(pBotones);
        add(lImagen);
        add(lMensaje);
        
        setVisible(true);
        setSize(550,300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
    }
    
    public static void main(String[] args) {
        GUI miO = new GUI();
        
    }
    
    
}
