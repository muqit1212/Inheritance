import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class MyFrame extends JFrame{
    JTextField Twidth,Tlength,Tarea,Tperimeter;
    double width,area,length,perimeter;
    public MyFrame(){
        this.setSize(600,600);
        this.setTitle("BSIT"+" "+"2nd 1 M");
        this.setVisible(true);
        Container pane= this.getContentPane();
        pane.setLayout(new GridLayout(6,2));
        JLabel lwidth=new JLabel("Enter Width:",SwingConstants.CENTER);
        JLabel llength=new JLabel("Enter Length:",SwingConstants.CENTER );
        JLabel larea=new JLabel("Enter Area:",SwingConstants.CENTER);
        JLabel lperimeter=new JLabel("Enter Perimeter:",SwingConstants.CENTER);
        Twidth=new JTextField();
        Tlength=new JTextField();
        Tarea=new JTextField();
        Tperimeter=new JTextField();
        pane.add(lwidth);
        pane.add(Twidth);
        pane.add(llength);
        pane.add(Tlength);
        pane.add(larea);
        pane.add(Tarea);
        pane.add(lperimeter);
        pane.add(Tperimeter);
        JButton calculate=new JButton("Calculate");
        pane.add(calculate);
        CalculateButtonHandler cbHandler;
        cbHandler =new CalculateButtonHandler();
        calculate.addActionListener(cbHandler);
        JButton clear=new JButton("Clear");
        pane.add(clear);
        ClearButtonHandler ebHandler;
        ebHandler=new ClearButtonHandler();
        clear.addActionListener(ebHandler);
        JButton exit=new JButton("Exit");
        pane.add(exit);
        ExitButtonHandler abHandler;
        abHandler=new ExitButtonHandler();
        exit.addActionListener(abHandler);
    }
    private class CalculateButtonHandler implements ActionListener {
        public void actionPerformed(ActionEvent e){
            width=Double.parseDouble(Twidth.getText());
            length=Double.parseDouble(Tlength.getText());
            area = length * width;
            perimeter = 2 * (length + width);
            Tarea.setText(" "+area);
            Tperimeter.setText(" "+perimeter);
        }
    }
    private class ClearButtonHandler implements ActionListener{
        public void actionPerformed(ActionEvent e){
            Twidth.setText("");
            Tlength.setText("");
            Tarea.setText("");
            Tperimeter.setText("");
        }
    }
    private class ExitButtonHandler implements ActionListener{
        public void actionPerformed(ActionEvent e){
            System.exit(0);
        }
    }
}
