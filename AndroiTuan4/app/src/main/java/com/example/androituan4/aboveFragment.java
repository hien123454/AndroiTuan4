package com.example.androituan4;

import android.content.Context;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.QuickContactBadge;
import android.widget.TextView;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link aboveFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class aboveFragment extends Fragment {
    private int so;
    SenddingData senddingData;

    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
            senddingData = (SenddingData) context;
    }

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public aboveFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment aboveFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static aboveFragment newInstance(String param1, String param2) {
        aboveFragment fragment = new aboveFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_above, container, false);
        ImageButton imgAdd =view.findViewById(R.id.imgAdd);
        ImageButton imgTru =view.findViewById(R.id.imageButton);
        TextView tvSo = view.findViewById(R.id.tvSo);
        imgAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                so++;
                tvSo.setText(String.valueOf(so));
                senddingData.sendData(String.valueOf(so));
            }
        });
        imgTru.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                so--;
                tvSo.setText(String.valueOf(so));
                senddingData.sendData(String.valueOf(so));
            }
        });
        return view;
    }
}