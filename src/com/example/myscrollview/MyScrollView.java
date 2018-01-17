package com.example.myscrollview;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class MyScrollView extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_scroll_view);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_my_scroll_view, menu);
        return true;
    }
}
