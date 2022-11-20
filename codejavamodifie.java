public class GestionnaireTache
{

    // Les attributs Classe GestionnaireTache

    private Tache[] taches;
    private int nombreTache;

    // Les méthode Classe GestionnaireTache

    public GestionnaireTache(int nombreMax)
    {
        this.taches = new Tache[nombreMax];
        this.nombreTache = 0;
    }

    public boolean ajouter(Tache tache)
    {
        if (this.nombreTache == this.taches.length)
        {
            return false;
        }
        else
        {
            this.taches[nombreTache] = tache ;
            this.nombreTache++;
            return true;
        }
    }

    public boolean modifier(Tache tache)
    {

        int i = 0;
        boolean bool = true;

        do
        {
            if(this.taches[i].getIdentifiant() == tache.getIdentifiant())
            {
                this.taches[i].setTitre(tache.getTitre());
                this.taches[i].setEtat(tache.getEtat());
                this.taches[i].setDateDeCreation(tache.getDateDeCreation());
                bool = false;
            }
            i++;
        }while(bool = true && i < this.nombreTache);
        
        return bool;
    }

    public boolean supprimer(int id)
    {

        boolean bool = true;
        int i = 0;

        do
        {
            if(this.taches[i].getIdentifiant() == id)
            {
                bool = false;
                for(int j = i; j < (this.nombreTache - 1); j++) 
                {
                    this.taches[j] = this.taches[j + 1];
                }
                this.taches[this.nombreTache] = null;
                this.nombreTache--;
            }
            i++;
        }while(bool = true && i < this.nombreTache);

        return bool;
    }

    public Tache[] lister()
    {
        return this.taches;
    }

    public Tache[] lister(String etat) 
    {
        Tache[] listeTaches = new Tache[this.nombreTache];
        int j = 0;
            for (int i = 0; i < taches.length; i++) 
            {
                if (this.taches[i].getEtat().equals(etat)) 
                {
                    listeTaches[j] = this.taches[i];
                    j++;
                }
            }
        return listeTaches;
    }
}