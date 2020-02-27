package com.example.myapplication.Assymetric;

import android.view.ViewGroup;

import androidx.recyclerview.widget.RecyclerView;



public abstract class AGVRecyclerViewAdapter<VH extends RecyclerView.ViewHolder>
        extends RecyclerView.Adapter<VH> {
    public abstract AsymmetricItem getItem(int position);
}