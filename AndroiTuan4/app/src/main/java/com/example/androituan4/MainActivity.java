package com.example.androituan4;

import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity implements SenddingData{
    TextView tvThanhTienMain;
    int so;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_actitvity);
        tvThanhTienMain = findViewById(R.id.tvThanhTienMain);
        getSupportFragmentManager().beginTransaction()
                .add(R.id.frmContainerBelow, below.newInstance("0")).commit();
    }

    @Override
    public void sendData(String data) {
        so = Integer.parseInt(data);
        Toast.makeText(this,data,Toast.LENGTH_SHORT).show();
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.frmContainerBelow, below.newInstance(data)).commit();
    }
}

