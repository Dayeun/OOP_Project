package team8_OOPproject;
import java.awt.event.*;
import javax.swing.*;
import java.awt.*;
 
public class Background extends JFrame {
    JScrollPane scrollPane;
    ImageIcon icon;
 
    public Background() {
        icon = new ImageIcon("background.png");
         
        JPanel background = new JPanel() {
            public void paintComponent(Graphics g) {     
                g.drawImage(icon.getImage(), 0, 0, null);              
                setOpaque(false); //그림을 표시하게 설정,투명하게 조절
                super.paintComponent(g);
            }
        };
              
        scrollPane = new JScrollPane(background);
        setContentPane(scrollPane);
    }
    
}
