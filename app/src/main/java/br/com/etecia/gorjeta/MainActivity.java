package br.com.etecia.gorjeta;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    EditText txtValorConta, txtValorGorjeta, txtTotal;
    Button btnCalcular;

    Spinner menu;

    Gorjeta gorjeta = new Gorjeta();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // OBTÉM O ID DOS CAMPOS DE TEXTO
        txtValorConta = findViewById(R.id.txtValorConta);
        txtValorGorjeta = findViewById(R.id.txtValorGorjeta);
        txtTotal = findViewById(R.id.txtTotal);
        menu = (Spinner) findViewById(R.id.menu_valores);

        // OBTEM O ID DO BOTÃO
        btnCalcular = findViewById(R.id.btnCalcular);

        // AÇÃO DO BOTÃO PARA CALCULAR E EXIBIR OS VALORES
        btnCalcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double valorGorjeta;
                double valorConta;
                double totalConta;

                String selecao = menu.getSelectedItem().toString();

                if (!TextUtils.isEmpty(txtValorConta.getText())) {
                    valorConta = Double.parseDouble(String.valueOf(txtValorConta.getText()));

                    if (selecao.equals("Excelente - 10%")) {
                        valorGorjeta = gorjeta.excelente(valorConta);
                        totalConta = valorConta + valorGorjeta;
                        txtValorGorjeta.setText(String.valueOf(valorGorjeta));
                        txtTotal.setText(String.valueOf(totalConta));
                    }

                    if (selecao.equals("Ótimo - 8%")) {
                        valorGorjeta = gorjeta.otimo(valorConta);
                        totalConta = valorConta + valorGorjeta;
                        txtValorGorjeta.setText(String.valueOf(valorGorjeta));
                        txtTotal.setText(String.valueOf(totalConta));
                    }

                    if (selecao.equals("Bom - 5%")) {
                        valorGorjeta = gorjeta.bom(valorConta);
                        totalConta = valorConta + valorGorjeta;
                        txtValorGorjeta.setText(String.valueOf(valorGorjeta));
                        txtTotal.setText(String.valueOf(totalConta));
                    }

                    if (selecao.equals("Ruim - 2%")) {
                        valorGorjeta = gorjeta.ruim(valorConta);
                        totalConta = valorConta + valorGorjeta;
                        txtValorGorjeta.setText(String.valueOf(valorGorjeta));
                        txtTotal.setText(String.valueOf(totalConta));
                    }

                } else {
                    Context contexto = getApplicationContext();
                    CharSequence aviso = "Insira um valor.";
                    int duracao = Toast.LENGTH_SHORT;

                    Toast toast = Toast.makeText(contexto, aviso, duracao);
                    toast.show();
                }

            }
        });

        // MENU DE SELEÇÃO DA QUALIDADE DO SERVIÇO

        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.menu_valores, android.R.layout.simple_spinner_item);

        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        menu.setAdapter(adapter);

    }

    public void selecionaGorjeta() {
        String mySpinner = menu.getSelectedItem().toString();

        if (mySpinner.equals("Excelente - 10%")) {

        }
    }

}