import java.awt.*;
public class Lambda1 {
    public static void main(String[] args) {
        Frame frame=new Frame("ActionListener java8");
        Button b=new Button("Click Here");
        b.setBounds(50,100,80,50);
        Button b1 = new Button("Say HI");
        b1.setBounds(20,40,50,50);
        b.addActionListener(e -> System.out.println("Hello World"));

        frame.add(b1);
        frame.add(b);
        frame.setSize(200,200);
        frame.setLayout(null);
        frame.setVisible(true);
    }
}
