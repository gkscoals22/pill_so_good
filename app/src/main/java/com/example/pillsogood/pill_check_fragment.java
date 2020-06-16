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

public class pill_check_fragment extends Fragment // Fragment 클래스를 상속받아야한다
{

    private View view;
    private ImageView profile;
    private ImageView imageview;
    private ImageView imageview2;
    private ImageView imageview3;
    private ImageView imageview4;
    private ImageView imageview5;
    public static pill_check_fragment newInstance() {
        return new pill_check_fragment();
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState)
    {
        view = inflater.inflate(R.layout.pill_check,container,false);

        profile = (ImageView)view.findViewById(R.id.profileview);
        imageview = (ImageView)view.findViewById(R.id.imageview);
        imageview2 = (ImageView)view.findViewById(R.id.imageview2);
        imageview3 = (ImageView)view.findViewById(R.id.imageview3);
        imageview4 = (ImageView)view.findViewById(R.id.imageview4);
        imageview5 = (ImageView)view.findViewById(R.id.imageview5);

        profile.getLayoutParams().height=100;
        profile.getLayoutParams().width=100;
        profile.setImageResource(R.drawable.profile_image);
        imageview.setImageResource(R.drawable.today_pill_check2);
        imageview2.setImageResource(R.drawable.pill_ing2);
        imageview3.setImageResource(R.drawable.today2);
        imageview4.setImageResource(R.drawable.pill_after_meal2);
        imageview5.setImageResource(R.drawable.banner2);

        return view;
    }
}