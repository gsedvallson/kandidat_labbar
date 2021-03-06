package lastmileauto;

/**
 *
 * @author clary35
 */
public class LastMileAuto {

    DataStore ds;
    ControlUI cui;
    
    LastMileAuto(){

        /*
         * Initialize the DataStore call where all "global" data will be stored
         */
        ds = new DataStore();

       
        /*
         * Initialize and show the GUI. The constructor gets access to the DataStore
         */
        cui = new ControlUI(ds);
        cui.setVisible(true);
        cui.showStatus();
        
        
        /*
         * This sets the file path and read network text file. Adjust for your needs.
         */
        ds.setFileName("/Users/Burz/Documents/GitHub/kandidat_labbar/LastMileAuto/streets.txt");
        ds.readNet();
        
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        /* This is the "main" method what gets called when the application starts
         * All that is done here is to make an instance of the RobotControl class,
         * and thereby, call the RobotControl constructor.
        */
        LastMileAuto x = new LastMileAuto();
    }
}
