package com.liontravel.tools.lionkit.views.RecyclerView;

import android.content.Context;
import android.support.annotation.Nullable;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;

/**
 * Created by neocheng on 2017/3/13.
 */

public class DiscoveriesView extends RecyclerView {

//    private ArrayList<Discoveries> appDiscoveriess;

    public DiscoveriesView(Context context) {
        super(context);
        setCustomLayoutManager(context);
    }

    public DiscoveriesView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        setCustomLayoutManager(context);
    }

    public DiscoveriesView(Context context, @Nullable AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        setCustomLayoutManager(context);
    }

//    public ArrayList<Discoveries> getAppDiscoveriess() {
//        return appDiscoveriess;
//    }

//    public void setAppDiscoveriess(Context context,ArrayList<Discoveries> appDiscoveriess) {
//        this.appDiscoveriess = appDiscoveriess;
//        setCustomAdapter(context, appDiscoveriess);
//    }

    private void setCustomLayoutManager(Context context){
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(context);
        linearLayoutManager.setOrientation(LinearLayoutManager.HORIZONTAL);
        super.setLayoutManager(linearLayoutManager);
    }

//    private void setCustomAdapter(Context context, ArrayList<Discoveries> discoveriess) {
//        DiscoveriesAdapter discoveriesAdapter = new DiscoveriesAdapter(context, discoveriess);
//        super.setAdapter(discoveriesAdapter);
//    }

}
