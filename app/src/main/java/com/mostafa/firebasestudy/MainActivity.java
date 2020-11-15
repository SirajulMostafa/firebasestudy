package com.mostafa.firebasestudy;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView textName, textCourse,textDuration,textRoll;
        Button button;
        FirebaseDatabase database = FirebaseDatabase.getInstance();
        DatabaseReference myRef = database.getReference("Student");
        button = findViewById(R.id.btnSubmit);

        textName = findViewById(R.id.editTextName);
         textCourse= findViewById(R.id.editTextCourse);
        textDuration = findViewById(R.id.editTextDuration);
        textRoll = findViewById(R.id.editTextRoll);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name, course, duration;
                int roll;
                 roll= Integer.parseInt(textRoll.getText().toString()) ;
                 course = textCourse.getText().toString();
                 duration = textDuration.getText().toString();
                 name = textName.getText().toString();
                 Student student = new Student(roll,course,duration,name);
                 myRef.child(String.valueOf(roll)).setValue(student);
                // myRef.setValue(name);

                textName.setText("");
                Toast.makeText(MainActivity.this, "insert data", Toast.LENGTH_SHORT).show();
            }
        });


    }
}