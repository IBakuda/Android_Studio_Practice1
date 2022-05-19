package com.mirea.ivanovma.clickbuttons;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.text.BreakIterator;

public class ClickButtons extends AppCompatActivity {

    private TextView tvOut;
    private Button buttonOk;
    private Button buttonCancel;
    private Button onMyButtonClick;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_click_buttons);
        // найдем View-элементы
        tvOut = (TextView) findViewById(R.id.tvOut);
        buttonOk = (Button) findViewById(R.id.btnOk);
        buttonCancel = (Button) findViewById(R.id.btnCancel);

        View.OnClickListener oclBtnOk = new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                tvOut.setText("Нажата кнопка ОК");
            }
        };
        buttonOk.setOnClickListener(oclBtnOk);

        View.OnClickListener oclBtnCancel = new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                tvOut.setText("Нажата кнопка Cancel");
            }
        };
        buttonCancel.setOnClickListener(oclBtnCancel);
    }
//    public void onMyButtonClick(View v){
//        Toast.makeText(this, "Ещё один способ!",Toast.LENGTH_SHORT).show();
//    }
}