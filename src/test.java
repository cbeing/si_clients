import com.esprit.Etudiant;
import com.esprit.EtudiantService;
import com.esprit.EtudiantServiceService;
import com.esprit.Presence;
import com.esprit.Seance;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import javax.xml.*;

public class test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
	
	/*Etudiant etudiant = new Etudiant();
		etudiant.setNumInsc("12");
		etudiant.setAdresse("tunis");
		System.out.println("message 1");
		
		EtudiantService etudiantService = new EtudiantServiceService().getEtudiantServicePort();  ;
		System.out.println("message 2");
		etudiantService.updateetudiant(etudiant);
		System.out.println("rammeh batal ****");*/
		List<Presence> listePresence = new ArrayList<Presence>();
		EtudiantService etudiantService = new EtudiantServiceService().getEtudiantServicePort();
		
		listePresence = etudiantService.getListPres("16-4-2014");
       // Presence presence = new Presence();
		System.out.println(""+listePresence.size());
        for ( Presence presence : listePresence ){
        	
        	System.out.println(presence.getEtudiant().getNom());
 	
        	
        }
        
	}

}
