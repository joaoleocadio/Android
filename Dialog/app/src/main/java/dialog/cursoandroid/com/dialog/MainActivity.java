package dialog.cursoandroid.com.dialog;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends Activity {

    private Button botao;
    private AlertDialog.Builder dialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        botao = (Button) findViewById(R.id.botaoId);

        botao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //criar alerta
                dialog = new AlertDialog.Builder(MainActivity.this);
                //configurar titulo
                dialog.setTitle("Título da dialog");
                //configurar mensagem
                dialog.setMessage("Mensagem de alerta! ");

                //Impedir que o alerta feche sem clicar em nenhum botao
                dialog.setCancelable(false);
                //definir icon no título do alerta
                dialog.setIcon(android.R.drawable.ic_delete);


                //configurar botão não
                dialog.setNegativeButton("Não", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Toast.makeText(MainActivity.this, "Pressionado o btn não", Toast.LENGTH_SHORT).show();
                    }
                });
                //configurar botão sim
                dialog.setPositiveButton("Sim", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Toast.makeText(MainActivity.this, "Pressionado o botão sim", Toast.LENGTH_SHORT).show();
                    }
                });
                dialog.create();
                dialog.show();
            }
        });
    }
}
