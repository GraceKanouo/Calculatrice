import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
/**
/** this class represents a graphical calculator application.
 * it extends the JFrame class to creat a window with buttons and a text field.
 * 
 * 
 * @author (Grace) 
 * @version (2023)
 */
public class CalculatriceGraphique extends JFrame
{
    // Instanzvariablen - ersetzen Sie das folgende Beispiel mit Ihren Variablen
    private JTextField textField;// the text field to display the calculator vinput output

    /**
     * Konstruktor für Objekte der Klasse CalculatriceGraphique
     * the constructorc sets up the GUI components and events handeling.
     */
    public CalculatriceGraphique() 
    {
        super("Calculator");// ets the title of the calculator

        //-------------------------TextField creation-----------------------------------

        textField = new JTextField(10);
        textField.setEditable(false);// make it non: editable

        //-------------------------creation of buttons--------------------------------
        JButton button0 = new JButton("0");
        JButton button1 = new JButton("1");
        JButton button2 = new JButton("2");
        JButton button3 = new JButton("3");
        JButton button4 = new JButton("4");
        JButton button5 = new JButton("5");
        JButton button6 = new JButton("6");
        JButton button7 = new JButton("7");
        JButton button8 = new JButton("8");
        JButton button9 = new JButton("9");
        JButton buttonPlus = new JButton("+");
        JButton buttonMinus = new JButton("-");
        JButton buttonMultiply = new JButton("*");
        JButton buttonDivide = new JButton("/");
        JButton buttonEquals = new JButton("=");
        JButton buttonClear = new JButton("C");
        JButton buttonDecimal = new JButton(".");

        //------------------------Creation of a layout Manager(panel for organising buttons)-----------------------------------

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(4,4));// this is a 4*4 layout grid for the buttons

        
        //-----------------------Adding of buttons on the Panel-------------------------------
        
        panel.add(textField);
        panel.add(button7);
        panel.add(button8);
        panel.add(button9);
        panel.add(buttonDivide);
        panel.add(button4);
        panel.add(button5);
        panel.add(button6);
        panel.add(buttonMultiply);
        panel.add(button1);
        panel.add(button2);
        panel.add(button3);
        panel.add(buttonMinus);
        panel.add(button0);
        panel.add(buttonEquals);
        panel.add(buttonPlus);
        panel.add(buttonClear);
        panel.add(buttonDecimal);
        //--------------------creation of a event listener/manager--------------------------------
        

        ButtonClickListener listener= new ButtonClickListener(textField);
        
        
        button0.addActionListener(listener);
        button1.addActionListener(listener);
        button2.addActionListener(listener);
        button3.addActionListener(listener);
        button4.addActionListener(listener);
        button5.addActionListener(listener);
        button6.addActionListener(listener);
        button7.addActionListener(listener);
        button8.addActionListener(listener);
        button9.addActionListener(listener);
        buttonPlus.addActionListener(listener);
        buttonMinus.addActionListener(listener);
        buttonDivide.addActionListener(listener);
        buttonMultiply.addActionListener(listener);
        buttonEquals.addActionListener(listener);
        buttonClear.addActionListener(listener);
        buttonDecimal.addActionListener(listener);

        //--------------------add components to the frame--------------------------------

        this.add(textField,BorderLayout.NORTH);
        
        this.add(panel, BorderLayout.CENTER);
        this.setSize(300,400);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();// resize the frame to fit the componemts
        setVisible(true);// make the frame viisble
    }

}
