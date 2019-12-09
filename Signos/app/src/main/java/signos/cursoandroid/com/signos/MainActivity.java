package signos.cursoandroid.com.signos;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends Activity {

    private ListView listaSignos;
    private String[] signos = {"Aquário", "Gêmeos", "Capricórnio", "Leão", "Virgem", "Sagitário",
                                "Balança", "Peixes", "Caranguejo", "Escorpião", "Touro", "Carneiro"};

    private String[] perfis = {"Capazes de se adaptarem a qualquer situação, independentes, originais, por vezes oportunistas e muito curiosos/as",
                                "Estes/as nativos/as muito simpáticos/as, comunicativos/as e inteligentes conseguem adaptar-se às mais diversas situações",
                                "Os/as nativos/as de Capricórnio estão, a maior parte do tempo, na defensiva",
                                "Generosos/as, calorosos/as, autoritários/as, orgulhosos/as",
                                "Introspetivos/as, metódicos/as, autocríticos/as e extremamente organizados/as, estes/as nativos/as precisam de se sentir úteis ao quotidiano",
                                "Generosos/as, alegres, otimistas, serenos/as e por vezes aventureiros/as",
                                "Serenos/as, a busca incessante de harmonia e equilíbrio faz parte do quotidiano destes/as nativos/as",
                                "Um pouco lunáticos/as, os/as nativos/as de Peixes vivem num mundo muito próprio que é por"
                                        +"vezes difícil de compreender... Sensuais e imaginativos/as têm tudo para conquistar quem saberá adotar a sua sensibilidade e entender a sua necessidade de afeto e segurança!",
                                "Sensíveis, nostálgicos/as, doces, mas por vezes um pouco preguiçosos/as",
                                "Racionais, os/as nativos/as de Escorpião são dos/as mais sedutores/as",
                                "Estes/as nativos/as muito sentimentais, são por norma fiéis, conservadores, mas por vezes um pouco egocêntricos",
                                "Estes/as nativos/as intensos/as são por norma ansiosos/as, entusiastas, otimistas"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listaSignos = (ListView) findViewById(R.id.listViewId);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(
                getApplicationContext(), android.R.layout.simple_list_item_1,
                android.R.id.text1,
                signos);

        listaSignos.setAdapter(adapter);

        listaSignos.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                int codigoPosicao = i;
                Toast.makeText(getApplicationContext(), perfis[codigoPosicao], Toast.LENGTH_LONG).show();
            }
        });
    }
}
