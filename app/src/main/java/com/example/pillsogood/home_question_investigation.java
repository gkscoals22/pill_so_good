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

public class home_question_investigation extends Fragment {
    private View view;
    private ImageView[] imageView = new ImageView[9];
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

        for(int i = 0 ; i < imageView.length ; i++) {
            imageView[i].setOnClickListener(new View.OnClickListener(){
                public void onClick(View v){
                    MainActivity activity = (MainActivity)getActivity();
                    activity.replaceFragment(home_selected_investigation.newInstance());
                }
            });
        }

        return view;
    }
}
