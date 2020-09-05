package com.javadroidbd.example1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class CalculationActivity extends AppCompatActivity {
    private EditText number1;
    private EditText number2;
    private TextView result;
    private Button addbtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculation);
        number1=findViewById(R.id.editTextnumber1);
        number2=findViewById(R.id.editTextnumber2);
        result=findViewById(R.id.resulttext);
        addbtn=findViewById(R.id.buttonadd);
        addbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double num1=Double.parseDouble(""+number1.getText());
                double num2=Double.parseDouble(""+number2.getText());
                result.setText(Double.toString(num1+num2));
            }
        });
    }
}