
import java.awt.event.*;

class MyActionListener implements ActionListener
{
   public void actionPerformed(ActionEvent E)
   {
      Object source = E.getSource();
      System.out.println("Button Clicked 😁😁😁 " + source);
   }
}