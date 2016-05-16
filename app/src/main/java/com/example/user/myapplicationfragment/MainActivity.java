package com.example.user.myapplicationfragment;

import android.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.btnList)
    Button button;
    @BindView(R.id.tvTitle)
    TextView title;

    FragmentManager fragmentManager = getFragmentManager();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
         super.onCreate(savedInstanceState);
         setContentView(R.layout.activity_main);
         ButterKnife.bind(this);
         button.setVisibility(View.VISIBLE);

    }

    @OnClick(R.id.btnList)
    void openFragmentOne(){
        button.setVisibility(View.INVISIBLE);
        title.setVisibility(View.INVISIBLE);
        showList();
    }

    @Override
    public void onResume(){
        super.onResume();
        button.setVisibility(View.VISIBLE);
        title.setVisibility(View.VISIBLE);


    }

    public  void showList()
    {

        fragmentManager.beginTransaction().replace(R.id.rlFragment_box,BlankFragment.newInstance(),"Blank").addToBackStack("Blank").commit();
    }

    @Override
    public void onBackPressed(){
        if (getFragmentManager().getBackStackEntryCount() > 0) {
            getFragmentManager().popBackStack();
            if(getFragmentManager().getBackStackEntryCount()==1)
            {
                getFragmentManager().popBackStack();
                button.setVisibility(View.VISIBLE);
                title.setVisibility(View.VISIBLE);
            }

        } else {

            super.onBackPressed();
        }
    }
}
