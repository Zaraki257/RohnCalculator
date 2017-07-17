package com.example.zaraki.calculator;


import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.example.zaraki.calculator.databinding.ActivityMainBinding;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;

    private double valOne = Double.NaN;
    private double valTwo;

    private DecimalFormat decimalFormat;

    //it is simple calculator app so basically there are 4 operations , so we defined it as static variable
    private static final char ADD = '+';
    private static final char SUBTRACT = '-';
    private static final char MULTIPLY = '*';
    private static final char DIVIDE = '/';


    //to hold the current action which is pressed
    private char CURRENT_ACTION;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main);


        //DecimalFormat constructor is called for format of the calculator app.
        decimalFormat = new DecimalFormat("#.##########");

        binding.btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                binding.editText.setText(binding.editText.getText() + "0");
            }
        });

        binding.btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                binding.editText.setText(binding.editText.getText() + "1");
            }
        });

        binding.btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                binding.editText.setText(binding.editText.getText() + "2");
            }
        });

        binding.btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                binding.editText.setText(binding.editText.getText() + "3");
            }
        });

        binding.btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                binding.editText.setText(binding.editText.getText() + "4");
            }
        });

        binding.btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                binding.editText.setText(binding.editText.getText() + "5");
            }
        });

        binding.btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                binding.editText.setText(binding.editText.getText() + "6");
            }
        });

        binding.btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                binding.editText.setText(binding.editText.getText() + "7");
            }
        });

        binding.btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                binding.editText.setText(binding.editText.getText() + "8");
            }
        });

        binding.btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                binding.editText.setText(binding.editText.getText() + "9");
            }
        });

        binding.btnDot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                binding.editText.setText(binding.editText.getText() + ".");
            }
        });

        binding.btnPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                computeCalculation();
                CURRENT_ACTION = ADD;
                binding.textView.setText(decimalFormat.format(valOne) + "+");
                binding.editText.setText(null);
            }
        });

        binding.btnMin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                computeCalculation();
                CURRENT_ACTION = SUBTRACT;
                binding.textView.setText(decimalFormat.format(valOne) + "-");
                binding.editText.setText(null);
            }
        });

        binding.btnMul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                computeCalculation();
                CURRENT_ACTION = MULTIPLY;
                binding.textView.setText(decimalFormat.format(valOne) + "*");
                binding.editText.setText(null);
            }
        });

        binding.btnDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                computeCalculation();
                CURRENT_ACTION = DIVIDE;
                binding.textView.setText(decimalFormat.format(valOne) + "/");
                binding.editText.setText(null);
            }
        });


        binding.btnAns.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                computeCalculation();
                binding.textView.setText(binding.textView.getText().toString() +
                        decimalFormat.format(valTwo) + " = " + decimalFormat.format(valOne));
                valOne = Double.NaN;
                CURRENT_ACTION = 0;
            }
        });

        binding.btnClr.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (binding.editText.getText().length() > 0) {
                    CharSequence currentText = binding.editText.getText();
                    binding.editText.setText(currentText.subSequence(0, currentText.length() - 1));
                } else {
                    valOne = Double.NaN;
                    valTwo = Double.NaN;
                    binding.editText.setText("");
                    binding.textView.setText("");

                }
            }
        }));
    }

    private void computeCalculation() {
        if (!Double.isNaN(valOne)) {
            valTwo = Double.parseDouble(binding.editText.getText().toString());
            binding.editText.setText(null);


            if (CURRENT_ACTION == ADD)
                valOne = this.valOne + valTwo;
            else if (CURRENT_ACTION == SUBTRACT)
                valOne = this.valOne - valTwo;
            else if (CURRENT_ACTION == MULTIPLY)
                valOne = this.valOne * valTwo;
            else if (CURRENT_ACTION == DIVIDE)
                valOne = this.valOne / valTwo;
        } else {
            try {
                valOne = Double.parseDouble(binding.editText.getText().toString());
            } catch (Exception e) {
            }
        }
    }

}
