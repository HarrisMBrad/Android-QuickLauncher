package org.ibg.brad.quicklauncher;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        //Attempts to launch an activity within our own app

        if (getIntent().hasExtra("org.ibg.brad.quicklauncher.SOMETHING")) {
            TextView tv = (TextView) findViewById(R.id.textView);
            String text = getIntent().getExtras().getString("org.ibg.brad.quicklauncher.SOMETHING");
            tv.setText(text);
        }
    }
}
