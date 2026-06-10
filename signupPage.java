import javax.swing.*;
import java.awt.Color;
import helper_classes.*;

public class signupPage extends JFrame {

  public signupPage() {
    setTitle("Signup");
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setSize(703, 380);

    JPanel panel = new JPanel();
    panel.setLayout(null);
    panel.setBackground(Color.decode("#1e1e1e"));

    JLabel element1 = new JLabel("Signup");
    element1.setBounds(27, 21, 339, 67);
    element1.setFont(CustomFontLoader.loadFont("./resources/fonts/Lato.ttf", 50));
    element1.setForeground(Color.decode("#D9D9D9"));
    panel.add(element1);

    JButton backButton = new JButton("Back");
    backButton.setBounds(593, 311, 80, 30);
    backButton.setFont(CustomFontLoader.loadFont("./resources/fonts/Lato.ttf", 14));
    backButton.setBackground(Color.decode("#2e2e2e"));
    backButton.setForeground(Color.decode("#D9D9D9"));
    backButton.setFocusPainted(false);
    backButton.setBorder(new RoundedBorder(3, Color.decode("#979797"), 1));
    OnClickEventHelper.setOnClickColor(backButton, Color.decode("#232323"), Color.decode("#2e2e2e"));
    backButton.addActionListener(e -> {
      new homePage();
      dispose();
    });
    panel.add(backButton);

    JLabel element5 = new JLabel("Username");
    element5.setBounds(54, 114, 146, 37);
    element5.setFont(CustomFontLoader.loadFont("./resources/fonts/Lato.ttf", 30));
    element5.setForeground(Color.decode("#D9D9D9"));
    panel.add(element5);

    JTextField element4 = new JTextField("");
    element4.setBounds(54, 156, 200, 28);
    element4.setFont(CustomFontLoader.loadFont("./resources/fonts/Lato.ttf", 14));
    element4.setBackground(Color.decode("#B2B2B2"));
    element4.setForeground(Color.decode("#656565"));
    element4.setBorder(new RoundedBorder(2, Color.decode("#979797"), 0));
    OnFocusEventHelper.setOnFocusText(element4, "Username", Color.decode("#353535"), Color.decode("#656565"));
    panel.add(element4);

    JLabel element6 = new JLabel("Password");
    element6.setBounds(54, 201, 143, 33);
    element6.setFont(CustomFontLoader.loadFont("./resources/fonts/Lato.ttf", 30));
    element6.setForeground(Color.decode("#D9D9D9"));
    panel.add(element6);

    JPasswordField element7 = new JPasswordField("");
    element7.setBounds(54, 242, 200, 28);
    element7.setFont(CustomFontLoader.loadFont("./resources/fonts/Lato.ttf", 14));
    element7.setBackground(Color.decode("#B2B2B2"));
    element7.setForeground(Color.decode("#656565"));
    element7.setBorder(new RoundedBorder(2, Color.decode("#979797"), 0));
    element7.setEchoChar((char) 0); 
    element7.addFocusListener(new java.awt.event.FocusAdapter() {
      @Override
      public void focusGained(java.awt.event.FocusEvent e) {
        if (String.valueOf(element7.getPassword()).equals("Password")) {
          element7.setText("");
          element7.setForeground(Color.decode("#353535"));
        }
        element7.setEchoChar('•'); // hide characters when typing
      }
      @Override
      public void focusLost(java.awt.event.FocusEvent e) {
        if (element7.getPassword().length == 0) {
          element7.setEchoChar((char) 0); // show placeholder again
          element7.setText("Password");
          element7.setForeground(Color.decode("#656565"));
        }
      }
    });
    element7.setText("Password");
    panel.add(element7);

    add(panel);
    setVisible(true);
  }
}