package com.example.appbanbanh;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class don_hang_trong_activity extends AppCompatActivity {
    private Button btnNextView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_don_hang_trong);
        addControls();
        addEvent();
    }
    private void addEvent() {
        btnNextView.setOnClickListener(u -> chuyenTrang());

    }

    private void addControls() {
        btnNextView = (Button) findViewById(R.id.btnNextViewYeuThich);
    }


    private void chuyenTrang() {
        Intent intent = new Intent(don_hang_trong_activity.this, yeu_thich_activity.class);
        startActivity(intent);
    }
}