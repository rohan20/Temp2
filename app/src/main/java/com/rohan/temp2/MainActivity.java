package com.rohan.temp2;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TableRow;
import android.widget.TextView;

import java.util.ArrayList;

import static android.widget.TableRow.*;

public class MainActivity extends AppCompatActivity {

    LinearLayout textViewsLinearLayout;
    TextView[] textViewsArray;
    EditText wordEditText;
    Button submitWordButton;

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        wordEditText = (EditText) findViewById(R.id.word_edit_text);
        submitWordButton = (Button) findViewById(R.id.submit_button);

        submitWordButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textViewsLinearLayout = (LinearLayout) findViewById(R.id.text_views_linear_layout);
                textViewsLinearLayout.removeAllViews();
                textViewsArray = new TextView[wordEditText.getText().toString().length()];

                for (int i = 0; i < textViewsArray.length; i++) {
                    TextView textView = new TextView(getApplicationContext());
                    textView.setTextSize(20f);
                    textView.setPadding(5,5,5,5);
                    textView.setGravity(Gravity.CENTER);
                    textView.setTextColor(Color.BLACK);
                    textView.setText(String.valueOf(i + 1));
                    LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(LinearLayout
                            .LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT, 1f);
                    textView.setLayoutParams(params);
                    textView.setBackgroundColor(Color.WHITE);

                    textViewsArray[i] = textView;
                    textViewsLinearLayout.addView(textView);
                }
            }
        });

    }
}
