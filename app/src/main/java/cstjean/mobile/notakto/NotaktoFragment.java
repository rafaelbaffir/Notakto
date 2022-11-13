package cstjean.mobile.notakto;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

public class NotaktoFragment extends Fragment {
    private TextView txtWinner;
    private Button btnReStart;
    private final Button[] boutons = Notakto.getInstance().getBoutons();


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @SuppressLint("MissingInflatedId")
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.notakto, container, false);
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


        int joueur = Notakto.getInstance().getJoueur();
        boolean partieTerminer = Notakto.getInstance().isPartieTerminer();


        txtWinner.setText("Joueur " + joueur);
        if (!partieTerminer) {

            for (int i = 0; i <= 8; i++) {
                int finalI = i;
                boutons[i].setOnClickListener(v -> {
                    Notakto.joueurSuivant(joueur);
                    boutons[finalI].setText("X");
                    txtWinner.setText("Joueur " + joueur);

                    Notakto.regles(boutons);
                    //Toast toast = Toast.makeText(getApplicationContext(), "Winner is Joueur" + joueur, Toast.LENGTH_SHORT);
                });

            }
        }

        Intent intent = getActivity().getIntent();
        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_NEW_TASK
                | Intent.FLAG_ACTIVITY_NO_ANIMATION);

        btnReStart.setOnClickListener(v -> {
            getActivity().overridePendingTransition(0, 0);
            getActivity().finish();

            getActivity().overridePendingTransition(0, 0);
            startActivity(intent);
        });
        return view;
    }
}
