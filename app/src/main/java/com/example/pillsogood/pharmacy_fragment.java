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
    private ImageView imageview;
    public static pharmacy_fragment newInstance() {
        return new pharmacy_fragment();
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState)
    {
        view = inflater.inflate(R.layout.pharmacy,container,false);
        imageview = (ImageView)view.findViewById(R.id.imageview);

        imageview.setImageResource(R.drawable.pharmach_map);

        return view;
    }
}