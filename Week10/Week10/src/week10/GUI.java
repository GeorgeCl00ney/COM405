
package week10;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class GUI extends JFrame implements ActionListener
{
    //ATTRIBUTES
    private JLabel lblTitle;
    private JLabel lblLoadLabel;
    private JLabel lblCurrentLoad;
    private JLabel lblRegistration;
    private JLabel lblWeight;
    private JLabel lblUserMessage;
    private JLabel lblFee;
    private JTextField txtRegistration
            ,txtWeight;
    private JButton btnAdd;
    private JButton btnRemove;
    private GridBagConstraints constraints;

    //CONSTRUCTOR
    GUI()
    {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new GridBagLayout());
        //SET UP COMPONENTS
        initComponents();
        //Create the layout
        layoutComponents();
    }

    private void initComponents() 
    {
        lblTitle = new JLabel("Bridge System:");
        lblLoadLabel = new JLabel("Current load:");
        lblCurrentLoad = new JLabel("");
        lblRegistration = new JLabel("Reg no:");
        lblWeight = new JLabel("Weight:");
        lblUserMessage = new JLabel("");
        lblFee = new JLabel("");
        
        txtRegistration = new JTextField();
        txtWeight = new JTextField();
        
        btnAdd = new JButton("Add vehicle");
        btnAdd.addActionListener(this);//THIS IS IMPORTANT IT MARKS THE BUTTON AS AN ACTION!!
        btnRemove = new JButton("Remove vehicle");
        btnAdd.addActionListener(this);//THIS IS IMPORTANT IT MARKS THE BUTTON AS AN ACTION!! 
    }

    private void layoutComponents() 
    {
        
    }

    @Override
    public void actionPerformed(ActionEvent ev)
    {
        
    }
}
