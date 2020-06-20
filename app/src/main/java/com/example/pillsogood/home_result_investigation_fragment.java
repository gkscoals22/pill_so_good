package com.example.pillsogood;

import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

public class home_result_investigation_fragment extends Fragment {
    private View view;
    private FragmentManager fm;
    private FragmentTransaction ft;
    private home_result_investigation_fragment frag_result;

    private TextView resultTextView;
    private TextView firstTextView;
    private TextView firstTextView2;
    private TextView secondTextView;
    private TextView secondTextView2;
    private TextView linkText;
    private TextView linkText2;

    public static home_result_investigation_fragment newInstance() {
        return new home_result_investigation_fragment();
    }
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.home_result_investigation, container, false);

        resultTextView = (TextView)view.findViewById(R.id.result_textview);
        firstTextView = (TextView)view.findViewById(R.id.first_result);
        firstTextView2 = (TextView)view.findViewById(R.id.first_result2);
        secondTextView = (TextView)view.findViewById(R.id.second_result);
        secondTextView2 = (TextView)view.findViewById(R.id.second_result2);
        linkText = (TextView)view.findViewById(R.id.textlink1);
        linkText2 = (TextView)view.findViewById(R.id.textlink2);
        resultTextView.setText(profile_activity.getName() + "님의 추천 영양성분");

        if(home_selected_investigation_fragment.getFirstResult().equals("lutein")){
            firstTextView.setText(R.string.str_lutein);
            firstTextView2.setText(R.string.str_lutein_explain);
        }
        else if(home_selected_investigation_fragment.getFirstResult().equals("lactobacillus")){
            firstTextView.setText(R.string.str_lactobacillus);
            firstTextView2.setText(R.string.str_lactobacillus_explain);
        }
        else if(home_selected_investigation_fragment.getFirstResult().equals("magnesium")){
            firstTextView.setText(R.string.str_magnesium);
            firstTextView2.setText(R.string.str_magnesium_explain);
        }
        else if(home_selected_investigation_fragment.getFirstResult().equals("omega3")){
            firstTextView.setText(R.string.str_omega3);
            firstTextView2.setText(R.string.str_omega3_explain);
        }
        else if(home_selected_investigation_fragment.getFirstResult().equals("vitaminB")){
            firstTextView.setText(R.string.str_vitaminB);
            firstTextView2.setText(R.string.str_vitaminB_explain);
        }
        else if(home_selected_investigation_fragment.getFirstResult().equals("vitaminC")){
            firstTextView.setText(R.string.str_vitaminC);
            firstTextView2.setText(R.string.str_vitaminC_explain);
        }
        else if(home_selected_investigation_fragment.getFirstResult().equals("vitaminD")){
            firstTextView.setText(R.string.str_vitaminD);
            firstTextView2.setText(R.string.str_vitaminD_explain);
        }

        if(home_selected_investigation_fragment.getSecondResult().equals("lutein")){
            secondTextView.setText(R.string.str_lutein);
            secondTextView2.setText(R.string.str_lutein_explain);
        }
        else if(home_selected_investigation_fragment.getSecondResult().equals("lactobacillus")){
            secondTextView.setText(R.string.str_lactobacillus);
            secondTextView2.setText(R.string.str_lactobacillus_explain);
        }
        else if(home_selected_investigation_fragment.getSecondResult().equals("magnesium")){
            secondTextView.setText(R.string.str_magnesium);
            secondTextView2.setText(R.string.str_magnesium_explain);
        }
        else if(home_selected_investigation_fragment.getSecondResult().equals("omega3")){
            secondTextView.setText(R.string.str_omega3);
            secondTextView2.setText(R.string.str_omega3_explain);
        }
        else if(home_selected_investigation_fragment.getSecondResult().equals("vitaminB")){
            secondTextView.setText(R.string.str_vitaminB);
            secondTextView2.setText(R.string.str_vitaminB_explain);
        }
        else if(home_selected_investigation_fragment.getSecondResult().equals("vitaminC")){
            secondTextView.setText(R.string.str_vitaminC);
            secondTextView2.setText(R.string.str_vitaminC_explain);
        }
        else if(home_selected_investigation_fragment.getSecondResult().equals("vitaminD")){
            secondTextView.setText(R.string.str_vitaminD);
            secondTextView2.setText(R.string.str_vitaminD_explain);
        }

        linkText.setMovementMethod(LinkMovementMethod.getInstance());
        linkText2.setMovementMethod(LinkMovementMethod.getInstance());
        linkText.setText(R.string.str_link_iherb);
        linkText2.setText(R.string.str_link_gnc);

        return view;
    }
}
