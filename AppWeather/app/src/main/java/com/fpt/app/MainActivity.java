package com.fpt.app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText edSearch;
    Button btnSearch,btnChangeActivity;
    TextView tvCity, tvCountry, tvTemperature, tvStatus, tvHumidity, tvCloud, tvDay, tvWind;
    ImageView ivCover;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

    public void GetCurrentWeatherData(String data){

    }

    private void initView(){
        edSearch = findViewById(R.id.edSearch);
        btnSearch = findViewById(R.id.btnSearch);
        tvCity = findViewById(R.id.tvCity);
        tvCountry = findViewById(R.id.tvCountry);
        ivCover = findViewById(R.id.ivCover);
        tvTemperature = findViewById(R.id.tvTemperature);
        tvStatus = findViewById(R.id.tvStatus);
        tvHumidity = findViewById(R.id.tvHumidity);
        tvCloud = findViewById(R.id.tvCloud);
        tvWind = findViewById(R.id.tvWind);
        tvDay = findViewById(R.id.tvDay);
        btnChangeActivity = findViewById(R.id.btnChangeActivity);
    }
}