package com.example.relativelayoutapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // التطبيق يدعم العربية والانجليزية
        //تعريف obj  من كل عنصر سوف يستخدم برمجيا باستخدتم id

        // Lookup EditText reference
        TextView add_done =(TextView)  findViewById(R.id.done);
        // Lookup Button reference
        Button btn_add = (Button) findViewById(R.id.btn_add);


        //اضافة خاصة عند الضغط ونقر على الزر يعرض رسالة انه تمت الاضافة بنجاح

        btn_add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String done = add_done.getText().toString() ;

                // here we handle the event

                Toast.makeText(MainActivity.this, done + " " +"✔💯",Toast.LENGTH_LONG).show();
            }
        });

    }
}