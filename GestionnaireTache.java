Public class GestionnaireTache {

    private Tache[] taches;
    private int nombreTache;

    public GestionnaireTache (int nombreMax){
        this.taches = new Tache[nombreMax];
        this.nombreTache = 0;
    }
    public boolean ajouter(Tache tache){
         if (this.nombreTache == this.nombreMax){
            return false
         }
         else {
            this.taches = [nombreTache] = tache;
            this.nombreTache++;
            return true;
         }
    }





}