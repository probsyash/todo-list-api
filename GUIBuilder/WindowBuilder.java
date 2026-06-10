import javax.swing.*;
import java.awt.Color;
import helper_classes.*;

public class WindowBuilder {
  public static void main(String[] args) {

     JFrame frame = new JFrame("My Awesome Window");
     frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     frame.setSize(703, 380);
     JPanel panel = new JPanel();
     panel.setLayout(null);
     panel.setBackground(Color.decode("#1e1e1e"));

     JLabel element1 = new JLabel("Login");
     element1.setBounds(27, 21, 339, 67);
     element1.setFont(CustomFontLoader.loadFont("./resources/fonts/Lato.ttf", 50));
     element1.setForeground(Color.decode("#D9D9D9"));
     panel.add(element1);

     JTextField element4 = new JTextField("");
     element4.setBounds(54, 156, 141, 21);
     element4.setFont(CustomFontLoader.loadFont("./resources/fonts/Lato.ttf", 14));
     element4.setBackground(Color.decode("#B2B2B2"));
     element4.setForeground(Color.decode("#656565"));
     element4.setBorder(new RoundedBorder(2, Color.decode("#979797"), 0));
     OnFocusEventHelper.setOnFocusText(element4, "Username", Color.decode("#353535"),   Color.decode("#656565"));
     panel.add(element4);

     JLabel element5 = new JLabel("Username");
     element5.setBounds(51, 114, 146, 37);
     element5.setFont(CustomFontLoader.loadFont("./resources/fonts/Lato.ttf", 30));
     element5.setForeground(Color.decode("#D9D9D9"));
     panel.add(element5);

     JLabel element6 = new JLabel("Password");
     element6.setBounds(55, 201, 143, 33);
     element6.setFont(CustomFontLoader.loadFont("./resources/fonts/Lato.ttf", 30));
     element6.setForeground(Color.decode("#D9D9D9"));
     panel.add(element6);

     JPasswordField element7 = new JPasswordField("");
     element7.setBounds(55, 242, 160, 21);
     element7.setFont(CustomFontLoader.loadFont("./resources/fonts/Lato.ttf", 14));
     element7.setBackground(Color.decode("#B2B2B2"));
     element7.setForeground(Color.decode("#656565"));
     element7.setBorder(new RoundedBorder(2, Color.decode("#979797"), 0));
     OnFocusEventHelper.setOnFocusText(element7, "Password", Color.decode("#353535"),   Color.decode("#656565"));
     panel.add(element7);

     frame.add(panel);
     frame.setVisible(true);

  }
}