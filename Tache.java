
import java.util.Date;

Public class Tache {
	
       private int identifiant;
       private int dernierId = 1;
       private String titre;
       private String état;
       private Date dateCréation;

       public Tache (String titre) {
       	this.titre = titre;
       	this.dernierId = dernierId + 1;
       	this.état = "PREVU";
       	this.dateCréation = new Date();
       }
       public (String titre, String état){
       	  this.titre = titre;
       	  this.setEtat(état);
       	  this.dernierId = dernierId + 1;
       	  this.dateCréation = new Date();

       }
       public (String titre, String état, Date dateCréation){
       	  this.titre = titre;
       	  this.setEtat(état);
       	  this.dateCréation = dateCréation;
       	  this.dernierId = dernierId + 1;
       }
       public int getIdentifiant(){
	      	return identifiant ;
	      }

	      public int getDernierId (){
	      	return dernierId;
	      }
	      public String getTitre(){
	      	return titre;
	      }

	      public String getEtat(){
	      	return état;
	      }
	       public Date getDateCréation(){
	      	return dateCréation;
	      }
	      public void setIdentifiant(int identifiant){
          	  this.identifiant = identifiant;
          }
          public void setDernierId (int dernierId ){
          	  this.dernierId = dernierId;
          }
          public void setTitre(String titre){
          	  this.titre = titre;
          }
          public void setEtat (String état )
          {
                switch (état){

                      case EN_COURS :
                 	           this.état = état;
                 	           break;
                 	    case TERMINE  :
                 	           this.état = état;
                 	           break;
                 	    case PREVU  :
                 	           this.état = état;
                 	           break;
                }	 
          }
          public void setDateCréation (Date dateCréation ){
          	  this.dateCréation = dateCréation;
          }

	      public String toString() {
            String description = "";
		       description += "identifiant : " + this.identifiant;
		       description += "\ndernierId  : " + this.dernierId ;
		       description += "\ntitre  : " + this.titre;
		       description += "\nétat : " + this.état;
		       description += "\ndateCréation : " + this.dateCréation;

		       return description;

	      }
}