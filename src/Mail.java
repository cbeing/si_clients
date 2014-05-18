


import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Properties;

import javax.activation.DataHandler;
import javax.activation.FileDataSource;
import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import com.esprit.Etudiant;
import com.esprit.EtudiantService;
import com.esprit.EtudiantServiceService;
import com.esprit.Presence;
import com.esprit.Seance;

public class Mail {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		

		JSONParser parser = new JSONParser();
		EtudiantService etudiantService = new EtudiantServiceService().getEtudiantServicePort(); 
		String mail="mohamed.lendolsi@esprit.tn";

	 
		try {
	 
			Object obj = parser.parse(new FileReader("/tmp/update.json"));
	 
			JSONObject jsonObject = (JSONObject) obj;
			JSONArray Etudiants = (JSONArray) jsonObject.get("etudiants");
			
			
			Iterator<JSONObject> iterator = Etudiants.iterator();
			
			while (iterator.hasNext()) {
				

				JSONObject tmp = iterator.next();

	       Etudiant etudiant = new Etudiant(); 
	       etudiant=null;
			etudiant = etudiantService.getEtudiantByid(tmp.get("data").toString());
			mail= etudiant.getClasse().getEmail();
			break;
		}
			
 
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
	
		
		
		//////////////////////////////////////////
		
        Properties props = new Properties();
  props.put("mail.smtp.host", "smtp.gmail.com");
  props.put("mail.smtp.socketFactory.port", "465");
  props.put("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");
  props.put("mail.smtp.auth", "true");
  props.put("mail.smtp.port", "465");
  
  Session session = Session.getDefaultInstance(props,
          new javax.mail.Authenticator() {
          protected PasswordAuthentication getPasswordAuthentication(){
          return new PasswordAuthentication("CelestialBeing4sleam@gmail.com", "4sleam4sleam");
          
          }
          } 
          );
		
		
  
  try{
      Message message=new MimeMessage(session);
      message.setFrom(new InternetAddress("CelestialBeing4sleam@gmail.com"));
      message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(mail));
      message.setSubject("Mail test from SI");
      

   // create the message part 
      MimeBodyPart messageBodyPart = 
        new MimeBodyPart();

      //fill message
      messageBodyPart.setText("test");

      Multipart multipart = new MimeMultipart();
      multipart.addBodyPart(messageBodyPart);

      // Part two is attachment
      messageBodyPart = new MimeBodyPart();
      javax.activation.DataSource source = 
        new FileDataSource("/tmp/slides+notes.pdf");
      messageBodyPart.setDataHandler(
        new DataHandler(source));
      messageBodyPart.setFileName("/tmp/slides+notes.pdf");
      multipart.addBodyPart(messageBodyPart);
      
      
      
      
      
      
      
       message.setContent(multipart);

     Transport.send(message);
     
      }catch(Exception e){
     
      }
  
	}

}
