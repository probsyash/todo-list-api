import javax.swing.*;
import java.awt.Color;
import java.awt.event.ActionListener;

import helper_classes.*;

public class homePage extends JFrame{
  public static void main(String[] args) {
    new homePage();
  }

  public homePage(){
      setTitle("Home Page");
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      setSize(703, 380);

      JPanel panel = new JPanel();
      panel.setLayout(null);
      panel.setBackground(Color.decode("#1e1e1e"));

     JLabel element1 = new JLabel("To-Do List");
     element1.setBounds(234, 126, 243, 65);
     element1.setFont(CustomFontLoader.loadFont("./resources/fonts/Lato.ttf", 50));
     element1.setForeground(Color.decode("#D9D9D9"));
     panel.add(element1);

     JButton element2 = new JButton("Log-in");
     element2.setBounds(293, 198, 113, 38);
     element2.setBackground(Color.decode("#2e2e2e"));
     element2.setForeground(Color.decode("#D9D9D9"));
     element2.setFont(CustomFontLoader.loadFont("./resources/fonts/Lato.ttf", 20));
     element2.setBorder(new RoundedBorder(4, Color.decode("#979797"), 1));
     element2.setFocusPainted(false);
     OnClickEventHelper.setOnClickColor(element2, Color.decode("#232323"), Color.decode("#2e2e2e"));
    element2.addActionListener(e -> {
      new loginPage();
      dispose();
    });
     
     panel.add(element2);

     JButton element3 = new JButton("Sign-up");
     element3.setBounds(302, 249, 95, 29);
     element3.setBackground(Color.decode("#2e2e2e"));
     element3.setForeground(Color.decode("#D9D9D9"));
     element3.setFont(CustomFontLoader.loadFont("./resources/fonts/Lato.ttf", 14));
     element3.setBorder(new RoundedBorder(4, Color.decode("#979797"), 1));
     element3.setFocusPainted(false);
     OnClickEventHelper.setOnClickColor(element3, Color.decode("#232323"), Color.decode("#2e2e2e"));
     element3.addActionListener(e -> {
      new signupPage();
      dispose();
    });
     
     panel.add(element3);

     add(panel);
     setVisible(true);
  }
}