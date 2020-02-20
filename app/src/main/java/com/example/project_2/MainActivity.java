package com.example.project_2;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
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
        if(v.getId() == R.id.cocoButton || v.getId() == R.id.cocoText) {
            getMenuInflater().inflate(R.menu.coco_context_menu, menu);
        }
        else if(v.getId() == R.id.infinityButton || v.getId() == R.id.infinityText) {
            getMenuInflater().inflate(R.menu.infinity_context_menu, menu);
        }
        else if(v.getId() == R.id.jokerButton || v.getId() == R.id.jokerText) {
            getMenuInflater().inflate(R.menu.joker_context_menu, menu);
        }
        else if(v.getId() == R.id.knivesButton || v.getId() == R.id.knivesText) {
            getMenuInflater().inflate(R.menu.knives_context_menu, menu);
        }
        else if(v.getId() == R.id.parasiteButton || v.getId() == R.id.parasiteText) {
            getMenuInflater().inflate(R.menu.coco_context_menu, menu);
        }
        else if(v.getId() == R.id.uncutButton || v.getId() == R.id.uncutText) {
            getMenuInflater().inflate(R.menu.coco_context_menu, menu);
        }
    }

    @Override
    public boolean onContextItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case R.id.cocoDisplayInfo:

                return true;
            case R.id.cocoToTrailer:
                String cocoTrailerUrl = "https://www.imdb.com/video/vi4249729305?ref_=nv_sr_srsg_1";
                Uri cocoTrailerUri = Uri.parse(cocoTrailerUrl);

                Intent cocoTrailer = new Intent(Intent.ACTION_VIEW, cocoTrailerUri);

                if (cocoTrailer.resolveActivity(getPackageManager()) != null) {
                    startActivity(cocoTrailer);
                }
                return true;
            case R.id.cocoToWiki:
                String cocoWikiUrl = "https://en.wikipedia.org/wiki/Lee_Unkrich";
                Uri cocoWikiUri = Uri.parse(cocoWikiUrl);

                Intent cocoWiki = new Intent(Intent.ACTION_VIEW, cocoWikiUri);

                if (cocoWiki.resolveActivity(getPackageManager()) != null) {
                    startActivity(cocoWiki);
                }
                return true;
            case R.id.cocoToImdb:
                String cocoImdbUrl = "https://www.imdb.com/title/tt2380307/?ref_=nv_sr_srsg_0";
                Uri cocoImdbUri = Uri.parse(cocoImdbUrl);

                Intent cocoImdb = new Intent(Intent.ACTION_VIEW, cocoImdbUri);

                if (cocoImdb.resolveActivity(getPackageManager()) != null) {
                    startActivity(cocoImdb);
                }
                return true;
            case R.id.infinityDisplayInfo:

                return true;
            case R.id.infinityToTrailer:
                String infinityTrailerUrl = "https://www.imdb.com/video/vi528070681?playlistId=tt4154756&ref_=tt_ov_vi";
                Uri infinityTrailerUri = Uri.parse(infinityTrailerUrl);

                Intent infinityTrailer = new Intent(Intent.ACTION_VIEW, infinityTrailerUri);

                if (infinityTrailer.resolveActivity(getPackageManager()) != null) {
                    startActivity(infinityTrailer);
                }
                return true;
            case R.id.infinityToWiki:
                String infinityWikiUrl = "https://en.wikipedia.org/wiki/Russo_brothers";
                Uri infinityWikiUri = Uri.parse(infinityWikiUrl);

                Intent infinityWiki = new Intent(Intent.ACTION_VIEW, infinityWikiUri);

                if (infinityWiki.resolveActivity(getPackageManager()) != null) {
                    startActivity(infinityWiki);
                }
                return true;
            case R.id.infinityToImdb:
                String infinityImdbUrl = "https://www.imdb.com/title/tt4154756/?ref_=nv_sr_srsg_0";
                Uri infinityImdbUri = Uri.parse(infinityImdbUrl);

                Intent infinityImdb = new Intent(Intent.ACTION_VIEW, infinityImdbUri);

                if (infinityImdb.resolveActivity(getPackageManager()) != null) {
                    startActivity(infinityImdb);
                }
                return true;
            case R.id.jokerDisplayInfo:

                return true;
            case R.id.jokerToTrailer:
                String jokerTrailerUrl = "https://www.imdb.com/video/vi1723318041?ref_=nv_sr_srsg_1";
                Uri jokerTrailerUri = Uri.parse(jokerTrailerUrl);

                Intent jokerTrailer = new Intent(Intent.ACTION_VIEW, jokerTrailerUri);

                if (jokerTrailer.resolveActivity(getPackageManager()) != null) {
                    startActivity(jokerTrailer);
                }
                return true;
            case R.id.jokerToWiki:
                String jokerWikiUrl = "https://en.wikipedia.org/wiki/Todd_Phillips";
                Uri jokerWikiUri = Uri.parse(jokerWikiUrl);

                Intent jokerWiki = new Intent(Intent.ACTION_VIEW, jokerWikiUri);

                if (jokerWiki.resolveActivity(getPackageManager()) != null) {
                    startActivity(jokerWiki);
                }
                return true;
            case R.id.jokerToImdb:
                String jokerImdbUrl = "https://www.imdb.com/title/tt7286456/?ref_=fn_al_tt_1";
                Uri jokerImdbUri = Uri.parse(jokerImdbUrl);

                Intent jokerImdb = new Intent(Intent.ACTION_VIEW, jokerImdbUri);

                if (jokerImdb.resolveActivity(getPackageManager()) != null) {
                    startActivity(jokerImdb);
                }
                return true;
            case R.id.knivesDisplayInfo:

                return true;
            case R.id.knivesToTrailer:
                String knivesTrailerUrl = "https://www.imdb.com/video/vi2464857881?ref_=nv_sr_srsg_1";
                Uri knivesTrailerUri = Uri.parse(knivesTrailerUrl);

                Intent knivesTrailer = new Intent(Intent.ACTION_VIEW, knivesTrailerUri);

                if (knivesTrailer.resolveActivity(getPackageManager()) != null) {
                    startActivity(knivesTrailer);
                }
                return true;
            case R.id.knivesToWiki:
                String knivesWikiUrl = "https://en.wikipedia.org/wiki/Rian_Johnson";
                Uri knivesWikiUri = Uri.parse(knivesWikiUrl);

                Intent knivesWiki = new Intent(Intent.ACTION_VIEW, knivesWikiUri);

                if (knivesWiki.resolveActivity(getPackageManager()) != null) {
                    startActivity(knivesWiki);
                }
                return true;
            case R.id.knivesToImdb:
                String knivesImdbUrl = "https://www.imdb.com/title/tt8946378/?ref_=nv_sr_srsg_0";
                Uri knivesImdbUri = Uri.parse(knivesImdbUrl);

                Intent knivesImdb = new Intent(Intent.ACTION_VIEW, knivesImdbUri);

                if (knivesImdb.resolveActivity(getPackageManager()) != null) {
                    startActivity(knivesImdb);
                }
                return true;
            case R.id.parasiteDisplayInfo:

                return true;
            case R.id.parasiteToTrailer:
                String parasiteTrailerUrl = "https://www.imdb.com/video/vi1015463705?playlistId=tt6751668&ref_=tt_ov_vi";
                Uri parasiteTrailerUri = Uri.parse(parasiteTrailerUrl);

                Intent parasiteTrailer = new Intent(Intent.ACTION_VIEW, parasiteTrailerUri);

                if (parasiteTrailer.resolveActivity(getPackageManager()) != null) {
                    startActivity(parasiteTrailer);
                }
                return true;
            case R.id.parasiteToWiki:
                String parasiteWikiUrl = "https://en.wikipedia.org/wiki/Bong_Joon-ho";
                Uri parasiteWikiUri = Uri.parse(parasiteWikiUrl);

                Intent parasiteWiki = new Intent(Intent.ACTION_VIEW, parasiteWikiUri);

                if (parasiteWiki.resolveActivity(getPackageManager()) != null) {
                    startActivity(parasiteWiki);
                }
                return true;
            case R.id.parasiteToImdb:
                String parasiteImdbUrl = "https://www.imdb.com/title/tt6751668/?ref_=nv_sr_srsg_1";
                Uri parasiteImdbUri = Uri.parse(parasiteImdbUrl);

                Intent parasiteImdb = new Intent(Intent.ACTION_VIEW, parasiteImdbUri);

                if (parasiteImdb.resolveActivity(getPackageManager()) != null) {
                    startActivity(parasiteImdb);
                }
                return true;
            case R.id.uncutDisplayInfo:

                return true;
            case R.id.uncutToTrailer:
                String uncutTrailerUrl = "https://www.imdb.com/video/vi2668412697?ref_=nv_sr_srsg_1";
                Uri uncutTrailerUri = Uri.parse(uncutTrailerUrl);

                Intent uncutTrailer = new Intent(Intent.ACTION_VIEW, uncutTrailerUri);

                if (uncutTrailer.resolveActivity(getPackageManager()) != null) {
                    startActivity(uncutTrailer);
                }
                return true;
            case R.id.uncutToWiki:
                String uncutWikiUrl = "https://en.wikipedia.org/wiki/Safdie_brothers";
                Uri uncutWikiUri = Uri.parse(uncutWikiUrl);

                Intent uncutWiki = new Intent(Intent.ACTION_VIEW, uncutWikiUri);

                if (uncutWiki.resolveActivity(getPackageManager()) != null) {
                    startActivity(uncutWiki);
                }
                return true;
            case R.id.uncutToImdb:
                String uncutImdbUrl = "https://www.imdb.com/title/tt5727208/?ref_=nv_sr_srsg_0";
                Uri uncutImdbUri = Uri.parse(uncutImdbUrl);

                Intent uncutImdb = new Intent(Intent.ACTION_VIEW, uncutImdbUri);

                if (uncutImdb.resolveActivity(getPackageManager()) != null) {
                    startActivity(uncutImdb);
                }
                return true;
            default:
                return super.onContextItemSelected(item);
        }
    }
}
