package cstjean.mobile.notakto;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import java.util.concurrent.atomic.AtomicInteger;

public class MainActivity extends AppCompatActivity {
    private Button btnReStart;
    private TextView txtWinner;
    private final Button[] notakto = new Button[9];
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.notakto);

        notakto[0] = (findViewById(R.id.btn_1));
        notakto[1] = (findViewById(R.id.btn_2));
        notakto[2] = (findViewById(R.id.btn_3));
        notakto[3] = (findViewById(R.id.btn_4));
        notakto[4] = (findViewById(R.id.btn_5));
        notakto[5] = (findViewById(R.id.btn_6));
        notakto[6] = (findViewById(R.id.btn_7));
        notakto[7] = (findViewById(R.id.btn_8));
        notakto[8] = (findViewById(R.id.btn_9));

        btnReStart = findViewById(R.id.btn_restart);
        txtWinner = findViewById(R.id.txt_winner);
        jouer(notakto);
    }

    private void jouer(Button[] notakto) {
       AtomicInteger joueur = new AtomicInteger(1);

       for (int i = 0; i <= 8; i++) {
           int finalI = i;
           notakto[i].setOnClickListener(v -> {
               notakto[finalI].setText("X");
               if (joueur.get() == 1){
                   joueur.addAndGet(1);
               }
               else{
                   joueur.addAndGet(-1);
               }
               if(notakto[0].getText() == "X" && notakto[1].getText() == "X" && notakto[2].getText() == "X"){
                   txtWinner.setText("Winner is Joueur " + joueur);
               }
               else if (notakto[3].getText() == "X" && notakto[4].getText() == "X" && notakto[5].getText() == "X"){
                   txtWinner.setText("Winner is Joueur " + joueur);
               }
               else if (notakto[6].getText() == "X" && notakto[7].getText() == "X" && notakto[8].getText() == "X"){
                   txtWinner.setText("Winner is Joueur " + joueur);
               }
               else if(notakto[0].getText() == "X" && notakto[3].getText() == "X" && notakto[6].getText() == "X"){
                   txtWinner.setText("Winner is Joueur " + joueur);
               }
               else if (notakto[1].getText() == "X" && notakto[4].getText() == "X" && notakto[7].getText() == "X"){
                   txtWinner.setText("Winner is Joueur " + joueur);
               }
               else if (notakto[2].getText() == "X" && notakto[5].getText() == "X" && notakto[8].getText() == "X"){
                   txtWinner.setText("Winner is Joueur " + joueur);
               }
               else if (notakto[0].getText() == "X" && notakto[4].getText() == "X" && notakto[8].getText() == "X"){
                   txtWinner.setText("Winner is Joueur " + joueur);
               }
               else if (notakto[2].getText() == "X" && notakto[4].getText() == "X" && notakto[6].getText() == "X"){
                   txtWinner.setText("Winner is Joueur " + joueur);
               }
           });
       }
       txtWinner.setText("Joueur " + joueur);

       btnReStart.setOnClickListener(v -> {
           finish();
           startActivity(getIntent());
       });

       if (joueur.get() == 1){
           joueur.addAndGet(1);
       }
       else{
           joueur.addAndGet(-1);
       }
       if(notakto[1].getText() == "X" && notakto[2].getText() == "X" && notakto[3].getText() == "X"){
           txtWinner.setText("Winner is Joueur " + joueur);
       }
       else if (notakto[4].getText() == "X" && notakto[5].getText() == "X" && notakto[6].getText() == "X"){
           txtWinner.setText("Winner is Joueur " + joueur);
       }
       else if (notakto[7].getText() == "X" && notakto[8].getText() == "X" && notakto[9].getText() == "X"){
           txtWinner.setText("Winner is Joueur " + joueur);
       }
       else if(notakto[1].getText() == "X" && notakto[4].getText() == "X" && notakto[7].getText() == "X"){
           txtWinner.setText("Winner is Joueur " + joueur);
       }
       else if (notakto[2].getText() == "X" && notakto[5].getText() == "X" && notakto[8].getText() == "X"){
           txtWinner.setText("Winner is Joueur " + joueur);
       }
       else if (notakto[3].getText() == "X" && notakto[6].getText() == "X" && notakto[9].getText() == "X"){
           txtWinner.setText("Winner is Joueur " + joueur);
       }
       else if (notakto[1].getText() == "X" && notakto[5].getText() == "X" && notakto[9].getText() == "X"){
           txtWinner.setText("Winner is Joueur " + joueur);
       }
       else if (notakto[3].getText() == "X" && notakto[5].getText() == "X" && notakto[7].getText() == "X"){
           txtWinner.setText("Winner is Joueur " + joueur);
       }


    }
}
