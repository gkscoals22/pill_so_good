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
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

public class home_fragment extends Fragment // Fragment 클래스를 상속받아야한다
{

    private View view;
    private FragmentManager fm;
    private FragmentTransaction ft;
    private home_question_investigation_fragment frag1_1;

    public static home_fragment newInstance() {
        return new home_fragment();
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState)
    {
        view = inflater.inflate(R.layout.home_fragment,container,false);

        ImageView logoView = (ImageView)view.findViewById(R.id.image_logo);
        ImageView imageView = (ImageView)view.findViewById(R.id.imageview);
        ImageView imageView2 = (ImageView)view.findViewById(R.id.imageview2);
        ImageView imageView3 = (ImageView)view.findViewById(R.id.imageview3);

//         drawable에 있는 이미지를 지정합니다.
        logoView.setImageResource(R.drawable.logo);
        imageView.setImageResource(R.drawable.community_1);
        imageView2.setImageResource(R.drawable.community_2);

        imageView3.getLayoutParams().height=100;
        imageView3.getLayoutParams().width=100;
        imageView3.setImageResource(R.drawable.profile_image);

        imageView.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){

                MainActivity activity = (MainActivity)getActivity();
                activity.replaceFragment(home_question_investigation_fragment.newInstance());
            }
        });

        imageView2.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){

                MainActivity activity = (MainActivity)getActivity();
                activity.replaceFragment(home_recommend_pill_fragment.newInstance());
            }
        });



        return view;
    }
}