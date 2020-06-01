package com.example.pillsogood;

import android.app.Activity;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
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
    public static boolean selectedImage[] = new boolean[9];
    public int selectImageCount = 0;
    private Activity activity;
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
        ImageView next_image = (ImageView)view.findViewById(R.id.next_image);

        imageView11.getLayoutParams().height=100;
        imageView11.getLayoutParams().width=100;

        for(int i = 0 ; i < selectedImage.length ; i++)
            selectedImage[i] = false;

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
        next_image.setImageResource(R.drawable.next);

        //각 이미지에 대한 클릭 이벤트 처리
        imageView[0].setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                //이미지 클릭시 배경색 변경
                if(!selectedImage[0] && checkSelectImageCount()) {
                    imageView[0].setBackgroundResource(R.color.colorAccent);
                    selectedImage[0] = true;
                    selectImageCount++;
                }
                //선택 되어 있는 이미지 투명색으로 다시 변경
                else if(selectedImage[0]) {
                    imageView[0].setBackgroundResource(R.color.transparent);
                    selectedImage[0] = false;
                    selectImageCount--;
                    checkSelectImageCount();
                }
            }
        });

        imageView[1].setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                if(checkSelectImageCount()) {
                    if (!selectedImage[1]) {
                        imageView[1].setBackgroundResource(R.color.colorAccent);
                        selectedImage[1] = true;
                        selectImageCount++;
                    } else if (selectedImage[1]) {
                        imageView[1].setBackgroundResource(R.color.transparent);
                        selectedImage[1] = false;
                        selectImageCount--;
                        checkSelectImageCount();
                    }
                }
            }
        });

        imageView[2].setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                if(!selectedImage[2] && checkSelectImageCount()) {
                    imageView[2].setBackgroundResource(R.color.colorAccent);
                    selectedImage[2] = true;
                    selectImageCount++;
                }
                else if(selectedImage[2]) {
                    imageView[2].setBackgroundResource(R.color.transparent);
                    selectedImage[2] = false;
                    selectImageCount--;
                    checkSelectImageCount();
                }
            }
        });

        imageView[3].setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                if(!selectedImage[3] && checkSelectImageCount()) {
                    imageView[3].setBackgroundResource(R.color.colorAccent);
                    selectedImage[3] = true;
                    selectImageCount++;
                }
                else if(selectedImage[3]) {
                    imageView[3].setBackgroundResource(R.color.transparent);
                    selectedImage[3] = false;
                    selectImageCount--;
                    checkSelectImageCount();
                }
            }
        });

        imageView[4].setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                if(!selectedImage[4] && checkSelectImageCount()) {
                    imageView[4].setBackgroundResource(R.color.colorAccent);
                    selectedImage[4] = true;
                    selectImageCount++;
                }
                else if(selectedImage[4]) {
                    imageView[4].setBackgroundResource(R.color.transparent);
                    selectedImage[4] = false;
                    selectImageCount--;
                    checkSelectImageCount();
                }
            }
        });

        imageView[5].setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                if(!selectedImage[5] && checkSelectImageCount()) {
                    imageView[5].setBackgroundResource(R.color.colorAccent);
                    selectedImage[5] = true;
                    selectImageCount++;
                }
                else if(selectedImage[5]) {
                    imageView[5].setBackgroundResource(R.color.transparent);
                    selectedImage[5] = false;
                    selectImageCount--;
                    checkSelectImageCount();
                }
            }
        });

        imageView[6].setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                if(!selectedImage[6] && checkSelectImageCount()) {
                    imageView[6].setBackgroundResource(R.color.colorAccent);
                    selectedImage[6] = true;
                    selectImageCount++;
                }
                else if(selectedImage[6]) {
                    imageView[6].setBackgroundResource(R.color.transparent);
                    selectedImage[6] = false;
                    selectImageCount--;
                    checkSelectImageCount();
                }
            }
        });

        imageView[7].setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                if(!selectedImage[7] && checkSelectImageCount()) {
                    imageView[7].setBackgroundResource(R.color.colorAccent);
                    selectedImage[7] = true;
                    selectImageCount++;
                }
                else if(selectedImage[7]) {
                    imageView[7].setBackgroundResource(R.color.transparent);
                    selectedImage[7] = false;
                    selectImageCount--;
                    checkSelectImageCount();
                }
            }
        });

        imageView[8].setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                if(!selectedImage[8] && checkSelectImageCount()) {
                    imageView[8].setBackgroundResource(R.color.colorAccent);
                    selectedImage[8] = true;
                    selectImageCount++;
                }
                else if(selectedImage[8]) {
                    imageView[8].setBackgroundResource(R.color.transparent);
                    selectedImage[8] = false;
                    selectImageCount--;
                    checkSelectImageCount();
                }
            }
        });

        //다음 이미지 클릭 이벤트
        next_image.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                MainActivity activity = (MainActivity)getActivity();
                activity.replaceFragment(home_selected_investigation.newInstance());
            }
        });

        return view;
    }

    //선택된 이미지 갯수 체크 함수
    public boolean checkSelectImageCount(){
        TextView textView2 = (TextView)view.findViewById(R.id.textview2);

        //이미지 갯수가 3개 이상일 시 출력 될 텍스트
        if(selectImageCount >= 3){
            textView2.setText("선택은 3개까지 가능합니다.");
            return false;
        }
        else
            textView2.setText("");
        return true;
    }

    public boolean getSelectImage1(){
        return selectedImage[0];
    }
    public boolean getSelectImage2(){
        return selectedImage[1];
    }
    public boolean getSelectImage3(){
        return selectedImage[2];
    }
    public boolean getSelectImage4(){
        return selectedImage[3];
    }
    public boolean getSelectImage5(){
        return selectedImage[4];
    }
    public boolean getSelectImage6(){
        return selectedImage[5];
    }
    public boolean getSelectImage7(){
        return selectedImage[6];
    }
    public boolean getSelectImage8(){
        return selectedImage[7];
    }
    public boolean getSelectImage9(){
        return selectedImage[8];
    }
}
