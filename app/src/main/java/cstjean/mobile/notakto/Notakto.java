package cstjean.mobile.notakto;




import android.widget.Button;
import android.widget.Toast;

/**
 *
 */
public class Notakto {
    private static Notakto instance = null;

    private char[] notakto;
    private boolean partieTerminer;
    private int joueur = 1;

    /**
     * Constructeur de Notakto.
     */
    private Notakto(){
    }

    public static Notakto getInstance(){
        if(instance == null){
            instance = new Notakto();
        }
        return instance;
    }

    public char[] getBoutons(){
        return notakto;
    }

    public boolean isPartieTerminer() {
        return partieTerminer;
    }
    public int getJoueur(){
        return  joueur;
    }

    /**
     * Pour passé d'un joueur à l'autre.
     * @param joueur pour indiquer le tour des joueur.
     */
    public int joueurSuivant(int joueur){
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
     * @return
     */
    public boolean regles(){
        if (notakto[0] == 'X' && notakto[1] == 'X' && notakto[2] == 'X') {
            partieTerminer = true;
            //toast.show();
        }
        else if (notakto[3] == 'X' && notakto[4] == 'X' && notakto[5] == 'X') {
            partieTerminer = true;
            //toast.show();
        }
        else if (notakto[6] == 'X' && notakto[7] == 'X' && notakto[8] == 'X') {
            partieTerminer = true;
            //toast.show();
        }
        else if (notakto[0] == 'X' && notakto[3] == 'X' && notakto[6] == 'X') {
            partieTerminer = true;
            //toast.show();
        }
        else if (notakto[1] == 'X' && notakto[4] == 'X' && notakto[7] == 'X') {
            partieTerminer = true;
            //toast.show();
        }
        else if (notakto[2] == 'X' && notakto[5] == 'X' && notakto[8] == 'X') {
            partieTerminer = true;
            //toast.show();
        }
        else if (notakto[0] == 'X' && notakto[4] == 'X' && notakto[8] == 'X') {
            partieTerminer = true;
            //toast.show();
        }
        else if (notakto[2] == 'X' && notakto[4] == 'X' && notakto[6] == 'X') {
            partieTerminer = true;
            //toast.show();
        }
        return partieTerminer;
    }
}

