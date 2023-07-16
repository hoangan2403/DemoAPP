package com.example.btl_foodapp_2_7.Project.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.ScaleAnimation;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.btl_foodapp_2_7.Project.Fragments.Fragment_cai_dat;
import com.example.btl_foodapp_2_7.Project.Fragments.Fragment_dang_bai;
import com.example.btl_foodapp_2_7.Project.Fragments.Fragment_trang_chu;
import com.example.btl_foodapp_2_7.Project.Fragments.Fragment_yeu_thich;
import com.example.btl_foodapp_2_7.R;

public class MainActivity extends AppCompatActivity {



    //    code bottom
    private int selecTab = 1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //slide banner



//        code botom
        final LinearLayout trangchuLayout = findViewById(R.id.trangchuLayout);
        final LinearLayout dangbaiLayout = findViewById(R.id.dangbaiLayout);
        final LinearLayout caidatLayout1 = findViewById(R.id.caidatLayout1);
        final LinearLayout caidatLayout = findViewById(R.id.caidatLayout);

        final ImageView trangchuImg = findViewById(R.id.trangchuLayoutImg);
        final ImageView dangbaiImg = findViewById(R.id.dangbaiLayoutImg);
        final ImageView caidatImg1 = findViewById(R.id.caidatLayoutImg1);
        final ImageView caidatImg = findViewById(R.id.caidatLayoutImg);

        final TextView trangchuTxt = findViewById(R.id.trangchuLayoutTxt);
        final TextView dangbaiTxt = findViewById(R.id.dangbaiLayoutTxt);
        final TextView caidatTxt1 = findViewById(R.id.caidatLayoutTxt1);
        final TextView caidatTxt = findViewById(R.id.caidatLayoutTxt);


        getSupportFragmentManager().beginTransaction().replace(R.id.homeFragment, Fragment_trang_chu.class, null).commit();
//set fragments

        trangchuLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (selecTab != 1) {
                    getSupportFragmentManager().beginTransaction().replace(R.id.homeFragment, Fragment_trang_chu.class, null).commit();

                    dangbaiTxt.setVisibility(View.GONE);
                    caidatTxt1.setVisibility(View.GONE);
                    caidatTxt.setVisibility(View.GONE);

                    dangbaiImg.setImageResource(R.drawable.test2_selec);
                    caidatImg1.setImageResource(R.drawable.test3_selec);
                    caidatImg.setImageResource(R.drawable.test4_selec);

                    dangbaiLayout.setBackgroundColor(getResources().getColor(android.R.color.transparent));
                    caidatLayout1.setBackgroundColor(getResources().getColor(android.R.color.transparent));
                    caidatLayout.setBackgroundColor(getResources().getColor(android.R.color.transparent));

                    trangchuTxt.setVisibility(View.VISIBLE);
                    trangchuImg.setImageResource(R.drawable.test1_bold);
                    trangchuLayout.setBackgroundResource(R.drawable.bg_bottom_item);

                    ScaleAnimation scaleAnimation = new ScaleAnimation(0.8f, 1.0f, 1f, 1f, Animation.RELATIVE_TO_SELF, 0.0f, Animation.RELATIVE_TO_SELF, 0.0f);
                    scaleAnimation.setDuration(200);
                    scaleAnimation.setFillAfter(true);
                    trangchuLayout.startAnimation(scaleAnimation);

                    selecTab = 1;

                }
            }
        });

        dangbaiLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (selecTab != 2) {

                    getSupportFragmentManager().beginTransaction().replace(R.id.homeFragment, Fragment_dang_bai.class, null).commit();

                    trangchuTxt.setVisibility(View.GONE);
                    caidatTxt1.setVisibility(View.GONE);
                    caidatTxt.setVisibility(View.GONE);

                    trangchuImg.setImageResource(R.drawable.test1_selec);
                    caidatImg1.setImageResource(R.drawable.test3_selec);
                    caidatImg.setImageResource(R.drawable.test4_selec);

                    trangchuLayout.setBackgroundColor(getResources().getColor(android.R.color.transparent));
                    caidatLayout1.setBackgroundColor(getResources().getColor(android.R.color.transparent));
                    caidatLayout.setBackgroundColor(getResources().getColor(android.R.color.transparent));


                    dangbaiTxt.setVisibility(View.VISIBLE);
                    dangbaiImg.setImageResource(R.drawable.test2_bold);
                    dangbaiLayout.setBackgroundResource(R.drawable.bg_bottom_item);



                    ScaleAnimation scaleAnimation = new ScaleAnimation(0.8f, 1.0f, 1f, 1f, Animation.RELATIVE_TO_SELF, 1.0f, Animation.RELATIVE_TO_SELF, 0.0f);
                    scaleAnimation.setDuration(200);
                    scaleAnimation.setFillAfter(true);
                    dangbaiLayout.startAnimation(scaleAnimation);

                    selecTab = 2;

                }
            }
        });

        caidatLayout1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (selecTab != 3) {

                    getSupportFragmentManager().beginTransaction().replace(R.id.homeFragment, Fragment_yeu_thich.class, null).commit();

                    trangchuTxt.setVisibility(View.GONE);
                    dangbaiTxt.setVisibility(View.GONE);
                    caidatTxt.setVisibility(View.GONE);

                    trangchuImg.setImageResource(R.drawable.test1_selec);
                    dangbaiImg.setImageResource(R.drawable.test2_selec);
                    caidatImg.setImageResource(R.drawable.test4_selec);

                    trangchuLayout.setBackgroundColor(getResources().getColor(android.R.color.transparent));
                    dangbaiLayout.setBackgroundColor(getResources().getColor(android.R.color.transparent));
                    caidatLayout.setBackgroundColor(getResources().getColor(android.R.color.transparent));

                    caidatTxt1.setVisibility(View.VISIBLE);
                    caidatImg1.setImageResource(R.drawable.test3_bold);
                    caidatLayout1.setBackgroundResource(R.drawable.bg_bottom_item);

                    ScaleAnimation scaleAnimation = new ScaleAnimation(0.8f, 1.0f, 1f, 1f, Animation.RELATIVE_TO_SELF, 1.0f, Animation.RELATIVE_TO_SELF, 0.0f);
                    scaleAnimation.setDuration(200);
                    scaleAnimation.setFillAfter(true);
                    caidatLayout1.startAnimation(scaleAnimation);

                    selecTab = 3;
                }
            }
        });

        caidatLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (selecTab != 4) {

                    getSupportFragmentManager().beginTransaction().replace(R.id.homeFragment, Fragment_cai_dat.class, null).commit();

                    trangchuTxt.setVisibility(View.GONE);
                    dangbaiTxt.setVisibility(View.GONE);
                    caidatTxt1.setVisibility(View.GONE);

                    trangchuImg.setImageResource(R.drawable.test1_selec);
                    dangbaiImg.setImageResource(R.drawable.test2_selec);
                    caidatImg1.setImageResource(R.drawable.test3_selec);

                    trangchuLayout.setBackgroundColor(getResources().getColor(android.R.color.transparent));
                    dangbaiLayout.setBackgroundColor(getResources().getColor(android.R.color.transparent));
                    caidatLayout1.setBackgroundColor(getResources().getColor(android.R.color.transparent));

                    caidatTxt.setVisibility(View.VISIBLE);
                    caidatImg.setImageResource(R.drawable.test4_bold);
                    caidatLayout.setBackgroundResource(R.drawable.bg_bottom_item);

                    ScaleAnimation scaleAnimation = new ScaleAnimation(0.8f, 1.0f, 1f, 1f, Animation.RELATIVE_TO_SELF, 1.0f, Animation.RELATIVE_TO_SELF, 0.0f);
                    scaleAnimation.setDuration(200);
                    scaleAnimation.setFillAfter(true);
                    caidatLayout.startAnimation(scaleAnimation);

                    selecTab = 4;
                }
            }
        });

//end



    }




}