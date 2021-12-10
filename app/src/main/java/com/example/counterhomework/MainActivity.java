package com.example.counterhomework;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private int c=0;
    private TextView textView;
    private Button button;
    private EditText editText;
    String txt,txt2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView=findViewById(R.id.textView);
        button=findViewById(R.id.button);
        editText=findViewById(R.id.editText);
    }

    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);

        CharSequence txt=editText.getText();
        CharSequence txt1=textView.getText();
        outState.putCharSequence("savedText",  txt);
        outState.putCharSequence("saveText",  txt1);

    }
    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        CharSequence txt=savedInstanceState.getCharSequence("savedText");
        CharSequence txt1=savedInstanceState.getCharSequence("saveText");
        editText.setText(txt);
        textView.setText(txt1);
    }


    public void countUp(View view) {
        ++c;
        if(textView.getText()!=null)
        {

            textView.setText(Integer.toString(c));

        }
    }
}