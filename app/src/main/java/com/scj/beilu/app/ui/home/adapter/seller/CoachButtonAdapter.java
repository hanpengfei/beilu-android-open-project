package com.scj.beilu.app.ui.home.adapter.seller;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


import com.scj.beilu.app.R;
import com.scj.beilu.app.base.BaseViewHolder;

/**
 * author:SunGuiLan
 * date:2019/2/15
 * descriptin:
 */
public class CoachButtonAdapter extends RecyclerView.Adapter<CoachButtonAdapter.CoachButtonViewHolder> {
    @NonNull
    @Override
    public CoachButtonViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_coach_button, parent, false);
        return new CoachButtonViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CoachButtonViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 6;
    }

    public class CoachButtonViewHolder extends BaseViewHolder {

        public CoachButtonViewHolder(View itemView) {
            super(itemView);
        }
    }
}
