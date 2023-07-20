
import java.awt.*;

class Main{
   public static void main(String[] args)
   {
      /*
      System.out.println("1");
      Frame frame1 = new Frame();
      frame1.setSize(200,200);
      frame1.setVisible(true);
      System.out.println(frame1);
      */
      Frame frame2 = new Frame("FIRST FRAME");
      frame2.setLocation(100,100);
      frame2.setSize(400,400);
      frame2.setBackground(Color.RED);
      FlowLayout layout = new FlowLayout(FlowLayout.RIGHT,100,20);

      frame2.setLayout(layout);
      TextField t = new TextField("Example");
      TextField t2 = new TextField("LOCAL");

      t.setEditable(false);

      Button b = new Button("BUTTON CLICK");
      b.setBackground(Color.YELLOW);
      b.setForeground(Color.black);
      b.addActionListener(new MyActionListener());
      
      Label lab = new Label("Name", Label.LEFT);

      
      
      frame2.add(lab);
      frame2.add(b);
      frame2.add(t);
      frame2.add(t2);
      frame2.setVisible(true);

      System.out.println(t.isEditable());
      t2.setText("CHECK");
      System.out.println(t2.getText());
      System.out.println("2");
   }
}
