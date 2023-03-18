package com.example.appbanbanh;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class theo_doi_don_hang_activity extends AppCompatActivity {
    private Button btnNextView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_theo_doi_don_hang);
        addControls();
        addEvent();
    }
    private void addEvent() {
        btnNextView.setOnClickListener(u -> chuyenTrang());

    }

    private void addControls() {
        btnNextView = (Button) findViewById(R.id.btnThongTinCaNhan);
    }


    private void chuyenTrang() {
        Intent intent = new Intent(theo_doi_don_hang_activity.this, thong_tin_ca_nhan_activity.class);
        startActivity(intent);
    }
}