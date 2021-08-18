package jo.secondstep.singlton;

public class CurrentUser 
{   private String email;
    private String password;
    private static  CurrentUser user;
    
    
    private CurrentUser() {}
    
    
   public String getEmail() 
   {
	return email;
    }

   
   public void setEmail(String email) 
   {
	this.email = email;
    }

   
   public String getPassword() 
   {
	return password;
    }
   

   public void setPassword(String password) 
    {
	this.password = password;
    }


   public static CurrentUser getUser()
    {  
	   if (user==null) {
    	   synchronized(CurrentUser.class){
			 if(user == null) {
				 user=new CurrentUser();
		     }
		   }
       }

	   return user;
	   
    }


	

   
	
	
 
}
