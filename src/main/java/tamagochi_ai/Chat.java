package tamagochi_ai;
import java.awt.*;
import javax.swing.*;

public class Chat {

    private JPanel chatPanel;
    private JTextArea area;
    private JTextField text;
    private Canvas canvas;


    public void createChat(Canvas canvas){
        this.canvas = canvas;
        chatPanel = new JPanel(new BorderLayout());
        area = new JTextArea();
        text = new JTextField();

        area.setPreferredSize(new Dimension(450, 450));
        area.setEditable(false);
        area.setBackground(new Color(255, 195, 195));

        JScrollPane scrollPane = new JScrollPane(area);
        chatPanel.add(scrollPane, BorderLayout.CENTER);

        text.setMargin(new Insets(-5, 2, -5, 2));
        text.setPreferredSize(new Dimension(450, 50));
        chatPanel.add(text, BorderLayout.SOUTH);
        canvas.addComponent(getPanel());
    }

    public JPanel getPanel(){
        return chatPanel;
    }
    
}
