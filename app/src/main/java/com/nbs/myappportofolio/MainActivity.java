package com.nbs.myappportofolio;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    private Button btnSpofity, btnScoresApp, btnLibraryApp, btnBuildBigger,
    btnXyzReader, btnCapstone;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnSpofity = (Button)findViewById(R.id.btn_spotify);
        btnScoresApp = (Button)findViewById(R.id.btn_scores_app);
        btnLibraryApp = (Button)findViewById(R.id.btn_library_app);
        btnBuildBigger = (Button)findViewById(R.id.btn_build_bigger);
        btnXyzReader = (Button)findViewById(R.id.btn_xyz_reader);
        btnCapstone = (Button)findViewById(R.id.btn_capstone);

        btnSpofity.setOnClickListener(this);
        btnScoresApp.setOnClickListener(this);
        btnLibraryApp.setOnClickListener(this);
        btnBuildBigger.setOnClickListener(this);
        btnXyzReader.setOnClickListener(this);
        btnCapstone.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btn_spotify:
                showBottomToast("Spotify Streamer Clicked");
                break;

            case R.id.btn_scores_app:
                showBottomToast("Scores App Clicked");
                break;

            case R.id.btn_library_app:
                showBottomToast("Library App");
                break;

            case R.id.btn_build_bigger:
                showBottomToast("Build it Bigger");
                break;

            case R.id.btn_xyz_reader:
                showBottomToast("XYZ Reader");
                break;

            case R.id.btn_capstone:
                showBottomToast("Capstone Clicked");
                break;
        }
    }

    private void showBottomToast(String message){
        Toast.makeText(MainActivity.this, message, Toast.LENGTH_LONG).show();
    }
}
