package com.example.rejestracja;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.util.Patterns;
import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText email = findViewById(R.id.Email);
        EditText password = findViewById(R.id.password);
        EditText rep_pass = findViewById(R.id.repeat_pass);
        TextView result = findViewById(R.id.result);
        Button Zatwierdz = findViewById(R.id.Zatwierdz);

        Zatwierdz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String Email = email.getText().toString().trim();
                String pass = password.getText().toString().trim();
                String pass_rep = rep_pass.getText().toString().trim();

                if (Email.isEmpty()){
                    result.setText("Nie podano adresu e-mail");
                } else if ((!Patterns.EMAIL_ADDRESS.matcher(Email).matches())) {
                    result.setText("Nieprawidłowy adres e-mail");
                } else if (pass.isEmpty()) {
                    result.setText("Nie podano hasła");
                } else if (pass_rep.isEmpty()) {
                    result.setText("Nie podano hasła");
                } else if (!pass.equals(pass_rep)) {
                    result.setText("Hasła się różnią");
                }else {
                    result.setText("Witaj " + Email);
                }
            }
        });






        };
    }
