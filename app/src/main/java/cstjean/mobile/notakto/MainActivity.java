package cstjean.mobile.notakto;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private Button btnReStart;
    private TextView txtWinner;
    private final Button[] notakto = new Button[9];
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.notakto);

        notakto[1] = (findViewById(R.id.btn_1));
        notakto[2] = (findViewById(R.id.btn_2));
        notakto[3] = (findViewById(R.id.btn_3));
        notakto[4] = (findViewById(R.id.btn_4));
        notakto[5] = (findViewById(R.id.btn_5));
        notakto[6] = (findViewById(R.id.btn_6));
        notakto[7] = (findViewById(R.id.btn_7));
        notakto[8] = (findViewById(R.id.btn_8));
        notakto[9] = (findViewById(R.id.btn_9));

        btnReStart = findViewById(R.id.btn_restart);
        txtWinner = findViewById(R.id.txt_winner);
        jouer(notakto);
    }

    private void jouer(Button[] notakto) {
       int joueur = 1;
       for(;;){
           for (int i = 0; i <= 9; i++) {
               int finalI = i;
               notakto[i].setOnClickListener(v -> {
                   notakto[finalI].setText("X");
               });
           }
           txtWinner.setText("Joueur " + joueur);

           btnReStart.setOnClickListener(v -> {
               finish();
               startActivity(getIntent());
           });

           if (joueur == 1){
               joueur += 1;
           }
           else{
               joueur -= 1;
           }
           if(notakto[1].getText() == "X" && notakto[2].getText() == "X" && notakto[3].getText() == "X"){
               break;
           }
           else if (notakto[4].getText() == "X" && notakto[5].getText() == "X" && notakto[6].getText() == "X"){
               break;
           }
           else if (notakto[7].getText() == "X" && notakto[8].getText() == "X" && notakto[9].getText() == "X"){
               break;
           }
           else if(notakto[1].getText() == "X" && notakto[4].getText() == "X" && notakto[7].getText() == "X"){
               break;
           }
           else if (notakto[2].getText() == "X" && notakto[5].getText() == "X" && notakto[8].getText() == "X"){
               break;
           }
           else if (notakto[3].getText() == "X" && notakto[6].getText() == "X" && notakto[9].getText() == "X"){
               break;
           }
           else if (notakto[1].getText() == "X" && notakto[5].getText() == "X" && notakto[9].getText() == "X"){
               break;
           }
           else if (notakto[3].getText() == "X" && notakto[5].getText() == "X" && notakto[7].getText() == "X"){
               break;
           }


       }
        txtWinner.setText("Winner is Joueur " + joueur);
    }
}
