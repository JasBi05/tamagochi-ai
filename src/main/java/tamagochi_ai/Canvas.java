package tamagochi_ai;

import java.awt.*;
import javax.swing.*;
public class Canvas{

    private JFrame frame;
    private JPanel contentPanel;
    private ImageIcon icon;
    
    public void createCanvas(){

        frame = new JFrame();
        contentPanel = new JPanel();

        icon = new ImageIcon("src\\assets\\heart.png");
        contentPanel.setLayout(new FlowLayout());

        frame.setContentPane(contentPanel);
        frame.setResizable(false);
        frame.setIconImage(icon.getImage());
        frame.setVisible(true);
        frame.setTitle("TamagAIchi");
        contentPanel.setBackground(new Color(255, 205, 210));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(750,750); 

    }

    public void addComponent(Component c){
        contentPanel.add(c);
        contentPanel.revalidate();
        contentPanel.repaint();
    }

    
}
