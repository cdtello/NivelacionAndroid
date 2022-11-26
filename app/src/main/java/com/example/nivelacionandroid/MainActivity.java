package com.example.nivelacionandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Button btnOk;
    private TextView textName, textLastName, textAge, textTitle;
    private EditText editName, editLastName, editAge;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnOk = (Button) findViewById(R.id.btnOk);
        textName = (TextView) findViewById(R.id.textName);
        textLastName = (TextView) findViewById(R.id.textLastName);
        textAge = (TextView) findViewById(R.id.textAge);
        textTitle = (TextView) findViewById(R.id.textTitle);
        editName = (EditText) findViewById(R.id.editName);
        editLastName = (EditText) findViewById(R.id.editLastName);
        editAge = (EditText) findViewById(R.id.editAge);

        btnOk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name = editName.getText().toString();
                String lastName = editLastName.getText().toString();
                String age = editAge.getText().toString();

                String fullName = name + " " + lastName +": "+age;
                textTitle.setText(fullName);
            }
        });

        btnOk.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
                Intent intent = new Intent(getApplicationContext(), MainActivity2.class);
                startActivity(intent);
                return false;
            }
        });
    }
}