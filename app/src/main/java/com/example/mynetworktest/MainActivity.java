package com.example.mynetworktest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity  {

    private Button buttonAbschicken;
    private EditText editTextMatrikelnummer;
    private TextView textVewAntwort;
    private Client client;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonAbschicken = (Button)findViewById(R.id.buttonAbschicken);
        editTextMatrikelnummer   = (EditText)findViewById(R.id.editTextMatrikelnummer);
        textVewAntwort = (TextView)findViewById(R.id.textViewAntwort);
    }

    public void onClick(View v) {
        Log.v("LogMessage", editTextMatrikelnummer.getText().toString());


        client = new Client(editTextMatrikelnummer.getText().toString());
        client.setTextViewAntwort(textVewAntwort);
        client.execute("Client connecting");
    }
}
