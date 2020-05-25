package com.example.pillsogood;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class pharmacy_fragment extends Fragment // Fragment 클래스를 상속받아야한다
{

    private View view;

    public static pharmacy_fragment newInstance() {
        return new pharmacy_fragment();
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState)
    {
        view = inflater.inflate(R.layout.pharmacy_fragment,container,false);

        ImageView imageView = (ImageView)view.findViewById(R.id.imageview);
        ImageView imageView2 = (ImageView)view.findViewById(R.id.imageview2);
        ImageView imageView3 = (ImageView)view.findViewById(R.id.imageview3);
        ImageView imageView4 = (ImageView)view.findViewById(R.id.imageview4);
        ImageView imageView5 = (ImageView)view.findViewById(R.id.imageview5);
        ImageView imageView6 = (ImageView)view.findViewById(R.id.imageview6);
        ImageView imageView7 = (ImageView)view.findViewById(R.id.imageview7);
        ImageView imageView8 = (ImageView)view.findViewById(R.id.imageview8);
        ImageView imageView9 = (ImageView)view.findViewById(R.id.imageview9);
        ImageView imageView10 = (ImageView)view.findViewById(R.id.imageview10);
        ImageView imageView11 = (ImageView)view.findViewById(R.id.imageview11);
        imageView11.getLayoutParams().height=100;
        imageView11.getLayoutParams().width=100;

        TextView textView = (TextView)view.findViewById(R.id.textview);
        textView.setText("Pill so Good");

//         drawable에 있는 이미지를 지정합니다.
        imageView.setImageResource(R.drawable.store_menu1);
        imageView2.setImageResource(R.drawable.store_menu2);
        imageView3.setImageResource(R.drawable.store_menu3);
        imageView4.setImageResource(R.drawable.store_menu4);
        imageView5.setImageResource(R.drawable.store_menu5);
        imageView6.setImageResource(R.drawable.store_menu6);
        imageView7.setImageResource(R.drawable.store_menu7);
        imageView8.setImageResource(R.drawable.store_menu8);
        imageView9.setImageResource(R.drawable.store_menu9);
        imageView10.setImageResource(R.drawable.store_menu_question);
        imageView11.setImageResource(R.drawable.profile_image);


        return view;
    }
}