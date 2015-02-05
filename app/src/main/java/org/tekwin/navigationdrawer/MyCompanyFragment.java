package org.tekwin.navigationdrawer;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by adamdebbagh on 2/5/15.
 */
public class MyCompanyFragment extends Fragment {

    public static MyCompanyFragment newInstance(){

        MyCompanyFragment fragment = new MyCompanyFragment();
        return fragment;
    }
    //constructor
    public MyCompanyFragment(){}

    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
       View rootView = inflater.inflate(R.layout.fragment_my_company,container,false);
        return rootView;
    }

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        ((MainActivity) activity).onSectionAttached(3);
    }
}
