package com.example.hirecityguide;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class GuideActivity extends AppCompatActivity {

    private Button hireButton;
    private EditText guideName,guideNumber,requiredDay,requiredTime;
    DatabaseReference databaseReference;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_guide);

        databaseReference = FirebaseDatabase.getInstance().getReference("Guide");

        hireButton = findViewById(R.id.hireGuide);
        guideName = findViewById(R.id.guideName);
        guideNumber = findViewById(R.id.guideNumber);
        requiredDay = findViewById(R.id.requiredDay);
        requiredTime = findViewById(R.id.requiredTime);

        hireButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                hireGuide();
            }
        });
    }

    public void hireGuide()
    {
        String Name = guideName.getText().toString().trim();
        String Number = guideNumber.getText().toString().trim();
        String day = requiredDay.getText().toString().trim();
        String time = requiredTime.getText().toString().trim();

        String key = databaseReference.push().getKey();

        Guide guide = new Guide(guideName,guideNumber,requiredDay,requiredTime);

        databaseReference.child(key).setValue(guide);

        Toast.makeText(getApplicationContext(),"Hire Guide Successful",Toast.LENGTH_LONG).show();

        guideName.setText("");
        guideNumber.setText("");
        requiredDay.setText("");
        requiredTime.setText("");
    }

}