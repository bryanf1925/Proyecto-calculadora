package com.example.calculadora;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;


public class MainActivity extends AppCompatActivity {

    EditText txtnum1;
    EditText txtnum2;
    Button btnsumar;
    Button btnrestar;
    Button btnmultiplicar;
    Button btndividir;
    TextView lblresultado;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        txtnum1=findViewById(R.id.txtnum1);
        txtnum2=findViewById(R.id.txtnum2);
        btnsumar=findViewById(R.id.btnsumar);
        btnrestar=findViewById(R.id.btnrestar);
        btnmultiplicar=findViewById(R.id.btnmultiplicar);
        btndividir=findViewById(R.id.btndividir);
        lblresultado=findViewById(R.id.lblresultado);
    }

    public void btnsumar_onclick(View v){
        int num1 = Integer.parseInt(txtnum1.getText().toString());
        int num2 = Integer.parseInt(txtnum2.getText().toString());

        lblresultado.setText(String.valueOf(num1+num2));

    }

    public void btnrestar_onclick(View v){
        int num1 = Integer.parseInt(txtnum1.getText().toString());
        int num2 = Integer.parseInt(txtnum2.getText().toString());

        lblresultado.setText(String.valueOf(num1-num2));

    }

    public void btndividir_onclick(View v){
        int num1 = Integer.parseInt(txtnum1.getText().toString());
        int num2 = Integer.parseInt(txtnum2.getText().toString());

        lblresultado.setText(String.valueOf(num1/num2));

    }

    public void btnmultiplicar_onclick(View v){
        int num1 = Integer.parseInt(txtnum1.getText().toString());
        int num2 = Integer.parseInt(txtnum2.getText().toString());

        lblresultado.setText(String.valueOf(num1*num2));

    }

}