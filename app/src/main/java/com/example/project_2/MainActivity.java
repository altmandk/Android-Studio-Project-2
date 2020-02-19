package com.example.project_2;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    String TAG = "moviePic";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        LinearLayout cocoText = findViewById(R.id.cocoText);
        LinearLayout infinityText = findViewById(R.id.infinityText);
        LinearLayout jokerText = findViewById(R.id.jokerText);
        LinearLayout knivesText = findViewById(R.id.knivesText);
        LinearLayout parasiteText = findViewById(R.id.parasiteText);
        LinearLayout uncutText = findViewById(R.id.uncutText);

        Button cocoButton = findViewById(R.id.cocoButton);
        Button infinityButton = findViewById(R.id.infinityButton);
        Button jokerButton = findViewById(R.id.jokerButton);
        Button knivesButton = findViewById(R.id.knivesButton);
        Button parasiteButton = findViewById(R.id.parasiteButton);
        Button uncutButton = findViewById(R.id.uncutButton);

        registerForContextMenu(cocoText);
        registerForContextMenu(infinityText);
        registerForContextMenu(jokerText);
        registerForContextMenu(knivesText);
        registerForContextMenu(parasiteText);
        registerForContextMenu(uncutText);

        registerForContextMenu(cocoButton);
        registerForContextMenu(infinityButton);
        registerForContextMenu(jokerButton);
        registerForContextMenu(knivesButton);
        registerForContextMenu(parasiteButton);
        registerForContextMenu(uncutButton);

    }

    public void onClick(View v) {
        Intent i = new Intent(this, PictureActivity.class);

        switch(v.getId()) {
            case R.id.cocoText:
            case R.id.cocoButton:
                i.putExtra(TAG, "coco");
                startActivity(i);
                break;
            case R.id.infinityText:
            case R.id.infinityButton:
                i.putExtra(TAG, "infinity");
                startActivity(i);
                break;
            case R.id.jokerText:
            case R.id.jokerButton:
                i.putExtra(TAG, "joker");
                startActivity(i);
                break;
            case R.id.knivesText:
            case R.id.knivesButton:
                i.putExtra(TAG, "knives");
                startActivity(i);
                break;
            case R.id.parasiteText:
            case R.id.parasiteButton:
                i.putExtra(TAG, "parasite");
                startActivity(i);
                break;
            case R.id.uncutText:
            case R.id.uncutButton:
                i.putExtra(TAG, "uncut");
                startActivity(i);
                break;
        }
    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);
        getMenuInflater().inflate(R.menu.context_menu, menu);
    }

    @Override
    public boolean onContextItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case R.id.displayInfo:
                Toast.makeText(getApplicationContext(),
                        "Hello Info",Toast.LENGTH_SHORT).show();
                return true;
            case R.id.toTrailer:
                Toast.makeText(getApplicationContext(),
                        "Hello Trailer",Toast.LENGTH_SHORT).show();
                return true;
            case R.id.toWiki:
                Toast.makeText(getApplicationContext(),
                        "Hello Wiki",Toast.LENGTH_SHORT).show();
                return true;
            case R.id.toImdb:
                Toast.makeText(getApplicationContext(),
                        "Hello IMDB",Toast.LENGTH_SHORT).show();
                return true;
            default:
                return super.onContextItemSelected(item);
        }
    }
}
