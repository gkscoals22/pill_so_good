package com.example.pillsogood;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class home_selected_investigation extends Fragment {
    private View view;
    private int lutein = 0;
    private int magnesium = 0;
    private int vitaminA = 0;
    private int vitaminB = 0;
    private int vitaminC = 0;
    private int vitaminD = 0;
    private int omega3 = 0;
    private int lactobacillus = 0;
    private Button resultButton;

    private CheckBox chk10_1;
    private CheckBox chk10_2;
    private CheckBox chk10_3;

    private CheckBox chk11_1;
    private CheckBox chk11_2;
    private CheckBox chk11_3;
    private CheckBox chk11_4;
    private CheckBox chk11_5;

    private CheckBox chk12_1;
    private CheckBox chk12_2;
    private CheckBox chk12_3;

    private CheckBox chk13_1;
    private CheckBox chk13_2;
    private CheckBox chk13_3;
    private CheckBox chk13_4;
    private CheckBox chk13_5;
    private CheckBox chk13_6;

    private CheckBox chk14_1;
    private CheckBox chk14_2;
    private CheckBox chk14_3;
    private CheckBox chk14_4;
    private CheckBox chk14_5;

    private CheckBox chk15_1;
    private CheckBox chk15_2;
    private CheckBox chk15_3;
    private CheckBox chk15_4;
    private CheckBox chk15_5;

    private CheckBox chk16_1;
    private CheckBox chk16_2;
    private CheckBox chk16_3;

    private CheckBox chk17_1;
    private CheckBox chk17_2;
    private CheckBox chk17_3;
    private CheckBox chk17_4;

    public static home_selected_investigation newInstance() {
        return new home_selected_investigation();
    }

    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState){
        view = inflater.inflate(R.layout.home_selected_investigation,container,false);

        //다른 클래스 정의
        home_question_investigation surveyListClass = new home_question_investigation();

        //Linearlayout id 가져오기
        LinearLayout layout1 = (LinearLayout)view.findViewById(R.id.layout_eye);
        LinearLayout layout2 = (LinearLayout)view.findViewById(R.id.layout_brain);
        LinearLayout layout3 = (LinearLayout)view.findViewById(R.id.layout_tired);
        LinearLayout layout4 = (LinearLayout)view.findViewById(R.id.layout_bone);
        LinearLayout layout5 = (LinearLayout)view.findViewById(R.id.layout_immune);
        LinearLayout layout6 = (LinearLayout)view.findViewById(R.id.layout_hair);
        LinearLayout layout7 = (LinearLayout)view.findViewById(R.id.layout_rotation);
        LinearLayout layout8 = (LinearLayout)view.findViewById(R.id.layout_digestion);
        LinearLayout layout9 = (LinearLayout)view.findViewById(R.id.layout_skin);

        //button id 가져오기
        resultButton = view.findViewById(R.id.result_btn);

        //이미지 선택되지 않았을 때 내용 보이지 않게 처리
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

//        selectCheckSurvey();
        resultButton.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                selectCheckSurvey();
                System.out.println("lutein:"+lutein);
                System.out.println("vitaminA:"+vitaminA);
                System.out.println("vitaminB:"+vitaminB);
                System.out.println("vitaminC:"+vitaminC);
                System.out.println("vitaminD:"+vitaminD);
                System.out.println("omega:"+omega3);
            }
        });
        return view;
    }

    void selectCheckSurvey(){
        chk10_1 = (CheckBox)view.findViewById(R.id.check10_1);
        chk10_2 = (CheckBox)view.findViewById(R.id.check10_2);
        chk10_3 = (CheckBox)view.findViewById(R.id.check10_3);

        chk11_1 = (CheckBox)view.findViewById(R.id.check11_1);
        chk11_2 = (CheckBox)view.findViewById(R.id.check11_2);
        chk11_3 = (CheckBox)view.findViewById(R.id.check11_3);
        chk11_4 = (CheckBox)view.findViewById(R.id.check11_4);
        chk11_5 = (CheckBox)view.findViewById(R.id.check11_5);

        chk12_1 = (CheckBox)view.findViewById(R.id.check12_1);
        chk12_2 = (CheckBox)view.findViewById(R.id.check12_2);
        chk12_3 = (CheckBox)view.findViewById(R.id.check12_3);

        chk13_1 = (CheckBox)view.findViewById(R.id.check13_1);
        chk13_2 = (CheckBox)view.findViewById(R.id.check13_2);
        chk13_3 = (CheckBox)view.findViewById(R.id.check13_3);
        chk13_4 = (CheckBox)view.findViewById(R.id.check13_4);
        chk13_5 = (CheckBox)view.findViewById(R.id.check13_5);
        chk13_6 = (CheckBox)view.findViewById(R.id.check13_6);

        chk14_1 = (CheckBox)view.findViewById(R.id.check14_1);
        chk14_2 = (CheckBox)view.findViewById(R.id.check14_2);
        chk14_3 = (CheckBox)view.findViewById(R.id.check14_3);
        chk14_4 = (CheckBox)view.findViewById(R.id.check14_4);
        chk14_5 = (CheckBox)view.findViewById(R.id.check14_5);

        chk15_1 = (CheckBox)view.findViewById(R.id.check15_1);
        chk15_2 = (CheckBox)view.findViewById(R.id.check15_2);
        chk15_3 = (CheckBox)view.findViewById(R.id.check15_3);
        chk15_4 = (CheckBox)view.findViewById(R.id.check15_4);
        chk15_5 = (CheckBox)view.findViewById(R.id.check15_5);

        chk16_1 = (CheckBox)view.findViewById(R.id.check16_1);
        chk16_2 = (CheckBox)view.findViewById(R.id.check16_2);
        chk16_3 = (CheckBox)view.findViewById(R.id.check16_3);

        chk17_1 = (CheckBox)view.findViewById(R.id.check17_1);
        chk17_2 = (CheckBox)view.findViewById(R.id.check17_2);
        chk17_3 = (CheckBox)view.findViewById(R.id.check17_3);
        chk17_4 = (CheckBox)view.findViewById(R.id.check17_4);

        //10번 질문
        if(chk10_3.isChecked()){
            vitaminB++;
            vitaminC++;
        }

        //11번 질문
        if(chk11_2.isChecked()){
            vitaminB++;
            magnesium++;
        }
        if(chk11_3.isChecked()){
            magnesium++;
        }
        if(chk11_4.isChecked()){
            vitaminD++;
            omega3++;
        }

        //12번 질문
        if(chk12_3.isChecked()){
            vitaminC++;
            vitaminD++;
        }

        //13번 질문
        if(chk13_4.isChecked()){
            lactobacillus++;
        }
        if(chk13_5.isChecked()){
            lactobacillus++;
            vitaminC++;
        }

        //14번 질문
        if(chk14_1.isChecked()){
            vitaminC++;
            lactobacillus++;
        }
        if(chk14_2.isChecked()){

        }
        if(chk14_3.isChecked()){
            vitaminC++;
        }
        if(chk14_4.isChecked()){
            lactobacillus++;
        }

        //15번 질문
        if(chk15_1.isChecked()){
            vitaminD++;
        }
        if(chk15_2.isChecked()){
            vitaminB++;
            vitaminD++;
        }
        if(chk15_3.isChecked()){
            vitaminD++;
        }
        if(chk15_4.isChecked()){
            vitaminB++;
        }

        //16번 질문
        if(chk16_1.isChecked()){
            vitaminC++;
        }
        if(chk16_2.isChecked()){
            vitaminC++;
        }

        //17번 질문
        if(chk17_1.isChecked()){
            omega3++;
        }
        if(chk17_2.isChecked()){
            vitaminC++;
        }
        if(chk17_3.isChecked()){
            omega3++;
        }
    }
}
