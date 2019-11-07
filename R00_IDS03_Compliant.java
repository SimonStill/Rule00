/******************************************************************************
 *  Rule00 - IDS03
 *  Compliant Solution
 ******************************************************************************/


if (loginSuccessful) {
   logger.severe("User login succeeded for: " + sm.sanitizeUser(username));
}else{
   logger.severe("User login failed for: " + sm.sanitizeUser(username));
}


public String sanitizeUser(String username) {
   return Pattern.matches("[A−Za−z0−9 ]+", username) ?username: "unauthorized user ";
}
