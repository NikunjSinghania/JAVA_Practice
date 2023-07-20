import java.awt.event.*;

public class CountClick extends AWTCounter implements ActionListener{
    static int ch = 0;
    public void actionPerformed(ActionEvent E)
    { 
        Object source = E.getSource();
        ch++;
        T.setText(String.valueOf(ch));
        System.out.println("HHEE");
    }
}
