package cstjean.mobile.notakto;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

public class MainActivity extends AppCompatActivity {
    private Button btnReStart;
    private TextView txtWinner;
    private final Button[] boutons = new Button[9];

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.notakto);

        boutons[0] = (findViewById(R.id.btn_1));
        boutons[1] = (findViewById(R.id.btn_2));
        boutons[2] = (findViewById(R.id.btn_3));
        boutons[3] = (findViewById(R.id.btn_4));
        boutons[5] = (findViewById(R.id.btn_6));
        boutons[6] = (findViewById(R.id.btn_7));
        boutons[7] = (findViewById(R.id.btn_8));
        boutons[8] = (findViewById(R.id.btn_9));

        btnReStart = findViewById(R.id.btn_restart);
        txtWinner = findViewById(R.id.txt_winner);


       AtomicInteger joueur = new AtomicInteger(1);
       AtomicReference<Boolean> partieTerminé = new AtomicReference<>(false);

        txtWinner.setText("Joueur " + joueur);
       if(partieTerminé.get() == false) {
           for (int i = 0; i <= 8; i++) {
               int finalI = i;
               boutons[i].setOnClickListener(v -> {
                   boutons[finalI].setText("X");
                   txtWinner.setText("Joueur " + joueur);
                    Notakto.joueurSuivant(joueur);
                   //Toast toast = Toast.makeText(getApplicationContext(), "Winner is Joueur" + joueur, Toast.LENGTH_SHORT);
               });

           }
       }


       btnReStart.setOnClickListener(v -> {
           finish();
           startActivity(getIntent());
       });





    }
}
