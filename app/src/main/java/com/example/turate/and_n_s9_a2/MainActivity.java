package com.example.turate.and_n_s9_a2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
// Inflating Menu
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu, menu);
        return true;
    }

    // CREATING TOAST ON CLICKING A OPTION
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case  R.id.itm1:
                Toast.makeText(this, "You Clicked on Orange", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.itm2:
                Toast.makeText(this, "You Clicked on Red", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.itm3:
                Toast.makeText(this, "You Clicked on Green", Toast.LENGTH_SHORT).show();
                return true;
            default:
            return super.onOptionsItemSelected(item);}
    }
}
