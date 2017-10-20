package edu.eseiaat.upc.pma.borreguero.daniel.saludar2activitats;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {
    public static String keysaludar="key_nom";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        String nom=getIntent().getExtras().getString(keysaludar);
        TextView texto=(TextView)findViewById(R.id.tvHola);
        String actual=texto.getText().toString();
        texto.setText(String.format(actual,nom));
    }
}
