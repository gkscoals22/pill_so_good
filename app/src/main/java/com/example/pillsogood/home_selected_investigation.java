package com.example.pillsogood;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class home_selected_investigation extends Fragment {
    private View view;

    public static home_selected_investigation newInstance() {
        return new home_selected_investigation();
    }

    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState){
        view = inflater.inflate(R.layout.home_selected_investigation,container,false);

        home_question_investigation surveyListClass = new home_question_investigation();
        LinearLayout layout1 = (LinearLayout)view.findViewById(R.id.layout_eye);
        LinearLayout layout2 = (LinearLayout)view.findViewById(R.id.layout_brain);
        LinearLayout layout3 = (LinearLayout)view.findViewById(R.id.layout_tired);
        LinearLayout layout4 = (LinearLayout)view.findViewById(R.id.layout_bone);
        LinearLayout layout5 = (LinearLayout)view.findViewById(R.id.layout_immune);
        LinearLayout layout6 = (LinearLayout)view.findViewById(R.id.layout_hair);
        LinearLayout layout7 = (LinearLayout)view.findViewById(R.id.layout_rotation);
        LinearLayout layout8 = (LinearLayout)view.findViewById(R.id.layout_digestion);
        LinearLayout layout9 = (LinearLayout)view.findViewById(R.id.layout_skin);

        System.out.print(surveyListClass.getSelectImage1());
        System.out.print(surveyListClass.getSelectImage2());
        System.out.print(surveyListClass.getSelectImage3());
        System.out.print(surveyListClass.getSelectImage4());
        System.out.println(surveyListClass.getSelectImage5());
        if(!surveyListClass.getSelectImage1())
            layout1.setVisibility(View.GONE);
        if(!surveyListClass.getSelectImage2())
            layout2.setVisibility(View.GONE);
        if(!surveyListClass.getSelectImage3())
            layout3.setVisibility(View.GONE);
        if(!surveyListClass.getSelectImage4())
            layout4.setVisibility(View.GONE);
        if(!surveyListClass.getSelectImage5())
            layout5.setVisibility(View.GONE);
        if(!surveyListClass.getSelectImage6())
            layout6.setVisibility(View.GONE);
        if(!surveyListClass.getSelectImage7())
            layout7.setVisibility(View.GONE);
        if(!surveyListClass.getSelectImage8())
            layout8.setVisibility(View.GONE);
        if(!surveyListClass.getSelectImage9())
            layout9.setVisibility(View.GONE);

        return view;
    }
}
