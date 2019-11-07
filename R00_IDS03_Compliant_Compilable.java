/******************************************************************************
 *  Rule00 - IDS03
 *  Compliant Solution
 ******************************************************************************/

import java.util.logging.*;
import java.util.regex.Pattern;

public class R00_IDS03_Compliant_Compilable{
   public static void main(String[] args)
   { 
       Boolean loginSuccessful=true; 
       String username="&/^*¨¨Ç:^**Ñ¨:*¨;^L;^^";
       Logger logger = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME); 
       R00_IDS03_Compliant sm=new R00_IDS03_Compliant();
       if (loginSuccessful) {
	       logger.severe("User login succeeded for: " + sm.sanitizeUser(username));
       }else{
	       logger.severe("User login failed for: " + sm.sanitizeUser(username));
       }
   }
    
    public String sanitizeUser(String username) {
	   return Pattern.matches("[A−Za−z0−9 ]+", username) ?username: "unauthorized user ";
    }
}