package com.example.appbanbanh;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class thong_tin_ca_nhan_activity extends AppCompatActivity {
    private Button btnNextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_thong_tin_ca_nhan);
        addControls();
        addEvent();
    }
    private void addEvent() {
        btnNextView.setOnClickListener(u -> chuyenTrang());

    }

    private void addControls() {
        btnNextView = (Button) findViewById(R.id.btnThemPTTN);
    }


    private void chuyenTrang() {
        Intent intent = new Intent(thong_tin_ca_nhan_activity.this, phuong_thuc_thanh_toan_activity.class);
        startActivity(intent);
    }
}