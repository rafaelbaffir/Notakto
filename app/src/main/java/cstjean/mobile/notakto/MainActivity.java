package cstjean.mobile.notakto;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private Button btnReStart;
    private TextView txtWinner;
    private final List<Button> notakto = new ArrayList<>() {};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.notakto);

        notakto.add(findViewById(R.id.btn_1));
        notakto.add(findViewById(R.id.btn_2));
        notakto.add(findViewById(R.id.btn_3));
        notakto.add(findViewById(R.id.btn_4));
        notakto.add(findViewById(R.id.btn_5));
        notakto.add(findViewById(R.id.btn_6));
        notakto.add(findViewById(R.id.btn_7));
        notakto.add(findViewById(R.id.btn_8));
        notakto.add(findViewById(R.id.btn_9));

        jouer(notakto);

    }

    private void jouer(List<Button> notakto) {
       int joueur = 1;
       for(;;){
           for (int i = 0; i <= 9; i++) {
               notakto[i].setOnClickListener(v -> {
                   notakto[i].setText("X");
               });
           }
           txtWinner.setText("Joueur " + joueur);
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
