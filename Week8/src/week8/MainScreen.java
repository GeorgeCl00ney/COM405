
package week8;

import java.awt.GridBagLayout;
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

    private JTextField txtRegNo;
    private JTextField txtColour;
    private JTextField txtMake;
    private JTextField txtModel;

    private JButton btnAdd;
    private JButton btnRemove;
    
    //CONSTRUCTOR - and methods used in the constructor
    MainScreen()
    {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new GridBagLayout());
    }
    public void initComponents()
    {
        lblTitle = new JLabel("Car park console");
        lblRegistration = new JLabel("Reg no.");
        lblColour = new JLabel("Colour");
        lblMake = new JLabel("Make");
        lblModel = new JLabel("Model");
        lblStatus = new JLabel("The car park is empty");
        
        txtRegNo = new JTextField();
        txtColour = new JTextField();
        txtMake = new JTextField();
        txtModel = new JTextField();
        
        btnAdd = new JButton("Add car");
        btnRemove = new JButton("Remove car");
    }
    
    
    
}
