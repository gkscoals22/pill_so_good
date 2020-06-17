package com.example.pillsogood;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

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

    public static home_result_investigation_fragment newInstance() {
        return new home_result_investigation_fragment();
    }
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.home_result_investigation, container, false);

        return view;
    }
}
