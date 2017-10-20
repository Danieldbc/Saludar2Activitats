package edu.eseiaat.upc.pma.borreguero.daniel.saludar2activitats;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import static edu.eseiaat.upc.pma.borreguero.daniel.saludar2activitats.SecondActivity.keysaludar;

public class FirstActivity extends AppCompatActivity {
    private EditText etSaludar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);
        etSaludar=(EditText)findViewById(R.id.etSaludar);

    }

    public void Saludar(View view) {
        Intent intent=new Intent(this,SecondActivity.class);
        String textSaludar=etSaludar.getText().toString();
        intent.putExtra(SecondActivity.keysaludar,textSaludar);
        startActivity(intent);

    }
}
