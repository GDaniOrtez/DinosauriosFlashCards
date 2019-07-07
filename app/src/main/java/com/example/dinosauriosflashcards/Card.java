package com.example.dinosauriosflashcards;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.Random;

public class Card extends AppCompatActivity {

    private ViewPager mSlideViewPager;
    private LinearLayout mDotLayout;

    private TextView[] mDots;

    private SliderAdapter sliderAdapter;

    private Button mNextBtn;
    private Button mCloseBtn;

    private int Numero(int max){

        Random random = new Random();
        random.setSeed(System.currentTimeMillis());

        int numRandom = random.nextInt(max);
        return numRandom;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_card);

        mSlideViewPager = (ViewPager) findViewById(R.id.sLideViewPager);
        mDotLayout = (LinearLayout) findViewById(R.id.dotsLayout);

        sliderAdapter = new SliderAdapter(this);
        mSlideViewPager.setAdapter(sliderAdapter);

        addDotsIndicator(0);

        mNextBtn = (Button) findViewById(R.id.nextbtn);
        mCloseBtn = (Button) findViewById(R.id.closebtn);

        mSlideViewPager.addOnPageChangeListener(viewListener);
    }


}
