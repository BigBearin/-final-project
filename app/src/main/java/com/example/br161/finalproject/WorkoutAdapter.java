package com.example.br161.finalproject;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.util.List;


public class WorkoutAdapter extends RecyclerView.Adapter<WorkoutAdapter.ViewHolder> {

    List<Workout> workouts;

    public WorkoutAdapter(List<Workout> workouts) { this.workouts = workouts; }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.workout_item, parent, false);

        final ViewHolder viewHolder = new ViewHolder(view, new ViewHolder.ItemClickListener() {
            @Override
            public void onItemClick(View view, int position) {
            }
        });
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
    }

    @Override
    public int getItemCount() { return workouts.size(); }

    public static class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

        ItemClickListener listener;


        public ViewHolder(View itemView, ItemClickListener listener) {
            super(itemView);
        }

        @Override
        public void onClick(View view) {
            listener.onItemClick(view, getPosition());
        }

        public interface ItemClickListener {
            void onItemClick(View view, int position);
        }
    }
}

