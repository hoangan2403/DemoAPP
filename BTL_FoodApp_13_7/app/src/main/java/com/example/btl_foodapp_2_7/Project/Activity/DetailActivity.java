//package com.example.btl_foodapp_2_7.Project.Activity;
//
//import androidx.appcompat.app.AppCompatActivity;
//
//import android.os.Bundle;
//import android.view.View;
//import android.widget.CheckBox;
//import android.widget.ImageView;
//import android.widget.LinearLayout;
//import android.widget.TextView;
//
//import com.example.btl_foodapp_2_7.R;
//
//public class DetailActivity extends AppCompatActivity {
//    private TextView titleTxt, priceTxt,timeTxt,scoreTxt,titleTxt1;
//    private ImageView backBtn,foodPic;
//    private CheckBox favoriteBtn;
//
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_detail);
//
//
//        initView();
//        setVarible();
//
//
//    }
//
//    private void setVarible() {
//        titleTxt.setText(item);
//    }
//
//    private void initView() {
//
//        titleTxt = findViewById(R.id.titleTxt);
//        priceTxt = findViewById(R.id.priceTxt);
//        timeTxt = findViewById(R.id.timeTxt);
//        scoreTxt = findViewById(R.id.scoreTxt);
//        titleTxt1 = findViewById(R.id.titleTxt1);
//        backBtn = findViewById(R.id.backBtn);
//        favoriteBtn = findViewById(R.id.favoriteBtn);
//        foodPic = findViewById(R.id.foodPic);
//    }
//
//
//}