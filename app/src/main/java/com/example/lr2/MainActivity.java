package com.example.lr2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText name;
    private EditText surname;
    private EditText age;
    private EditText salary;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        name = (EditText) findViewById(R.id.name);
        surname = (EditText) findViewById(R.id.surname);
        age = (EditText) findViewById(R.id.age);
        salary = (EditText) findViewById(R.id.salary);
    }
    public void sendData(View v)
    {
        Intent intent = new Intent(this, SecondActivity.class);
        intent.putExtra("name",name.getText().toString());
        intent.putExtra("surname",surname.getText().toString());
        intent.putExtra("age",Integer.parseInt(age.getText().toString()));
        intent.putExtra("salary",Double.parseDouble(salary.getText().toString()));
        startActivity(intent);
    }
}