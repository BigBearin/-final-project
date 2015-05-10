package com.example.br161.finalproject;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

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
        holder.title.setText(workouts.get(position).getTitle());
        holder.date.setText(workouts.get(position).getDate());
        holder.time.setText(workouts.get(position).getTime());
    }

    @Override
    public int getItemCount() { return workouts.size(); }

    public static class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

        ItemClickListener listener;

        TextView title;
        TextView date;
        TextView time;


        public ViewHolder(View itemView, ItemClickListener listener) {
            super(itemView);
            this.listener = listener;
            title = (TextView) itemView.findViewById(R.id.title);
            date = (TextView) itemView.findViewById(R.id.date);
            time = (TextView) itemView.findViewById(R.id.time);
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

