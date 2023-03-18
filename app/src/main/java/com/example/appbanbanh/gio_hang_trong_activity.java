package com.example.appbanbanh;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class gio_hang_trong_activity extends AppCompatActivity {
    private Button btnNextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gio_hang_trong);
        addControls();
        addEvent();
    }

    private void addEvent() {
        btnNextView.setOnClickListener(u -> chuyenTrang());

    }

    private void addControls() {
        btnNextView = (Button) findViewById(R.id.btnNextView);
    }


    private void chuyenTrang() {
        Intent intent = new Intent(gio_hang_trong_activity.this, don_hang_trong_activity.class);
        startActivity(intent);
    }

}