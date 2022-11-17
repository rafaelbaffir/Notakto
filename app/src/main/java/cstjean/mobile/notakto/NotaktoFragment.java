package cstjean.mobile.notakto;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

public class NotaktoFragment extends Fragment {
    private TextView txtWinner;
    private Button btnReStart;
    private Button[] boutons = Notakto.getInstance().getBoutons();
    
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @SuppressLint({"MissingInflatedId", "SetTextI18n"})
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.notaktotemp, container, false);
        boutons[0] = (view.findViewById(R.id.btn_1));
        boutons[1] = (view.findViewById(R.id.btn_2));
        boutons[2] = (view.findViewById(R.id.btn_3));
        boutons[3] = (view.findViewById(R.id.btn_4));
        boutons[4] = (view.findViewById(R.id.btn_5));
        boutons[5] = (view.findViewById(R.id.btn_6));
        boutons[6] = (view.findViewById(R.id.btn_7));
        boutons[7] = (view.findViewById(R.id.btn_8));
        boutons[8] = (view.findViewById(R.id.btn_9));

        btnReStart = view.findViewById(R.id.btn_restart);
        txtWinner = view.findViewById(R.id.txt_winner);

        AtomicInteger joueur = new AtomicInteger(Notakto.getInstance().getJoueur());
        AtomicBoolean partieTerminer = new AtomicBoolean(Notakto.isPartieTerminer());

        txtWinner.setText("Joueur " + joueur);
        if (!partieTerminer.get()) {

            for (int i = 0; i <= 8; i++) {
                int finalI = i;
                boutons[i].setOnClickListener(v -> {
                    joueur.set(Notakto.joueurSuivant(joueur.get()));
                    boutons[finalI].setText("X");
                    txtWinner.setText("Joueur " + joueur);
                    Toast toast = Toast.makeText(getActivity(), "Winner is Joueur" + joueur, Toast.LENGTH_SHORT);

                    //partieTerminer.set(Notakto.regles(boutons));
                    if(Notakto.regles(boutons)){
                       //txtWinner.setText( "Winner is Joueur" + joueur);
                        toast.show();
                    }
                });
            }
        }

        btnReStart.setOnClickListener(v -> {
            for (int i = 0; i <= 8; i++) {
                int finalI = i;
                boutons[finalI].setText(null);
            }
            partieTerminer.set(false);
            joueur.set(1);
        });
        return view;
    }
    @Override
    public void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);

    }
}
