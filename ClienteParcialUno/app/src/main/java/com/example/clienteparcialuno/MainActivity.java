package com.example.clienteparcialuno;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private EditText charactersName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        charactersName = findViewById(R.id.characterName);
    }

    @Override
    public void onClick(View view) {

            switch (view.getId()){

                case R.id.next:

                    String name = charactersName.getText().toString();

                    Intent i = new Intent(this,Controlador.class);
                    i.putExtra("nameOfCharacter",name);

                    startActivity(i);
                    break;
            }
    }
}