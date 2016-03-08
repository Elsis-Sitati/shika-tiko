package com.example.elsis.shikatiko;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.heinrichreimersoftware.materialintro.app.IntroActivity;
import com.heinrichreimersoftware.materialintro.slide.SimpleSlide;

public class Intro extends IntroActivity {




    @Override
    protected void onCreate(Bundle savedInstanceState) {

        setFullscreen(true);

        super.onCreate(savedInstanceState);

        addSlide(new SimpleSlide.Builder()
                .title(R.string.title_1)
                .description(R.string.description_1)

                .background(R.color.background_1)
                .backgroundDark(R.color.background_dark_1)
                .build());


        addSlide(new SimpleSlide.Builder()
                .title(R.string.title_2)
                .description(R.string.description_2)
                .background(R.color.background_2)
                .backgroundDark(R.color.background_dark_2)
                .build());

        addSlide(new SimpleSlide.Builder()
                .title(R.string.title_3)
                .description(R.string.description_3)
                .background(R.color.background_2)
                .backgroundDark(R.color.background_dark_2)
                .build());

        addSlide(new SimpleSlide.Builder()
                .title(R.string.title_4)
                .description(R.string.description_4)
                .background(R.color.background_2)
                .backgroundDark(R.color.background_dark_2)
                .build());



    }

    @Override
    protected void onStop() {
        super.onStop();
        Intent intent=new Intent(getBaseContext(),MainActivity.class);
        startActivity(intent);
    }
}
