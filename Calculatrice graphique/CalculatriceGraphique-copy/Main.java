import javax.swing.SwingUtilities;
/**this class serve as the entry point for the programm. it contains the main methode,which is
 * the starting point of execution when the programm is run.
 * 
 * 
 * 
 * @author (Grace) 
 * @version (2023)
 */
 
public class Main
{
    

    /**
     * Konstruktor für Objekte der Klasse Main
     */
    public Main()
    {
        super();
    }
    
    /**
     * the main methode creats an instance of the class Calculatrice graphique and directly lunch
     * the graphical calculator application
     * param args command line arguments
     */
    public static void main(String[] args)
    {
         SwingUtilities.invokeLater(() ->{
        CalculatriceGraphique calculator = new CalculatriceGraphique();
    });
        
    }
}
