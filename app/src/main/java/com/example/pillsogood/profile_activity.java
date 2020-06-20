package com.example.pillsogood;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class profile_activity extends Activity {

    TextView btn1;
    private EditText nameEdit;
    private EditText ageEdit;
    private EditText tallEdit;
    private EditText weightEdit;
    private RadioGroup radiogroup;
    private RadioButton maleRadio;
    private RadioButton femaleRadio;

    private static String name = new String();
    private static String age = new String();
    private static String tall = new String();
    private static String weight = new String();
    private static String gender = new String();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.profile_layout);

        nameEdit = (EditText) findViewById(R.id.edit_name);
        ageEdit = (EditText) findViewById(R.id.edit_age);
        tallEdit = (EditText) findViewById(R.id.edit_tall);
        weightEdit = (EditText) findViewById(R.id.edit_weight);
        radiogroup = (RadioGroup) findViewById(R.id.radioGroup);
        maleRadio = (RadioButton) findViewById(R.id.radio_male);
        femaleRadio = (RadioButton) findViewById(R.id.radio_female);

        checkProfile();

        btn1 = (TextView) findViewById(R.id.btn1);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                setProfile();
                finish();
            }
        });
    }

    private void checkProfile(){
        if(!name.equals("") && !age.equals("") && !tall.equals("") && !weight.equals("")) {
            nameEdit.setText(name);
            ageEdit.setText(age);
            tallEdit.setText(tall);
            weightEdit.setText(weight);
        }

       if(gender.equals("남자") == true)
            maleRadio.setChecked(true);
       if(gender.equals("여자") == true)
            femaleRadio.setChecked(true);
    }

    private void setProfile(){
        name = nameEdit.getText().toString();
        nameEdit.setText(name);

        age = ageEdit.getText().toString();
        ageEdit.setText(age);

        tall = tallEdit.getText().toString();
        tallEdit.setText(tall);

        weight = weightEdit.getText().toString();
        weightEdit.setText(weight);

        if(maleRadio.isChecked() == true){
            gender = "남자";
        }
        else if(femaleRadio.isChecked() == false){
            gender = "여자";
        }
    }
    public static String getName(){
        return name;
    }
    public static String getGender(){
        return gender;
    }
}