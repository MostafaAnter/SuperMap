package com.mostafaAnter.supermap;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void simpleMap(View view) {
        Intent intent = new Intent(this, SimpleMap.class);
        startActivity(intent);

    }

    public void mapView(View view) {
        Intent intent = new Intent(this, MapViewActivity.class);
        startActivity(intent);
    }

    public void referanceMap(View view) {
        Intent intent = new Intent(this, ReferenceMap.class);
        startActivity(intent);
    }

    public void intialState(View view) {
        Intent intent = new Intent(this, InitialStateXml.class);
        startActivity(intent);
    }

    public void intialStateJava(View view) {
        Intent intent = new Intent(this, InitialStateJava.class);
        startActivity(intent);
    }

    public void usingGeoCode(View view) {
        Intent intent = new Intent(this, GeoActivity.class);
        startActivity(intent);
    }

    public void changMap(View view) {
        Intent intent = new Intent(this, ChangMap.class);
        startActivity(intent);

    }

    public void saveState(View view) {
        Intent intent = new Intent(this, SaveStateActivity.class);
        startActivity(intent);

    }
}
