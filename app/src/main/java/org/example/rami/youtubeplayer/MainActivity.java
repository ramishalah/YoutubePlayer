package org.example.rami.youtubeplayer;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnPlaySingle = (Button) findViewById(R.id.btnPlaySingle);
        Button btnPlaySub = (Button) findViewById(R.id.btnStandAlone);
        btnPlaySingle.setOnClickListener(this);
        btnPlaySub.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {
        Intent intent = null;

        switch (v.getId()){
            case R.id.btnPlaySingle:
                intent = new Intent(this, YoutubeActivity.class);
                break;

            case R.id.btnStandAlone:
                intent = new Intent(this, StandAloneActivity.class);
                break;

            default:
                //Nothing to do.
        }

        if(intent != null){
            startActivity(intent);
        }
    }
}
