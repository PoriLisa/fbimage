package com.example.myapplication;

import com.example.myapplication.model.ItemImage;

import java.util.List;

class ChildAdapterImpl extends ChildAdapter {
    public ChildAdapterImpl(List<ItemImage> items, int mDisplay, int mTotal) {
        super(items, mDisplay, mTotal);
    }
}
