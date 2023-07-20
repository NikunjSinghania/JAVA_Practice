import java.awt.*;

public class AWTCounter
{
    static TextField T = new TextField();

    public static void main(String[] args)
    {
        Frame F1 = new Frame("Counter");
        F1.setLocation(200, 200);
        F1.setSize(400, 400);
        F1.setBackground(Color.BLUE);
        F1.setVisible(true);
        FlowLayout FL = new FlowLayout(FlowLayout.LEFT, 20,  20);
        F1.setLayout(FL);
        Label L1 = new Label("Count");
        L1.setForeground(Color.WHITE);
        F1.add(L1);

        T.setEditable(false);
        F1.add(T);
        
        Button B1 = new Button("Click");
        
        F1.add(B1);

        B1.addActionListener(new CountClick());

    }
}