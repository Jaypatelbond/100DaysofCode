package com.example.mvvmexample.activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.content.ContextCompat;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import com.example.mvvmexample.viewmodel.MainActivityViewModel;
import com.example.mvvmexample.R;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

/**
 * @author Jaypatelbond created on 27-12-2019.
 * @implSpec The Count here is increasing irrespective of the fact that
 * the Orientation of the phone is changing. During the change in the orientation or configuration,
 * the activity is destroyed and recreated so the count value is lost.
 * The Count value is survives due to the scope of the ViewModel.
 */

public class MainActivity extends AppCompatActivity {
    MainActivityViewModel mainActivityViewModel;
    private TextView textView;
    private Button buttonRoom;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        textView = (TextView) findViewById(R.id.tvCount);
        buttonRoom = (Button) findViewById(R.id.buttonRoomDatabase);

        mainActivityViewModel = new ViewModelProvider(this).get(MainActivityViewModel.class);

        LiveData<Integer> count = mainActivityViewModel.getInitialCount();
        count.observe(this, new Observer<Integer>() {
            @Override
            public void onChanged(@Nullable Integer integer) {
                textView.setText("Count is: " + integer);
            }
        });

        buttonRoom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, StudentActivity.class));
            }
        });
        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mainActivityViewModel.getCurrentCount();
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

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}

