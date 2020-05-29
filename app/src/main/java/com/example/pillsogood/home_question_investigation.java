package com.example.pillsogood;

import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class home_question_investigation extends Fragment {
    private View view;
    private ImageView[] imageView = new ImageView[9];
//    public int i;
    public boolean selectedImage[] = new boolean[9];
    private int selectImageCount = 0;
    public static home_question_investigation newInstance() {
        return new home_question_investigation();
    }

    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState){
        view = inflater.inflate(R.layout.home_question_investigation,container,false);

        imageView[0] = (ImageView)view.findViewById(R.id.imageview);
        imageView[1] = (ImageView)view.findViewById(R.id.imageview2);
        imageView[2] = (ImageView)view.findViewById(R.id.imageview3);
        imageView[3] = (ImageView)view.findViewById(R.id.imageview4);
        imageView[4] = (ImageView)view.findViewById(R.id.imageview5);
        imageView[5] = (ImageView)view.findViewById(R.id.imageview6);
        imageView[6] = (ImageView)view.findViewById(R.id.imageview7);
        imageView[7] = (ImageView)view.findViewById(R.id.imageview8);
        imageView[8] = (ImageView)view.findViewById(R.id.imageview9);
        ImageView imageView10 = (ImageView)view.findViewById(R.id.imageview10);
        ImageView imageView11 = (ImageView)view.findViewById(R.id.imageview11);
        imageView11.getLayoutParams().height=100;
        imageView11.getLayoutParams().width=100;

        for(int i = 0 ; i < selectedImage.length ; i++)
            selectedImage[i] = false;

        TextView textView = (TextView)view.findViewById(R.id.textview);
        textView.setText("Pill so Good");

//         drawable에 있는 이미지를 지정합니다.
        imageView[0].setImageResource(R.drawable.store_menu1);
        imageView[1].setImageResource(R.drawable.store_menu2);
        imageView[2].setImageResource(R.drawable.store_menu3);
        imageView[3].setImageResource(R.drawable.store_menu4);
        imageView[4].setImageResource(R.drawable.store_menu5);
        imageView[5].setImageResource(R.drawable.store_menu6);
        imageView[6].setImageResource(R.drawable.store_menu7);
        imageView[7].setImageResource(R.drawable.store_menu8);
        imageView[8].setImageResource(R.drawable.store_menu9);
        imageView10.setImageResource(R.drawable.store_menu_question);
        imageView11.setImageResource(R.drawable.profile_image);

        imageView[0].setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                if(!selectedImage[0]) {
                    imageView[0].setBackgroundResource(R.color.colorAccent);
                    selectedImage[0] = true;
                }
                else if(selectedImage[0]) {
                    imageView[0].setBackgroundResource(R.color.transparent);
                    selectedImage[0] = false;
                }
            }
        });

        imageView[1].setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                if(!selectedImage[1]) {
                    imageView[1].setBackgroundResource(R.color.colorAccent);
                    selectedImage[1] = true;
                }
                else if(selectedImage[1]) {
                    imageView[1].setBackgroundResource(R.color.transparent);
                    selectedImage[1] = false;
                }
            }
        });

        imageView[2].setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                if(!selectedImage[2]) {
                    imageView[2].setBackgroundResource(R.color.colorAccent);
                    selectedImage[2] = true;
                }
                else if(selectedImage[2]) {
                    imageView[2].setBackgroundResource(R.color.transparent);
                    selectedImage[2] = false;
                }
            }
        });

        imageView[3].setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                if(!selectedImage[3]) {
                    imageView[3].setBackgroundResource(R.color.colorAccent);
                    selectedImage[3] = true;
                }
                else if(selectedImage[3]) {
                    imageView[3].setBackgroundResource(R.color.transparent);
                    selectedImage[3] = false;
                }
            }
        });

        imageView[4].setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                if(!selectedImage[4]) {
                    imageView[4].setBackgroundResource(R.color.colorAccent);
                    selectedImage[4] = true;
                }
                else if(selectedImage[4]) {
                    imageView[4].setBackgroundResource(R.color.transparent);
                    selectedImage[4] = false;
                }
            }
        });

        imageView[5].setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                if(!selectedImage[5]) {
                    imageView[5].setBackgroundResource(R.color.colorAccent);
                    selectedImage[5] = true;
                }
                else if(selectedImage[5]) {
                    imageView[5].setBackgroundResource(R.color.transparent);
                    selectedImage[5] = false;
                }
            }
        });

        imageView[6].setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                if(!selectedImage[6]) {
                    imageView[6].setBackgroundResource(R.color.colorAccent);
                    selectedImage[6] = true;
                }
                else if(selectedImage[6]) {
                    imageView[6].setBackgroundResource(R.color.transparent);
                    selectedImage[6] = false;
                }
            }
        });

        imageView[7].setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                if(!selectedImage[7]) {
                    imageView[7].setBackgroundResource(R.color.colorAccent);
                    selectedImage[7] = true;
                }
                else if(selectedImage[7]) {
                    imageView[7].setBackgroundResource(R.color.transparent);
                    selectedImage[7] = false;
                }
            }
        });

        imageView[8].setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                if(!selectedImage[8]) {
                    imageView[8].setBackgroundResource(R.color.colorAccent);
                    selectedImage[8] = true;
                }
                else if(selectedImage[8]) {
                    imageView[8].setBackgroundResource(R.color.transparent);
                    selectedImage[8] = false;
                }
            }
        });

        return view;
    }
}
