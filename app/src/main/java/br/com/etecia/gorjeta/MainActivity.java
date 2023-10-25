package br.com.etecia.gorjeta;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

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
        String total;

        // OBTEM O ID DO BOTÃO
        btnCalcular = findViewById(R.id.btnCalcular);

        // AÇÃO DO BOTÃO PARA CALCULAR E EXIBIR OS VALORES
        btnCalcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double valorconta;
                if (txtTotal.getText() != null) {
                    valorconta = Double.parseDouble(String.valueOf(txtValorConta.getText()));
                    txtTotal.setText(String.valueOf(valorconta));
                }
            }
        });

        // MENU DE SELEÇÃO DA QUALIDADE DO SERVIÇO
        menu = (Spinner) findViewById(R.id.menu_valores);

        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.menu_valores, android.R.layout.simple_spinner_item);

        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        menu.setAdapter(adapter);

    }
}