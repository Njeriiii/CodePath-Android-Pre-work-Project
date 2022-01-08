package com.example.hello_world;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView textView = ((TextView) findViewById(R.id.text));


        //User can tap a button to change text colour of the label
        findViewById(R.id.button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            //change text colour of the label
                ((TextView) findViewById(R.id.text)).setTextColor(getResources().getColor(R.color.yellow));
            }
        });
       //user can tap button to change colour of background view
        findViewById(R.id.changeBackgroundButton).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //#52BE80 - green
                findViewById(R.id.parent).setBackgroundColor(getResources().getColor(R.color.green));

            }
        });
        //User can tap a button to change the text string of the label
        findViewById(R.id.changeTextButton).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ((TextView) findViewById(R.id.text)).setText("Android is Awesome!");
            }
        } );

        //User can tap on the background view to reset all views to default settings.
        findViewById(R.id.parent).setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // 1> Reset text
                textView.setText("Hello from Njeri");

                //2.Reset text colour
                textView.setTextColor(getResources().getColor(R.color.black));

                // 3. Reset Background colour
                findViewById((R.id.parent)).setBackgroundColor(getResources().getColor(R.color.light_purple));


            }
        }));

        //b. User can tap the “Change text string” button to update the label with the text from the text field.
        findViewById(R.id.changeCustomTextButton).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //change the text view to what's in the edit text view
                String userEnteredText = ((EditText) findViewById(R.id.editText)).getText().toString();
                textView.setText(userEnteredText);

            //c. If the text field is empty, update label with default text string.
                 if (userEnteredText.isEmpty()) {
                    textView.setText("Enter your Own Text");
                 }   else {
                         textView.setText(userEnteredText);
                 }
            }
        });

    }
}