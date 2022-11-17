package cstjean.mobile.notakto;




import android.widget.Button;
import android.widget.Toast;

/**
 *
 */
public class Notakto {
    private static Notakto instance = null;

    private static Button[] boutons;
    private boolean partieTerminer;
    private int joueur = 1;
    private final Toast toast;

    /**
     * Constructeur de Notakto.
     * @param boutons liste de boutons qui servent de cases dans le jeu.
     * @param partieTerminer boul qui determine si la partie est fini.
     * @param joueur pour indiquer le tour des joueur.
     */
    private Notakto(Button[] boutons, boolean partieTerminer, int joueur, Toast toast){
        this.boutons = new Button[9];
        this.partieTerminer = partieTerminer;
        this.joueur = joueur;
        this.toast = toast;
    }

    public static Notakto getInstance(){
        if(instance == null){
            instance = new Notakto( boutons, partieTerminer, joueur, toast);
        }
        return instance;
    }

    public Button[] getBoutons(){
        return boutons;
    }

    public static boolean isPartieTerminer() {
        return partieTerminer;
    }
    public int getJoueur(){
        return  joueur;
    }

    /**
     * Pour passé d'un joueur à l'autre.
     * @param joueur pour indiquer le tour des joueur.
     */
    public static int joueurSuivant(int joueur){
        if (joueur == 1) {
            joueur += 1;
        }
        else {
            joueur += -1;
        }
        return joueur;
    }

    /**
     * regles qui indique si les conditions sont bonne pour qu'il y est un gagnant/perdant.
     * @param notakto liste de boutons qui servent de cases dans le jeu.
     * @param partieTerminer
     * @return
     */
    public static boolean regles(Button[] notakto){
        if (notakto[0].getText() == "X" && notakto[1].getText() == "X" && notakto[2].getText() == "X") {
            partieTerminer = true;
            //toast.show();
        }
        else if (notakto[3].getText() == "X" && notakto[4].getText() == "X" && notakto[5].getText() == "X") {
            partieTerminer = true;
            //toast.show();
        }
        else if (notakto[6].getText() == "X" && notakto[7].getText() == "X" && notakto[8].getText() == "X") {
            partieTerminer = true;
            //toast.show();
        }
        else if (notakto[0].getText() == "X" && notakto[3].getText() == "X" && notakto[6].getText() == "X") {
            partieTerminer = true;
            //toast.show();
        }
        else if (notakto[1].getText() == "X" && notakto[4].getText() == "X" && notakto[7].getText() == "X") {
            partieTerminer = true;
            //toast.show();
        }
        else if (notakto[2].getText() == "X" && notakto[5].getText() == "X" && notakto[8].getText() == "X") {
            partieTerminer = true;
            //toast.show();
        }
        else if (notakto[0].getText() == "X" && notakto[4].getText() == "X" && notakto[8].getText() == "X") {
            partieTerminer = true;
            //toast.show();
        }
        else if (notakto[2].getText() == "X" && notakto[4].getText() == "X" && notakto[6].getText() == "X") {
            partieTerminer = true;
            //toast.show();
        }
        return partieTerminer;
    }
}

