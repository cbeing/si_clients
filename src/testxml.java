/*

import java.io.FileWriter;
import java.io.IOException;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
 
public class testxml {
     public static void main(String[] args) {


	JSONObject objEtudiant = new JSONObject();
	
	
	JSONObject obj = new JSONObject();
	obj.put("time", "20:20");
	obj.put("id", "100");
 
	JSONObject obj1 = new JSONObject();
	obj1.put("time", "20:20");
	obj1.put("id", "101");
	
	JSONObject obj2 = new JSONObject();
	obj2.put("time", "20:20");
	obj2.put("id", "102");
	
	
	JSONArray list = new JSONArray();
	list.add(obj);
	list.add(obj1);
	list.add(obj2);

	objEtudiant.put("Etudiant", list);
 
	try {
 
		FileWriter file = new FileWriter("test.json");
		
		file.write(objEtudiant.toJSONString());
		file.flush();
		file.close();
 
	} catch (IOException e) {
		e.printStackTrace();
	}
 
	System.out.print(obj);
 
     }
 
} 
*/

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import javax.print.attribute.standard.PresentationDirection;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import com.esprit.Etudiant;
import com.esprit.EtudiantService;
import com.esprit.EtudiantServiceService;
import com.esprit.Presence;
import com.esprit.Seance;
 
public class testxml  {
     public static void main(String[] args) throws java.text.ParseException {
    	 
    	 String datee="";
    	 String  hr="";
    	 SimpleDateFormat sdf = new SimpleDateFormat("dd-M-yyyy hh:mm:ss");
    		//
 
	JSONParser parser = new JSONParser();
	//Etudiant etudiant = new Etudiant();
	List<Presence> listePresences = new ArrayList<Presence>();
	List<time_pres> idliste =new ArrayList<time_pres>();
	
	EtudiantService etudiantService = new EtudiantServiceService().getEtudiantServicePort(); 
	

 
	try {
 
		Object obj = parser.parse(new FileReader("/tmp/update.json"));
 
		JSONObject jsonObject = (JSONObject) obj;
		//System.out.println(jsonObject.toJSONString());

 
		// loop array
		JSONArray Etudiants = (JSONArray) jsonObject.get("etudiants");
		
		
		Iterator<JSONObject> iterator = Etudiants.iterator();
		//List<Presence> listePresence = new ArrayList<Presence>();
		
		while (iterator.hasNext()) {
			

			JSONObject tmp = iterator.next();
			//System.out.println(tmp.get("time"));
			
			
			
			String dateInString = tmp.get("time").toString();
			
			//System.out.println("**************");
			Date date = sdf.parse(dateInString);
			  Calendar cal = Calendar.getInstance();
			  cal.setTime(date);
			  int a = cal.get(Calendar.DATE);
			  int b = cal.get(Calendar.MONTH)+1;
			  int c = cal.get(Calendar.YEAR);
			  
			  hr=cal.get(Calendar.HOUR)+":"+cal.get(Calendar.MINUTE);
			  //System.out.println(hr+"***********");
			  
        // System.out.println(b);
         //System.out.println(b+1);
       datee=""+a+"-"+b+"-"+c;
       
       
       
       
       
       
       
        // System.out.println(datee);
		
			//System.out.println("**************");
			

         	
       Etudiant etudiant = new Etudiant(); 
       etudiant=null;
		etudiant = etudiantService.getEtudiantByid(tmp.get("data").toString());
			
		
			if(etudiant!=null){
				
			System.out.println(etudiant.getNom()+"+++");
				
				Presence presence = new Presence();
				presence.setEtat(true);
				presence.setEtudiant(etudiant);
				presence.setId(3);
				Seance seance = new Seance();
				seance.setId(1);
				presence.setSeance(seance);
				presence.setHEntree(hr);
				etudiantService.updatepresence(presence);
			}
				
		 if(tmp.get("data").toString().equals(""+125)){
			 Etudiant etudiantt = new Etudiant(); 
				etudiantt = etudiantService.getEtudiantByid(tmp.get("data").toString());
				System.out.println(etudiantt.getNom()+"----");
			    Presence presencce = new Presence();
   				presencce.setEtat(true);
   				presencce.setEtudiant(etudiantt);
   				presencce.setId(2);
   				Seance seancce = new Seance();
   				seancce.setId(1);
   				presencce.setSeance(seancce);
   				presencce.setHEntree(hr);
   				etudiantService.updatepresence(presencce);
				
			}
		
			
			
			
			
			
			
			
			
			
			/*
				System.out.println(" message 1");
                Presence presence = new Presence();
				presence.setEtat(true);
				presence.setEtudiant(etudiant);
				presence.setId(1);
				Seance seance = new Seance();
				seance.setId(1);
				presence.setSeance(seance);
				presence.setHEntree(tmp.get("time").toString());
				etudiantService.updatepresence(presence);
				//listePresence.add(presence);
				System.out.println("rameh mib****");
			System.out.println(tmp.get("data")); 
*/

		}
		

		
		

 
	} catch (FileNotFoundException e) {
		e.printStackTrace();
	} catch (IOException e) {
		e.printStackTrace();
	} catch (ParseException e) {
		e.printStackTrace();
	}
	
	
  /*
	listePresences = etudiantService.getListPres(datee);
	
	
    for ( Presence presence : listePresences ){
    	
    	System.out.println(presence.getEtudiant().getNom());	
    }*/
	/*
    for ( time_pres preslist : idliste ){
    	
    	if(preslist.getId()==125+""){
     	Etudiant etudiant = new Etudiant(); 
		etudiant = etudiantService.getEtudiantByid(preslist.getId());
		
		 Presence presence = new Presence();
			presence.setEtat(true);
			presence.setEtudiant(etudiant);
			presence.setId(2);
			Seance seance = new Seance();
			seance.setId(1);
			presence.setSeance(seance);
			presence.setHEntree(hr);
			etudiantService.updatepresence(presence);
			//listePresence.add(presence);
		
    	}else if(preslist.getId()==9876+""){
    		System.out.println("message 1");
    	     	Etudiant etudiant = new Etudiant(); 
    			etudiant = etudiantService.getEtudiantByid(preslist.getId());
    			
    			 Presence presence = new Presence();
    				presence.setEtat(true);
    				presence.setEtudiant(etudiant);
    				presence.setId(2);
    				Seance seance = new Seance();
    				seance.setId(2);
    				presence.setSeance(seance);
    				presence.setHEntree(hr);
    				etudiantService.updatepresence(presence);
    				//listePresence.add(presence);
    			
    	}
		
    		
    }*/
	
	
	
	
	
 
     }
}
     
     
 
 
