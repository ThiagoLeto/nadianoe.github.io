
import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Main {

    public static void main(String[] args) {

        JFrame ventana = new JFrame();
        ventana.setLayout(null);
        ventana.setSize(500, 400);

        JLabel texto = new JLabel();
        texto.setText("Ingrese su nombre");
        texto.setSize(300, 25);
        texto.setLocation(25, 25);

        JTextField campoDeTexto = new JTextField();
        campoDeTexto.setSize(500,25);
        campoDeTexto.setLocation(25,60);

        JTextArea areaDeTexto = new JTextArea();
        areaDeTexto.setSize(500,100);
        areaDeTexto.setLocation(25,90);

        JButton boton = new JButton("Saludar");
        boton.setSize(100, 33);
        boton.setLocation(25,200);

        JLabel respuesta = new JLabel();
        respuesta.setSize(500,25);
        respuesta.setLocation(30,250);
        
        ventana.add(texto);
        ventana.add(campoDeTexto);
        ventana.add(areaDeTexto);
        ventana.add(boton);
        ventana.add(respuesta);

        ventana.setVisible(true);

        boton.addMouseListener(

            new MouseAdapter() {

            @Override
            public void mouseClicked(MouseEvent e) {
                String texto = campoDeTexto.getText();
                texto = "¡Hola, " + texto + "!";
                respuesta.setText(texto);
            }
        });
    }
}
