package com.bankmtk.coordinatorlayout;

import android.app.Activity;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private final static String TEXT_CONTENT = "I don't know what I'm " +
            "required to say... to order for you to have intercourse with me. " +
            "But could we assume that I have said all off that. " +
            "Essentially we are talking about fluid exchange, right? " +
            "So, could we just go straight to the ...? ";
    private Toolbar toolbar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        TextView content = findViewById(R.id.content);
        content.setText(TEXT_CONTENT);


        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
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

        final Activity that = this;
        switch (id){

            case R.id.action_settings:
                Snackbar.make(toolbar,"You have chosen settings", Snackbar.LENGTH_LONG)
                        .setAction("Button", new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                Toast.makeText(that.getApplicationContext(),"Button in Snackbar was passed",
                                        Toast.LENGTH_LONG).show();
                            }
                        }).show();
                return true;
            case R.id.action_preferences:
                Snackbar.make(toolbar,"You have chosen menu preferences",Snackbar.LENGTH_LONG).show();
                return true;
            case R.id.action_params:
                Snackbar.make(toolbar,"You have chosen menu params",
                        Snackbar.LENGTH_LONG).show();
                return true;
        }
        return super.onOptionsItemSelected(item);

    }
}
