package com.example.android.sunshine;

public interface ItemTouchHelperAdapter {

    void onItemMove( int fromPosition, int toPosition);
    void onItemDismiss(int position);
}
