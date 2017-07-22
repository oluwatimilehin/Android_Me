package com.example.android.android_me.ui;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;

import com.example.android.android_me.R;
import com.example.android.android_me.data.AndroidImageAssets;

/**
 * Created by Oluwatimilehin on 22/07/2017.
 * oluwatimilehinadeniran@gmail.com.
 */

public class MasterListFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.fragment_master_list, container);
        GridView masterGrid = (GridView) rootView.findViewById(R.id.master_grid_view);

        masterGrid.setAdapter(new MasterListAdapter(getActivity().getApplicationContext(),
                AndroidImageAssets.getAll()));

        return rootView;
    }
}
