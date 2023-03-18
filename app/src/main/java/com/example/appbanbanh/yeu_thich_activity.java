package com.example.appbanbanh;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class yeu_thich_activity extends AppCompatActivity {
    private Button btnNextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_yeu_thich);
        addControls();
        addEvent();
    }
    private void addEvent() {
        btnNextView.setOnClickListener(u -> chuyenTrang());

    }

    private void addControls() {
        btnNextView = (Button) findViewById(R.id.btnThanhToan);
    }


    private void chuyenTrang() {
        Intent intent = new Intent(yeu_thich_activity.this, thanh_toan_activity.class);
        startActivity(intent);
    }

}