import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class TicTacToe {
    JFrame frame;
    JButton button1;
    JButton button2;
    JButton button3;
    JButton button4;
    JButton button5;
    JButton button6;
    JButton button7;
    JButton button8;
    JButton button9;
    String xO = "X";
    void result(){
        if((button4.getText()==button5.getText() && button5.getText()==button6.getText()) ||
            (button2.getText()==button5.getText() && button5.getText()==button8.getText()) ||
            (button1.getText()==button5.getText() && button5.getText()==button9.getText()) ||
            (button7.getText()==button5.getText() && button5.getText()==button3.getText()))
           JOptionPane.showMessageDialog(frame,"Player "+button5.getText()+" WON");
        
        
        else if((button1.getText()==button2.getText() && button2.getText()==button3.getText()) ||
                (button1.getText()==button4.getText() && button4.getText()==button7.getText()))
            JOptionPane.showMessageDialog(frame,"Player "+button1.getText()+" WON");
           
        else if((button7.getText()==button8.getText() && button8.getText()==button9.getText()) ||
           (button3.getText()==button6.getText() && button6.getText()==button9.getText())
           )
           JOptionPane.showMessageDialog(frame,"Player "+button9.getText()+" WON");
            

    }
    TicTacToe(){

        frame = new JFrame("TicTacToe");
        button1 = new JButton(" ");
        button2 = new JButton("  ");
        button3 = new JButton("   ");
        button4 = new JButton("    ");
        button5 = new JButton("     ");
        button6 = new JButton("      ");
        button7 = new JButton("       ");
        button8 = new JButton("        ");
        button9 = new JButton("         ");

        frame.add(button1);
        frame.add(button2);
        frame.add(button3);
        frame.add(button4);
        frame.add(button5);
        frame.add(button6);
        frame.add(button7);
        frame.add(button8);
        frame.add(button9);

        button1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                button1.setText(xO);
                xO = xO=="X" ? "O" : "X";
                result();
            }
        });
        button2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                button2.setText(xO); 
                xO = xO=="X" ? "O" : "X";
                result();
            }
        });
        button3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                button3.setText(xO); 
                xO = xO=="X" ? "O" : "X";
                result();
            }
        });
        button4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                button4.setText(xO); 
                xO = xO=="X" ? "O" : "X";
                result();
            }
        });
        button5.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                button5.setText(xO); 
                xO = xO=="X" ? "O" : "X";
                result();
            }
        });
        button6.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                button6.setText(xO); 
                xO = xO=="X" ? "O" : "X";
                result();
            }
        });
        button7.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                button7.setText(xO); 
                xO = xO=="X" ? "O" : "X";
                result();
            }
        });
        button8.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                button8.setText(xO); 
                xO = xO=="X" ? "O" : "X";
                result();
            }
        });
        button9.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                button9.setText(xO); 
                xO = xO=="X" ? "O" : "X";
                result();
            }
        });

        frame.setLayout(new GridLayout(3,3));
        frame.setSize(500, 500);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    public static void main(String[] args) {
        new TicTacToe();
    }
}
