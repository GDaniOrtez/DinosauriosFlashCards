package com.example.dinosauriosflashcards;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.widget.LinearLayout;

public class Card extends AppCompatActivity {

    private ViewPager mSlideViewPager;
    private LinearLayout mDotLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_card);

        mSlideViewPager = (ViewPager) findViewById(R.id.sLideViewPager);
        mDotLayout = (LinearLayout) findViewById(R.id.dotsLayout);
    }


}
