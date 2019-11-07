/******************************************************************************
 *  Rule00 - IDS03
 *
 ******************************************************************************/
import java.util.logging.*;

public class R00_IDS03_Compilable{
   public static void main(String[] args)
   { 
       Boolean loginSuccessful=true; 
       String username="&/^*¨¨Ç:^**Ñ¨:*¨;^L;^^";
       Logger logger = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME); 
       if (loginSuccessful) {
	       logger.severe("User login succeeded for: " + username);
       }else{
	       logger.severe("User login failed for: " + username);
       }
   }
}


