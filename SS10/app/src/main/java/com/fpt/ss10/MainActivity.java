package com.fpt.ss10;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Spinner;

import com.fpt.ss10.database.AppDatabase;

public class MainActivity extends AppCompatActivity {

    EditText edUser, edDes;
    Spinner spinner;
    CheckBox ckAgree;
    Button btRegister;
    String gender = "Male";
    AppDatabase db;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}