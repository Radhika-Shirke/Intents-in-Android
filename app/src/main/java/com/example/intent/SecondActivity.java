package com.example.intent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Intent fromAct = getIntent();
        String title = fromAct.getStringExtra("title");
        String studentName = fromAct.getStringExtra("StudentName");
        int rollNo = fromAct.getIntExtra("Roll No", 0);

        TextView txtStudentInfo;

        txtStudentInfo = findViewById(R.id.txtStudentInfo);
        txtStudentInfo.setText("RollNo: " + rollNo+", Name: "+studentName);
        getSupportActionBar().setTitle(title);
    }
}