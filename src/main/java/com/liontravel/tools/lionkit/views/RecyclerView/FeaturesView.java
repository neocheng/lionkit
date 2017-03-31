package com.liontravel.tools.lionkit.views.RecyclerView;

import android.content.Context;
import android.support.annotation.Nullable;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;

/**
 * Created by neocheng on 2017/3/13.
 */

public class FeaturesView extends RecyclerView {

//    private ArrayList<Features> appFeaturess;

    public FeaturesView(Context context) {
        super(context);
        setCustomLayoutManager(context);
    }

    public FeaturesView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        setCustomLayoutManager(context);
    }

    public FeaturesView(Context context, @Nullable AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        setCustomLayoutManager(context);
    }

//    public ArrayList<Features> getAppFeaturess() {
//        return appFeaturess;
//    }

//    public void setAppFeaturess(Context context, ArrayList<Features> appFeaturess) {
//        this.appFeaturess = appFeaturess;
//        setCustomAdapter(context, appFeaturess);
//    }

    private void setCustomLayoutManager(Context context) {
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(context);
        super.setLayoutManager(linearLayoutManager);
    }

//    private void setCustomAdapter(Context context, ArrayList<Features> featuress) {
//        FeaturesAdapter featuresAdapter = new FeaturesAdapter(context, featuress);
//        super.setAdapter(featuresAdapter);
//    }

}
