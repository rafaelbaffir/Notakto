package cstjean.mobile.notakto;



import android.content.Context;
import android.widget.Button;
import android.widget.Toast;


import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/**
 *
 */
public class Notakto {
    public Button[] boutons;
    static AtomicReference<Boolean> partieTerminer;
    AtomicInteger joueur;
    static Toast toast;

    /**
     * Constructeur de Notakto.
     * @param boutons liste de boutons qui servent de cases dans le jeu.
     * @param partieTerminer boul qui determine si la partie est fini.
     * @param joueur pour indiquer le tour des joueur.
     */
    public Notakto(Button[] boutons, AtomicReference<Boolean> partieTerminer, AtomicInteger joueur ){
        this.boutons = boutons;
        this.partieTerminer = partieTerminer;
        this.joueur = joueur;
        this.toast = toast;
    }


    /**
     * Pour passé d'un joueur à l'autre.
     * @param joueur pour indiquer le tour des joueur.
     */
    public static void joueurSuivant(AtomicInteger joueur){
        if (joueur.get() == 1) {
            joueur.addAndGet(1);
        }
        else {
            joueur.addAndGet(-1);
        }
    }

    /**
     * regles qui indique si les conditions sont bonne pour qu'il y est un gagnant/perdant.
     * @param notakto liste de boutons qui servent de cases dans le jeu.
     */
    public static void regles(Button[] notakto, Toast toast){
        if (notakto[0].getText() == "X" && notakto[1].getText() == "X" && notakto[2].getText() == "X") {
            partieTerminer.set(true);
            toast.show();
        }
        else if (notakto[3].getText() == "X" && notakto[4].getText() == "X" && notakto[5].getText() == "X") {
            partieTerminer.set(true);
            toast.show();
        }
        else if (notakto[6].getText() == "X" && notakto[7].getText() == "X" && notakto[8].getText() == "X") {
            partieTerminer.set(true);
            toast.show();
        }
        else if (notakto[0].getText() == "X" && notakto[3].getText() == "X" && notakto[6].getText() == "X") {
            partieTerminer.set(true);
            toast.show();
        }
        else if (notakto[1].getText() == "X" && notakto[4].getText() == "X" && notakto[7].getText() == "X") {
            partieTerminer.set(true);
            toast.show();
        }
        else if (notakto[2].getText() == "X" && notakto[5].getText() == "X" && notakto[8].getText() == "X") {
            partieTerminer.set(true);
            toast.show();
        }
        else if (notakto[0].getText() == "X" && notakto[4].getText() == "X" && notakto[8].getText() == "X") {
            partieTerminer.set(true);
            toast.show();
        }
        else if (notakto[2].getText() == "X" && notakto[4].getText() == "X" && notakto[6].getText() == "X") {
            partieTerminer.set(true);
            toast.show();
        }
    }
}

