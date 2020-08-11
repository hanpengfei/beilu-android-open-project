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
 * date:2019/2/18
 * descriptin:
 */
public class AllCoachAdviserAdapter extends RecyclerView.Adapter <AllCoachAdviserAdapter.AllCoachAdviserViewHolder>{
    @NonNull
    @Override
    public AllCoachAdviserViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.item_coach_alladviser,parent,false);
        return new AllCoachAdviserViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull AllCoachAdviserViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 5;
    }

    public class AllCoachAdviserViewHolder extends BaseViewHolder {

        public AllCoachAdviserViewHolder(View itemView) {
            super(itemView);
        }
    }
}
