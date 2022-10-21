package cstjean.mobile.notakto;

import static java.security.AccessController.getContext;

import android.widget.Button;
import android.widget.Toast;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

public class Notakto {
    public Button[] boutons;
    AtomicReference<Boolean> partieTerminé = new AtomicReference<>(false);
    AtomicInteger joueur = new AtomicInteger(1);
    //Toast toast;

    public Notakto(Button[] boutons, AtomicReference<Boolean> partieTerminé, AtomicInteger joueur ){
        this.boutons = boutons;
        this.partieTerminé = partieTerminé;
        this.joueur = joueur;
        //this.toast = toast;
    }



    public static void joueurSuivant(AtomicInteger joueur){
        if (joueur.get() == 1) {
            joueur.addAndGet(1);
        }
        else {
            joueur.addAndGet(-1);
        }
    }

    public void regles(Button[] notakto){
        if (notakto[0].getText() == "X" && notakto[1].getText() == "X" && notakto[2].getText() == "X") {
            partieTerminé.set(true);
            //toast.show();
        }
        else if (notakto[3].getText() == "X" && notakto[4].getText() == "X" && notakto[5].getText() == "X") {
            partieTerminé.set(true);
            //toast.show();
        }
        else if (notakto[6].getText() == "X" && notakto[7].getText() == "X" && notakto[8].getText() == "X") {
            partieTerminé.set(true);
            //toast.show();
        }
        else if (notakto[0].getText() == "X" && notakto[3].getText() == "X" && notakto[6].getText() == "X") {
            partieTerminé.set(true);
            //toast.show();
        }
        else if (notakto[1].getText() == "X" && notakto[4].getText() == "X" && notakto[7].getText() == "X") {
            partieTerminé.set(true);
            //toast.show();
        }
        else if (notakto[2].getText() == "X" && notakto[5].getText() == "X" && notakto[8].getText() == "X") {
            partieTerminé.set(true);
            //toast.show();
        }
        else if (notakto[0].getText() == "X" && notakto[4].getText() == "X" && notakto[8].getText() == "X") {
            partieTerminé.set(true);
            //toast.show();
        }
        else if (notakto[2].getText() == "X" && notakto[4].getText() == "X" && notakto[6].getText() == "X") {
            partieTerminé.set(true);
            //toast.show();
        }
    }
}

