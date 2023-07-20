import java.awt.*;

public class PanelBorder {
    public static void main(String[] args)
    {
        
        
        Frame newFrame = new Frame();
        newFrame.setSize(700, 700);
        newFrame.setVisible(true);

        newFrame.setLayout(new BorderLayout(20, 20));

        Panel East = new Panel();
        Panel West = new Panel();
        Panel North = new Panel();
        Panel South = new Panel();
        Panel Center = new Panel();

        East.setBackground(Color.CYAN);
        West.setBackground(Color.RED);
        North.setBackground(Color.BLUE);
        South.setBackground(Color.GREEN);
        Center.setBackground(Color.ORANGE);

        East.setPreferredSize(new Dimension(200, 200));
        West.setPreferredSize(new Dimension(200, 200));
        North.setPreferredSize(new Dimension(200, 200));
        South.setPreferredSize(new Dimension(200, 200));
        
        
        newFrame.add(East, BorderLayout.EAST);
        newFrame.add(West, BorderLayout.WEST);
        newFrame.add(North, BorderLayout.NORTH);
        newFrame.add(South, BorderLayout.SOUTH);
        newFrame.add(Center, BorderLayout.CENTER);
    }
}
