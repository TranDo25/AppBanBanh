package com.example.appbanbanh;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class thanh_toan_activity extends AppCompatActivity {
    private Button btnNextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_thanh_toan);
        addControls();
        addEvent();
    }
    private void addEvent() {
        btnNextView.setOnClickListener(u -> chuyenTrang());

    }

    private void addControls() {
        btnNextView = (Button) findViewById(R.id.btnTheoDoiDonHang);
    }


    private void chuyenTrang() {
        Intent intent = new Intent(thanh_toan_activity.this, theo_doi_don_hang_activity.class);
        startActivity(intent);
    }

}