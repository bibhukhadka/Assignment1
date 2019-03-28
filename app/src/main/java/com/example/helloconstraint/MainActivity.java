package com.example.helloconstraint;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private int mcount=0;
    private TextView ShowCount;
    private Button mzero;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ShowCount = (TextView) findViewById(R.id.mShowCount);
        mzero = (Button) findViewById(R.id.ZERO);

    }
    public void showToast(View view) {
        Toast toast = Toast.makeText(this, R.string.toast_message,
                Toast.LENGTH_SHORT);
        toast.show();
    }
    public void showCount(View view) {
        ++mcount;
        if (ShowCount != null) {

            ShowCount.setText(Integer.toString(mcount));
            mzero.setBackgroundColor(Color.MAGENTA);
        }


    }
    public void showZero(View view) {

        mcount=0;

        ShowCount.setText(Integer.toString(mcount));
        mzero.setBackgroundColor(Color.GRAY);



    }



}
