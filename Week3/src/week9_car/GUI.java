
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
            ,btnBrake;
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
        //layoutComponents();
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
    }
    
    
    
    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
}
