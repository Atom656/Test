package com.example.myfrankivsk01;

import android.os.Bundle;

import com.google.android.material.appbar.CollapsingToolbarLayout;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class ScrollingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scrolling);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        CollapsingToolbarLayout toolBarLayout = (CollapsingToolbarLayout) findViewById(R.id.toolbar_layout);
        toolBarLayout.setTitle(getTitle());
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_scrolling, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        switch (item.getItemId()){
            case R.id.action_home:
                Toast.makeText(this,"Ви вибрали головну сторінку", Toast.LENGTH_SHORT).show();
                return  true;
        }
        switch (item.getItemId()){
            case R.id.action_news:
                Toast.makeText(this,"Ви вибрали вкладку з новинами", Toast.LENGTH_SHORT).show();
                return  true;
        }
        switch (item.getItemId()){
            case R.id.action_settings:
                Toast.makeText(this,"Ви вибрали налаштування", Toast.LENGTH_SHORT).show();
                return  true;
        }
        switch (item.getItemId()){
            case R.id.action_resturan:
                Toast.makeText(this,"Ви вибрали карту ресторанів", Toast.LENGTH_SHORT).show();
                return  true;
        }
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}