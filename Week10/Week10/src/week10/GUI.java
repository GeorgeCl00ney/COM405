
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
    private JLabel lblFeeTitle;
    private JLabel lblFee;
    private JTextField txtRegistration
            ,txtWeight;
    private JButton btnAdd;
    private JButton btnRemove;
    private Bridge bridge;

    //CONSTRUCTOR
    public GUI()
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
        lblCurrentLoad = new JLabel("0 kg");
        lblRegistration = new JLabel("Reg no:");
        lblWeight = new JLabel("Weight:");
        lblUserMessage = new JLabel(" - ");
        lblFeeTitle = new JLabel("Fee:");
        lblFee = new JLabel("£0.00");
        
        txtRegistration = new JTextField();
        txtWeight = new JTextField();
        
        btnAdd = new JButton("Add vehicle");
        btnAdd.addActionListener(this);//THIS IS IMPORTANT IT MARKS THE BUTTON AS AN ACTION!!
        btnRemove = new JButton("Remove vehicle");
        btnRemove.addActionListener(this);//THIS IS IMPORTANT IT MARKS THE BUTTON AS AN ACTION!! 
    }

    private void layoutComponents() 
    {
        
        GridBagConstraints constraints = new GridBagConstraints();
        
        constraints.gridx = 0;
        constraints.gridy = 0;
        constraints.gridwidth = 2;
        constraints.gridheight = 1;
        this.add(lblTitle, constraints);
        
        constraints.gridy = 1;
        constraints.gridwidth = 1;
        this.add(lblLoadLabel, constraints);
        
        constraints.gridy = 2;
        this.add(lblRegistration, constraints);
        
        constraints.gridy = 3;
        this.add(lblWeight, constraints);
        
        constraints.gridy = 4;
        this.add(btnAdd, constraints);
        
        constraints.gridx = 1;
        this.add(btnRemove, constraints);
        
        constraints.gridy = 3;
        constraints.fill = GridBagConstraints.HORIZONTAL; //Make the text box fill the width of the column
        this.add(txtWeight, constraints);
        
        constraints.gridy = 2;
        constraints.fill = GridBagConstraints.HORIZONTAL; //Make the text box fill the width of the column
        this.add(txtRegistration, constraints);
        
        constraints.gridx = 0;
        constraints.gridy = 5;
        constraints.gridwidth = 2;
        constraints.fill = GridBagConstraints.NONE; 
        this.add(lblUserMessage, constraints);
        
        constraints.gridx = 0;
        constraints.gridy = 6;
        constraints.gridwidth = 1;
        this.add(lblFeeTitle, constraints);
        
        constraints.gridx = 0;
        constraints.gridy = 6;
        constraints.gridwidth = 1;
        this.add(lblFee, constraints);
    }

    @Override
    public void actionPerformed(ActionEvent ev)
    {
        if(ev.getSource().equals(btnAdd))
        {
            String regIn = txtRegistration.getText();
            int weightIn = Integer.parseInt(txtWeight.getText());
            Vehicle vehIn = null;
            
            if(weightIn < 800)
            {
                vehIn = new Motorbike(regIn,weightIn);
            }
            else if(weightIn < 3500)
            {
                vehIn = new Car(regIn,weightIn);
            }
            else
            {
                vehIn = new Lorry(regIn,weightIn);
            }
            
            bridge.ad
            
        }
    }
}
