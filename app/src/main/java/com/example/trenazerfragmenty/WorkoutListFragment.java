package com.example.trenazerfragmenty;

import android.content.Context;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.ListFragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;


public class WorkoutListFragment extends ListFragment {

    static interface Listener{
        void itemClicked(long id);
    }
    private Listener listener;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        ArrayAdapter<Workout> adapter = new ArrayAdapter<>(
                inflater.getContext(),
                android.R.layout.simple_list_item_1,
                Workout.workouts
        );
        setListAdapter(adapter);
        return super.onCreateView(inflater,container,savedInstanceState);
    }

    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
      this.listener = (Listener) context;
    }

    @Override
    public void onListItemClick(@NonNull ListView l, @NonNull View v, int position, long id) {
        super.onListItemClick(l, v, position, id);
        if(listener != null){
            listener.itemClicked(id);
        }
    }
}