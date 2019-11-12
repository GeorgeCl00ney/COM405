
package week8;

/*
For each new item we use in the Construction of the GUI we basically:
    (i)     Import the class
    (ii)    Add the thing as an attribute
    (iii)   Create the item in the constructor
    (iv)    Use the item in a Method

We can add the attribute first and NetBeans will prompt us to import the class
*/

import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class MainScreen extends JFrame implements ActionListner
{
    //ATTRIBUTES
    private JLabel lblTitle;
    private JLabel lblRegistration;
    private JLabel lblColour;
    private JLabel lblMake;
    private JLabel lblModel;
    private JLabel lblStatus;
    private JTextField txtRegistration;
    private JTextField txtColour;
    private JTextField txtMake;
    private JTextField txtModel;
    private JButton btnAdd;
    private JButton btnRemove;
    private GridBagConstraints constraints;
    
    //CONSTRUCTOR - and methods used in the constructor
    MainScreen()
    {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new GridBagLayout());
        constraints = new GridBagConstraints();
        //SET UP COMPONENTS
        initComponents();
        //Create the layout
        layoutComponents();
    }
    
    public void initComponents()
    {
        lblTitle = new JLabel("Car park console");
        lblRegistration = new JLabel("Reg no.");
        lblColour = new JLabel("Colour");
        lblMake = new JLabel("Make");
        lblModel = new JLabel("Model");
        lblStatus = new JLabel("The car park is empty");
        
        txtRegistration = new JTextField();
        txtColour = new JTextField();
        txtMake = new JTextField();
        txtModel = new JTextField();
        
        btnAdd = new JButton("Add car");
        btnRemove = new JButton("Remove car");
    }
    
    public void layoutComponents()
    {
        constraints.gridx = 1;
        constraints.gridy = 1;
        constraints.gridwidth = 5;
        constraints.gridheight = 1;
        this.add(lblTitle, constraints);
        
        constraints.gridx = 1;
        constraints.gridy = 3;
        constraints.gridwidth = 2;
        constraints.gridheight = 1;
        this.add(lblRegistration, constraints);
        
        constraints.gridx = 1;
        constraints.gridy = 5;
        constraints.gridwidth = 2;
        constraints.gridheight = 1;
        this.add(lblColour, constraints);
        
        constraints.gridx = 1;
        constraints.gridy = 7;
        constraints.gridwidth = 2;
        constraints.gridheight = 1;
        this.add(lblMake, constraints);
        
        constraints.gridx = 1;
        constraints.gridy = 9;
        constraints.gridwidth = 2;
        constraints.gridheight = 1;
        this.add(lblModel, constraints);
        
        constraints.gridx = 4;
        constraints.gridy = 3;
        constraints.gridwidth = 2;
        constraints.gridheight = 1;
        constraints.fill = GridBagConstraints.HORIZONTAL; //Make the text box fill the width of the column
        this.add(txtRegistration, constraints);
        
        constraints.gridx = 4;
        constraints.gridy = 5;
        constraints.gridwidth = 2;
        constraints.gridheight = 1;
        this.add(txtColour, constraints);
        
        constraints.gridx = 4;
        constraints.gridy = 7;
        constraints.gridwidth = 2;
        constraints.gridheight = 1;
        this.add(txtMake, constraints);
        
        constraints.gridx = 4;
        constraints.gridy = 9;
        constraints.gridwidth = 2;
        constraints.gridheight = 1;
        this.add(txtModel, constraints);
        
        constraints.fill = GridBagConstraints.NONE; //Remove the 'fill the width of the column' constraint
        constraints.gridx = 1;
        constraints.gridy = 11;
        constraints.gridwidth = 5;
        constraints.gridheight = 1;
        this.add(lblStatus, constraints);
        
        constraints.gridx = 1;
        constraints.gridy = 13;
        constraints.gridwidth = 2;
        constraints.gridheight = 1;
        this.add(btnAdd, constraints);
        
        constraints.gridx = 4;
        constraints.gridy = 13;
        constraints.gridwidth = 2;
        constraints.gridheight = 1;
        this.add(btnRemove, constraints);
        
    }
    
    
}
