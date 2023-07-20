import java.awt.*;
public class GridLayout {
    public static void main(String[] args)
    {
        Frame Third = new Frame();
        Third.setSize(400, 400);
        Third.setLocation(200, 200);
        Third.setVisible(true);

        //GridLayout GridL = new GridLayout();
        Third.setLayout((LayoutManager)new GridLayout());

        Third.add(new Button("NAME"));

    }
}
