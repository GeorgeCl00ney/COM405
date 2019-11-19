
package week9_car;

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
    private JLabel lblTitle
            ,lblMake
            ,lblModel
            ,lblYear
            ,lblIsMOTValid
            ,lblCurrentSpeed
            ,lblMaxSpeed
            ,lblFuelLevel;
    private JTextField txtMake
            ,txtModel
            ,txtYear
            ,txtIsMOTValid
            ,txtCurrentSpeed
            ,txtMaxSpeed
            ,txtFuelLevel;
    private JButton btnAccelerate
            ,btnBrake
            ,btnRefuel;
    private GridBagConstraints constraints;
    private Car car;
    
    //CONSTRUCTOR
    GUI()
    {
        car = new Car("Wacky Racer","Creepy Coup",1968,true,666);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new GridBagLayout());
        constraints = new GridBagConstraints();
        //SET UP COMPONENTS
        initComponents();
        //Create the layout
        layoutComponents();
    }
    private void initComponents()
    {
        lblTitle = new JLabel("Dashboard");
        lblMake = new JLabel("Make:");
        lblModel = new JLabel("Model");
        lblYear = new JLabel("Year of manufacture");
        lblIsMOTValid = new JLabel("Is MOT valid?");
        lblCurrentSpeed = new JLabel("Current Speed");
        lblMaxSpeed = new JLabel("Maximum speed");
        lblFuelLevel = new JLabel("Current fuel level");
        txtMake = new JTextField(car.getMake());
        txtModel = new JTextField(car.getModel());
        txtYear = new JTextField(car.getYear());
        txtIsMOTValid = new JTextField();
        if(car.getIsMotValid())
        {
            txtIsMOTValid.setText("MOT is Valid");
        }
        else
        {
            txtIsMOTValid.setText("MOT needs re-newing");
        }
        txtCurrentSpeed = new JTextField(car.getCurrentSpeed());
        txtMaxSpeed = new JTextField(car.getMaxSpeed());
        txtFuelLevel = new JTextField(car.getFuelLevel());
        btnAccelerate = new JButton("Accelerate");
        btnAccelerate.addActionListener(this);
        btnBrake = new JButton("Brake");
        btnBrake.addActionListener(this);
        btnRefuel = new JButton("Refuel");
        btnRefuel.addActionListener(this);
    }
    private void layoutComponents()
    {
        constraints.gridx = 0;
        constraints.gridy = 0;
        constraints.gridwidth = 4;
        constraints.gridheight = 1;
        this.add(lblTitle, constraints);
        
        constraints.gridx = 1;
        constraints.gridy = 1;
        constraints.gridwidth = 1;
        this.add(lblMake, constraints);
        
        constraints.gridy = 2;
        constraints.gridwidth = 1;
        this.add(lblModel, constraints);
        
        constraints.gridy = 3;
        constraints.gridwidth = 1;
        this.add(lblYear, constraints);
        
        constraints.gridx = 0;
        constraints.gridy = 4;
        constraints.gridwidth = 2;
        this.add(lblIsMOTValid, constraints);
        
        constraints.gridy = 5;
        this.add(lblCurrentSpeed, constraints);
        
        constraints.gridy = 6;
        this.add(lblMaxSpeed, constraints);
        
        constraints.gridy = 7;
        this.add(lblFuelLevel, constraints);
        
        constraints.gridx = 2;
        constraints.gridy = 1;
        constraints.fill = GridBagConstraints.HORIZONTAL; //Make the text box fill the width of the column
        this.add(txtMake, constraints);
        
        constraints.gridy = 2;
        constraints.fill = GridBagConstraints.HORIZONTAL; //Make the text box fill the width of the column
        this.add(txtModel, constraints);
       
        constraints.gridy = 3;
        constraints.fill = GridBagConstraints.HORIZONTAL; //Make the text box fill the width of the column
        this.add(txtYear, constraints);
       
        constraints.gridy = 4;
        constraints.fill = GridBagConstraints.HORIZONTAL; //Make the text box fill the width of the column
        this.add(txtIsMOTValid, constraints);
       
        constraints.gridy = 5;
        constraints.fill = GridBagConstraints.HORIZONTAL; //Make the text box fill the width of the column
        this.add(txtCurrentSpeed, constraints);
       
        constraints.gridy = 6;
        constraints.fill = GridBagConstraints.HORIZONTAL; //Make the text box fill the width of the column
        this.add(txtMaxSpeed, constraints);
       
        constraints.gridy = 7;
        constraints.fill = GridBagConstraints.HORIZONTAL; //Make the text box fill the width of the column
        this.add(txtFuelLevel, constraints);
        
        constraints.gridx = 0;
        constraints.gridy = 8;
        constraints.gridwidth = 2;
        constraints.gridheight = 1;
        this.add(btnAccelerate, constraints);
        
        constraints.gridx = 2;
        constraints.gridy = 8;
        constraints.gridwidth = 2;
        constraints.gridheight = 1;
        this.add(btnAccelerate, constraints);
        
        constraints.gridx = 0;
        constraints.gridy = 9;
        constraints.gridwidth = 4;
        constraints.gridheight = 1;
        this.add(btnRefuel, constraints);
    }
    
    
    
    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
}
