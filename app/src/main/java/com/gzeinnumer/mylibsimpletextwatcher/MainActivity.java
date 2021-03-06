package com.gzeinnumer.mylibsimpletextwatcher;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.widget.EditText;

import com.gzeinnumer.mylibsimpletextwatcher.interfaceCallBack.AfterTextChanged;
import com.gzeinnumer.mylibsimpletextwatcher.interfaceCallBack.BeforeTextChanged;
import com.gzeinnumer.mylibsimpletextwatcher.interfaceCallBack.OnTextChanged;

public class MainActivity extends AppCompatActivity {

    EditText editText;

    private static final String TAG = "MainActivity_";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText = findViewById(R.id.ed);

        before();

        after();
    }

    private void before() {
        editText.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
                Log.d(TAG, "beforeTextChanged: "+s+"_"+start+"_"+count+"_"+after);
            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                Log.d(TAG, "onTextChanged: "+s+"_"+start+"_"+before+"_"+count);
            }

            @Override
            public void afterTextChanged(Editable s) {
                Log.d(TAG, "afterTextChanged: "+s.toString());
            }
        });
    }

    private void after() {
        editText.addTextChangedListener(new SimpleTextWatcher(new BeforeTextChanged() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
                Log.d(TAG, "beforeTextChanged: "+s+"_"+start+"_"+count+"_"+after);
            }
        }));

        editText.addTextChangedListener(new SimpleTextWatcher(new OnTextChanged() {
            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                Log.d(TAG, "onTextChanged: "+s+"_"+start+"_"+before+"_"+count);
            }
        }));

        editText.addTextChangedListener(new SimpleTextWatcher(new AfterTextChanged() {
            @Override
            public void afterTextChanged(Editable s) {
                Log.d(TAG, "afterTextChanged: "+s.toString());
            }
        }));
    }
}