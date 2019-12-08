package frasesdodia.cursoandroid.com.frasedodia;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private TextView textoNovaFrase;
    private Button botaoNovaFrase;

    private String[] frases = {"Se você traçar metas altas e falhar, seu fracasso será muito melhor que o sucesso de todos",
        "O caralhinho é que é",
        "Porto melhor team do mundo",
        "quero comer isso",
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textoNovaFrase = (TextView) findViewById(R.id.textoNovaFraseId);
        botaoNovaFrase = (Button) findViewById(R.id.botaoNovaFrasaId);

        botaoNovaFrase.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Random aleatorio = new Random();
                int numeroAleatorio = aleatorio.nextInt(frases.length);

                textoNovaFrase.setText(frases[numeroAleatorio]);
            }
        });
    }
}
