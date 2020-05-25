package com.example.pillsogood;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {

    private BottomNavigationView bottomNavigationView; // 네비게이션 뷰
    private FragmentManager fm;
    private FragmentTransaction ft;
    private home_fragment frag1;
    private home_question_investigation frag1_1;
    private community_fragment frag2;
    private pharmacy_fragment frag3;
    private pillcheck_fragment frag4;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //해당 영엉 클릭 시 프레그먼트 이동 함수
        bottomNavigationView = findViewById(R.id.bottomNavi);
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener()
        {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem)
            {
                switch (menuItem.getItemId())
                {
                    case R.id.str_home:
                        setFrag(0);
                        break;
                    case R.id.str_community:
                        setFrag(1);
                        break;
                    case R.id.str_drug_store:
                        setFrag(2);
                        break;
                    case R.id.str_medicine_check:
                        setFrag(3);
                        break;
                }
                return true;
            }
        });

        frag1=new home_fragment();
        frag1_1= new home_question_investigation();
        frag2=new community_fragment();
        frag3=new pharmacy_fragment();
        frag4=new pillcheck_fragment();
        setFrag(0); // 첫 프래그먼트 화면 지정
    }
    public void replaceFragment(Fragment fragment){
        fm = getSupportFragmentManager();
        ft = fm.beginTransaction();

        ft.replace(R.id.Main_Frame, fragment).commit();
    }
    // 프레그먼트 교체 함수 구현
    private void setFrag(int n)
    {
        fm = getSupportFragmentManager();
        ft= fm.beginTransaction();
        switch (n)
        {
            case 0:
                ft.replace(R.id.Main_Frame,frag1);
                ft.commit();
                break;

            case 1:
                ft.replace(R.id.Main_Frame,frag2);
                ft.commit();
                break;

            case 2:
                ft.replace(R.id.Main_Frame,frag3);
                ft.commit();
                break;

            case 3:
                ft.replace(R.id.Main_Frame,frag4);
                ft.commit();
                break;
        }
    }
}
