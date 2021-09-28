package MantenimientoProductos;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.HeadlessException;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;
import javax.swing.plaf.DimensionUIResource;

public class NombreClassVentana extends JFrame{
    JButton g1;
    JButton g2;
    JLabel tag1;
    JLabel tag2;
    JLabel tag3;
    JPanel contenedor=new JPanel();
        
    public NombreClassVentana(String title) throws HeadlessException {
        super(title);
        
        this.setDefaultCloseOperation(EXIT_ON_CLOSE); 
        this.setBounds(200, 200, 600, 400); 
        this.setLocationRelativeTo(null);
        this.getContentPane().add(contenedor);
        this.contenedor.setBackground(new Color(226,255,251));
        contenedor.setLayout(null);
        iniciarBotones(); 
        iniciarCampos();
        inciarEtiquetas();
    }
    
    public void iniciarCampos() {
        JTextField campoText1=new JTextField();
        campoText1.setBounds(300, 25, 200, 25);
        this.contenedor.add(campoText1);
        
        JTextField campoText2=new JTextField();
        campoText2.setBounds(300, 90, 180, 25);
        this.contenedor.add(campoText2);
        
        JTextField campoText3=new JTextField();
        campoText3.setBounds(300, 55, 175, 25);
        this.contenedor.add(campoText3);
    }
    protected void iniciarBotones() {
        g1=new JButton("Guardar");
        g2=new JButton("Editar");
        contenedor.add(g1);
        contenedor.add(g2); 
        contenedor.setLayout(null); 
        g1.setBounds(45, 250, 150, 40);
        g2.setBounds(150, 250, 150, 40);
            } 

    private void inciarEtiquetas() {
        this.tag1=new JLabel("ID Producto");
        this.contenedor.add(tag1);
        this.tag1.setForeground(Color.black);
        this.contenedor.setLayout(null);
        this.tag1.setBounds(15, 15, 180, 40);
        this.tag2=new JLabel("Nombre");
        this.contenedor.add(tag2);
        this.tag2.setForeground(Color.black);
        this.contenedor.setLayout(null);
        this.tag2.setBounds(15, 70, 185, 60);
        this.tag3=new JLabel("Precio");
        this.contenedor.add(tag3);
        this.tag3.setForeground(Color.black);
        this.contenedor.setLayout(null);
        this.tag3.setBounds(15, 115, 185, 60);
    }

}
