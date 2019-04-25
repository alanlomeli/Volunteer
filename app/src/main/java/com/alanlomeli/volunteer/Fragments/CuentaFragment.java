package com.alanlomeli.volunteer.Fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.alanlomeli.volunteer.R;

public class CuentaFragment extends Fragment {
    public static CuentaFragment newinstance()
    {
        return new CuentaFragment();
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        //VISTA DE CUENTA
        //View view = inflater.inflate(R.layout.)
        return super.onCreateView(inflater, container, savedInstanceState);
    }
}
