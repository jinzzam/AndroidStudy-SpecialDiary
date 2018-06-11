package com.example.jinzzam.specialdiary;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView welcomemsg;
    private EditText nameinput;
    private TextView nameoutput;
    private Button submit;
    private String name;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        welcomemsg = findViewById(R.id.textView);
        nameinput = findViewById(R.id.editText);
        nameoutput = findViewById(R.id.textView2);
        submit = findViewById(R.id.button);

        welcomemsg.setText("Hi, Please enter your name.");

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                name = nameinput.getText().toString();
                nameoutput.setText(name);
            }
        });
    }
}
