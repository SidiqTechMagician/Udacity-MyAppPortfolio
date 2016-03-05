package com.nbs.myappportofolio;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
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
