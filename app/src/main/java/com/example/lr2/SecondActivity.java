package com.example.lr2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    private TextView name1;
    private TextView surname1;
    private TextView age1;
    private TextView salary1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        name1 = (TextView) findViewById(R.id.name1);
        surname1 = (TextView) findViewById(R.id.surname1);
        age1 = (TextView) findViewById(R.id.age1);
        salary1 = (TextView) findViewById(R.id.salary1);

        name1.setText(getIntent().getStringExtra("name"));
        surname1.setText(getIntent().getStringExtra("surname"));
        age1.setText(String.valueOf(getIntent().getIntExtra("age",0)));
        salary1.setText(String.valueOf(getIntent().getDoubleExtra("salary",0)));
    }
    public void Back(View v)
    {
        Intent intent = new Intent(this, MainActivity.class);
        intent.addFlags(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT);
        startActivity(intent);
    }
}