package com.example.pillsogood;

import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class home_recommend_pill_add1_fragment extends Fragment{
    private View view;
    private ImageView imageView;
    private ImageView profileView;
    private TextView linkText;
    private TextView linkText2;

    public static home_recommend_pill_add1_fragment newInstance() {
        return new home_recommend_pill_add1_fragment();
    }
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.home_recommend_pill_add1, container, false);

        imageView = (ImageView)view.findViewById(R.id.imageview);
        profileView = (ImageView)view.findViewById(R.id.profileview);
        linkText = (TextView)view.findViewById(R.id.textlink1);
        linkText2 = (TextView)view.findViewById(R.id.textlink2);

        imageView.setImageResource(R.drawable.pill_check_2);
        profileView.getLayoutParams().height=100;
        profileView.getLayoutParams().width=100;
        profileView.setImageResource(R.drawable.profile_image);

        linkText.setMovementMethod(LinkMovementMethod.getInstance());
        linkText2.setMovementMethod(LinkMovementMethod.getInstance());
        linkText.setText(R.string.str_link_vitaminD);
        linkText2.setText(R.string.str_link_lactobacillus);

        return view;
    }
}
