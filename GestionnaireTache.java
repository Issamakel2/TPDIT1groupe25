public class GestionnaireTache{


    private Tache[] taches;
    private int nombreTache;

    public GestionnaireTache(int nombreMax){
        this.nombreTache = 0;
        this.taches = new Tache[nombreMax];
       