package com.example.pillsogood;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AlertDialog;
import androidx.fragment.app.Fragment;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class home_selected_investigation_fragment extends Fragment {
    private View view;
    private static int lutein = 0;
    private static int magnesium = 0;
    private static int vitaminA = 0;
    private static int vitaminB = 0;
    private static int vitaminC = 0;
    private static int vitaminD = 0;
    private static int omega3 = 0;
    private static int lactobacillus = 0;
    private static boolean isChecked10 = false;
    private static boolean isChecked11 = false;
    private static boolean isChecked12 = false;
    private static boolean isChecked13 = false;
    private static boolean isChecked14 = false;
    private static boolean isChecked15 = false;
    private static boolean isChecked16 = false;
    private static boolean isChecked17 = false;

//    private static List list = new ArrayList();
    private static ArrayList<Integer> list = new ArrayList<Integer>();

    private static String firstResult = new String();
    private static String secondResult = new String();

    private TextView text_problem17;
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

    public static home_selected_investigation_fragment newInstance() {
        return new home_selected_investigation_fragment();
    }

    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState){
        view = inflater.inflate(R.layout.home_selected_investigation,container,false);

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

        text_problem17 = (TextView)view.findViewById(R.id.text_problem17);

        //다른 클래스 정의
        home_question_investigation_fragment surveyListClass = new home_question_investigation_fragment();

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
        LinearLayout only_female_layout = (LinearLayout) view.findViewById(R.id.only_female_problem);

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

        if(profile_activity.getGender().equals("남자")) {
            only_female_layout.setVisibility(View.GONE);
        }
        else{
            text_problem17.setText("여성분을 위한 질문입니다." + profile_activity.getName() + "님에게 해당하는 것을 모두 선택하세요.");
        }

//        selectCheckSurvey();
        resultButton.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                initialize();
                selectCheckSurvey();
                resultSurvey();
                System.out.println("hihi111");
                System.out.println(getFirstResult());
                System.out.println(getSecondResult());
                System.out.println("hihi222222");
                MainActivity activity = (MainActivity)getActivity();
                if(isAllCheck()){
                    activity.replaceFragment(home_result_investigation_fragment.newInstance());
                }
                else{
                    AlertDialog.Builder alert = new AlertDialog.Builder(activity);
                    alert.setPositiveButton("확인", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            dialog.dismiss();     //닫기
                        }
                    });
                    alert.setMessage("체크 하지 않은 항목이 있습니다.");
                    alert.show();
                }
            }
        });
        return view;
    }

    void selectCheckSurvey(){
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

    public boolean isAllCheck(){
        if(chk10_1.isChecked() || chk10_2.isChecked() || chk10_3.isChecked()){
            isChecked10 = true;
        }
        if(chk11_1.isChecked() || chk11_2.isChecked() || chk11_3.isChecked() || chk11_4.isChecked() || chk11_5.isChecked()){
            isChecked11 = true;
        }
        if(chk12_1.isChecked() || chk12_2.isChecked() || chk12_3.isChecked()){
            isChecked12 = true;
        }
        if(chk13_1.isChecked() || chk13_2.isChecked() || chk13_3.isChecked() || chk13_4.isChecked() || chk13_5.isChecked() || chk13_6.isChecked()){
            isChecked13 = true;
        }
        if(chk14_1.isChecked() || chk14_2.isChecked() || chk14_3.isChecked() || chk14_4.isChecked() || chk14_5.isChecked()){
            isChecked14 = true;
        }
        if(chk15_1.isChecked() || chk15_2.isChecked() || chk15_3.isChecked() || chk15_4.isChecked() || chk15_5.isChecked()){
            isChecked15 = true;
        }
        if(chk16_1.isChecked() || chk16_2.isChecked() || chk16_3.isChecked()){
            isChecked16 = true;
        }

        if(profile_activity.getGender().equals("남자")) {
            isChecked17 = true;
        }
        else{
            if (chk17_1.isChecked() || chk17_2.isChecked() || chk17_3.isChecked() || chk17_4.isChecked()) {
                isChecked17 = true;
            }
        }
        if(isChecked10 && isChecked11 && isChecked12 && isChecked13 && isChecked14 && isChecked15 && isChecked16 && isChecked17){
            return true;
        }
        else
            return false;
    }

    public static int getLactobacillus() {
        return lactobacillus;
    }
    public static int getMagnesium() {
        return magnesium;
    }
    public static int getLutein() {
        return lutein;
    }
    public static int getOmega3() {
        return omega3;
    }
    public static int getVitaminA() {
        return vitaminA;
    }
    public static int getVitaminB() {
        return vitaminB;
    }
    public static int getVitaminC() {
        return vitaminC;
    }
    public static int getVitaminD() {
        return vitaminD;
    }
    public static void setLactobacillus(int lactobacillus) {
        home_selected_investigation_fragment.lactobacillus = lactobacillus;
    }
    public static void setMagnesium(int magnesium) {
        home_selected_investigation_fragment.magnesium = magnesium;
    }
    public static void setLutein(int lutein) {
        home_selected_investigation_fragment.lutein = lutein;
    }
    public static void setOmega3(int omega3) {
        home_selected_investigation_fragment.omega3 = omega3;
    }
    public static void setVitaminA(int vitaminA) {
        home_selected_investigation_fragment.vitaminA = vitaminA;
    }
    public static void setVitaminB(int vitaminB) {
        home_selected_investigation_fragment.vitaminB = vitaminB;
    }
    public static void setVitaminC(int vitaminC) {
        home_selected_investigation_fragment.vitaminC = vitaminC;
    }
    public static void setVitaminD(int vitaminD) {
        home_selected_investigation_fragment.vitaminD = vitaminD;
    }

    public static String getFirstResult(){
        return firstResult;
    }
    public static String getSecondResult(){
        return secondResult;
    }

    public static void setFirstResult(String firstResult){
        home_selected_investigation_fragment.firstResult = firstResult;
    }
    public static void setSecondResult(String secondResult){
        home_selected_investigation_fragment.secondResult = secondResult;
    }

    public void resultSurvey(){
        //1등, 2등 변수
        int first, second;

        //초기화된 리스트에 추가
        list.add(lactobacillus);
        list.add(magnesium);
        list.add(lutein);
        list.add(omega3);
        list.add(vitaminA);
        list.add(vitaminB);
        list.add(vitaminC);
        list.add(vitaminD);

        //1등 추출 후, 리스트에서 제거
        first = Collections.max(list);

        if(first == lutein)
            setFirstResult("lutein");
        else if(first == magnesium)
            setFirstResult("magnesium");
        else if(first == omega3)
            setFirstResult("omega3");
        else if(first == lactobacillus)
            setFirstResult("lactobacillus");
        else if(first == vitaminA)
            setFirstResult("vitaminA");
        else if(first == vitaminB)
            setFirstResult("vitaminB");
        else if(first == vitaminC)
            setFirstResult("vitaminC");
        else if(first == vitaminD)
            setFirstResult("vitaminD");

        list.remove(list.indexOf(first));

        //2번째로 큰 수 추출
        second = Collections.max(list);

        if(second == lutein && !firstResult.equals("lutein"))
            setSecondResult("lutein");
        else if(second == magnesium  && !firstResult.equals("magnesium"))
            setSecondResult("magnesium");
        else if(second == omega3  && !firstResult.equals("omega3"))
            setSecondResult("omega3");
        else if(second == lactobacillus && !firstResult.equals("lactobacillus"))
            setSecondResult("lactobacillus");
        else if(second == vitaminA  && !firstResult.equals("vitaminA"))
            setSecondResult("vitaminA");
        else if(second == vitaminB  && !firstResult.equals("vitaminB"))
            setSecondResult("vitaminB");
        else if(second == vitaminC  && !firstResult.equals("vitaminC"))
            setSecondResult("vitaminC");
        else if(second == vitaminD  && !firstResult.equals("vitaminD"))
            setSecondResult("vitaminD");

    }

    public void initialize(){
        lutein = 0;
        magnesium = 0;
        vitaminA = 0;
        vitaminB = 0;
        vitaminC = 0;
        vitaminD = 0;
        omega3 = 0;
        lactobacillus = 0;

        isChecked10 = false;
        isChecked11 = false;
        isChecked12 = false;
        isChecked13 = false;
        isChecked14 = false;
        isChecked15 = false;
        isChecked16 = false;
        isChecked17 = false;

        firstResult = "";
        secondResult = "";

        list.clear();
    }
}