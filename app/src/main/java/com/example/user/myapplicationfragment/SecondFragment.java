package com.example.user.myapplicationfragment;

import android.app.Fragment;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


public class SecondFragment extends Fragment {

    public SecondFragment() {
        // Required empty public constructor
    }

    public static SecondFragment newInstance() {
        SecondFragment fragment = new SecondFragment();
       // Bundle args = new Bundle();
        Bundle bundle=new Bundle();
        bundle.putString("message", "From Activity");
        fragment.setArguments(bundle);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_second, container, false);
        TextView tvSecond = (TextView)view.findViewById(R.id.tvSecond);
        String args = getArguments().getString("message");
        tvSecond.setText(args);

        return view;
    }

    // TODO: Rename method, update argument and hook method into UI event

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);

    }

    @Override
    public void onDetach() {
        super.onDetach();
    }


}
