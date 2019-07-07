package com.example.dinosauriosflashcards;



import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;

import androidx.annotation.NonNull;
import androidx.viewpager.widget.PagerAdapter;

import java.util.Random;

public class SliderAdapter extends PagerAdapter {

    Context context;
    LayoutInflater layoutInflater;


    public SliderAdapter(Context context)
    {
        this.context=context;
    }


    public int[] slide_images ={

            R.mipmap.braquiosaurio,
            R.mipmap.nbraquiosauurio,
    };

    public int[] slide_images2 ={

            R.mipmap.diplodocus,
            R.mipmap.ndiplodocus,
    };

    public int[] slide_images3 ={

            R.mipmap.alosaurio,
            R.mipmap.nalosaurio,
    };

    public int[] slide_images4 ={

            R.mipmap.anquilosaurio,
            R.mipmap.nanquilosaurio,
    };

    public int[] slide_images5 ={

            R.mipmap.apatosaurio,
            R.mipmap.napatosaurio,
    };

    public int[] slide_images6 ={

            R.mipmap.brontosaurio,
            R.mipmap.nbrontosaurio,
    };

    public int[] slide_images7 ={

            R.mipmap.compsognathus,
            R.mipmap.ncompogsonathus,
    };

    public int[] slide_images8 ={

            R.mipmap.coritosaurio,
            R.mipmap.ncoritosaurio,
    };

    public int[] slide_images9 ={

            R.mipmap.dilophosaurus,
            R.mipmap.ndilofosaurio,
    };

    public int[] slide_images10 ={

            R.mipmap.espinosaurio,
            R.mipmap.nespinosaurio,
    };

    public int[] slide_images11 ={

            R.mipmap.lambeosaurus,
            R.mipmap.nlambeosaurio,
    };

    public int[] slide_images12 ={

            R.mipmap.parasaurolofus,
            R.mipmap.nparasauroolofus,
    };

    public int[] slide_images13 ={

            R.mipmap.plesiosaurio,
            R.mipmap.nplesiosaurio,
    };

    public int[] slide_images14 ={

            R.mipmap.protoceraptops,
            R.mipmap.nprotoceraptos,
    };

    public int[] slide_images15 ={

            R.mipmap.pterodactilo,
            R.mipmap.npterodactilo,
    };

    public int[] slide_images16 ={

            R.mipmap.stegosaurus,
            R.mipmap.nestegosaurio,
    };

    public int[] slide_images17 ={

            R.mipmap.thecodontosaurus,
            R.mipmap.ntecodontosaurio,
    };

    public int[] slide_images18 ={

            R.mipmap.tiranosaurio,
            R.mipmap.ntiranosaurio,
    };

    public int[] slide_images19 ={

            R.mipmap.tricerapto,
            R.mipmap.ntriceraptops,
    };

    public int[] slide_images20 ={

            R.mipmap.velociraptor,
            R.mipmap.nvelociraptor,
    };

    private int Numero(int max){

        Random random = new Random();
        random.setSeed(System.currentTimeMillis());

        int numRandom = random.nextInt(max);
        return numRandom;
    }

    @Override
    public int getCount() {
        return slide_images.length;
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object o) {
        return view == (RelativeLayout) o;
    }

    int mRandomNum = Numero(20);

    @Override
    public Object instantiateItem(ViewGroup container, int position){

        layoutInflater = (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
        View view = layoutInflater.inflate(R.layout.slide_layout, container, false);
        ImageView slideImageView = (ImageView) view.findViewById(R.id.slide_image);

        if(mRandomNum==0)
        {
            slideImageView.setImageResource(slide_images[position]);
        }

        if(mRandomNum==1)
        {
            slideImageView.setImageResource(slide_images2[position]);
        }

        if(mRandomNum==2)
        {
            slideImageView.setImageResource(slide_images3[position]);
        }

        if(mRandomNum==3)
        {
            slideImageView.setImageResource(slide_images4[position]);
        }

        if(mRandomNum==4)
        {
            slideImageView.setImageResource(slide_images5[position]);
        }

        if(mRandomNum==5)
        {
            slideImageView.setImageResource(slide_images6[position]);
        }

        else if(mRandomNum==6)
        {
            slideImageView.setImageResource(slide_images7[position]);
        }

        else if(mRandomNum==7)
        {
            slideImageView.setImageResource(slide_images8[position]);
        }

        else if(mRandomNum==8)
        {
            slideImageView.setImageResource(slide_images9[position]);
        }

        else if(mRandomNum==9)
        {
            slideImageView.setImageResource(slide_images10[position]);
        }

        else if(mRandomNum==10)
        {
            slideImageView.setImageResource(slide_images11[position]);
        }

        else if(mRandomNum==11)
        {
            slideImageView.setImageResource(slide_images12[position]);
        }

        else if(mRandomNum==12)
        {
            slideImageView.setImageResource(slide_images13[position]);
        }

        else if(mRandomNum==13)
        {
            slideImageView.setImageResource(slide_images14[position]);
        }

        else if(mRandomNum==14)
        {
            slideImageView.setImageResource(slide_images15[position]);
        }

        else if(mRandomNum==15)
        {
            slideImageView.setImageResource(slide_images16[position]);
        }

        else if(mRandomNum==16)
        {
            slideImageView.setImageResource(slide_images17[position]);
        }

        else if(mRandomNum==17)
        {
            slideImageView.setImageResource(slide_images18[position]);
        }

        else if(mRandomNum==18)
        {
            slideImageView.setImageResource(slide_images19[position]);
        }

        else if(mRandomNum==19)
        {
            slideImageView.setImageResource(slide_images20[position]);
        }

        container.addView(view);

        return view;
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object){
        container.removeView((RelativeLayout)object);
    }
}
