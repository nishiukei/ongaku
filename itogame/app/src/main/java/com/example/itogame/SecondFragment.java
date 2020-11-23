package com.example.itogame;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;

public abstract class SecondFragment extends Fragment {
    @Override
    public View onCreateView(
            LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState

    ) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_second, container, false);
    }

    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        view.findViewById(R.id.button_2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                NavHostFragment.findNavController(SecondFragment.this)
                        .navigate(R.id.action_SecondFragment_to_ThirdFragment);
            }
        });
        view.findViewById(R.id.button_second);
        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText editName = (EditText) editName.findViewById();
                String message = editName.getText().toString();
                Common common = (Common)this.getApplication();

                if (common.getN() != 6) {
                    if (scan.equals("end")) {
                        (TextView) findViewById(R.id.textview_second).setText("参加人数は５人までです。");
                    } else {
                        int num = n - 1;
                        players[num] = scan;
                        n++;
                        System.out.println(players[num]);
                    }
                }
                for (int i = 0; i < n - 1; i++) {
                    System.out.println(players[i]);
                }
                return n;
            }
        }
    }
}