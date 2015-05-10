package com.example.br161.finalproject;

import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class RecyclerViewFragment extends Fragment {

    private RecyclerView recyclerWorkouts;
    private TextView add;

    public RecyclerViewFragment() {
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        return inflater.inflate(R.layout.fragment_recycler_view, container, false);
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        recyclerWorkouts = (RecyclerView) view.findViewById((R.id.recycler_workouts));
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getActivity());
        recyclerWorkouts.setLayoutManager(layoutManager);
        List<Workout> workouts = mockWorkouts();
        recyclerWorkouts.setAdapter(new WorkoutAdapter(workouts));

    }



    private List<Workout> mockWorkouts() {
        List<Workout> workouts = new ArrayList<>();
        workouts.add(new Workout("title", "02/20/1992", "12:00"));
        workouts.add(new Workout("title", "02/20/1992", "12:00"));
        workouts.add(new Workout("title", "02/20/1992", "12:00"));
        workouts.add(new Workout("title", "02/20/1992", "12:00"));
        workouts.add(new Workout("title", "02/20/1992", "12:00"));
        workouts.add(new Workout("title", "02/20/1992", "12:00"));
        workouts.add(new Workout("title", "02/20/1992", "12:00"));
        workouts.add(new Workout("title", "02/20/1992", "12:00"));
        workouts.add(new Workout("title", "02/20/1992", "12:00"));
        workouts.add(new Workout("title", "02/20/1992", "12:00"));
        workouts.add(new Workout("title", "02/20/1992", "12:00"));
        workouts.add(new Workout("title", "02/20/1992", "12:00"));
        workouts.add(new Workout("title", "02/20/1992", "12:00"));

        add = (TextView) getActivity().findViewById(R.id.button);

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), addWorkoutActivity.class);
                startActivity(intent);
            }

        });

        return workouts;
    }
}