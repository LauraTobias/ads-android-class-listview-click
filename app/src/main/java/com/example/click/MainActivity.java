package com.example.click;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btnSimpleListView;
    Button btnAdapterListView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.btnSimpleListView = findViewById(R.id.btnSimpleListView);
        this.btnAdapterListView = findViewById(R.id.btnAdapterListView);

        View.OnClickListener onClickListener = view -> {
            switch (view.getId())
            {
                case R.id.btnSimpleListView: OpenSimpleListView(); break;
                case R.id.btnAdapterListView: OpenAdapterListView(); break;
            }
        };

        this.btnSimpleListView.setOnClickListener(onClickListener);
        this.btnAdapterListView.setOnClickListener(onClickListener);
    }

    public void OpenSimpleListView()
    {
        Intent i = new Intent(getApplicationContext(), SimpleListView.class);
        startActivity(i);
    }

    public void OpenAdapterListView()
    {
        Intent i = new Intent(getApplicationContext(), AdapterListView.class);
        startActivity(i);
    }
}