package com.liontravel.tools.lionkit.views.RecyclerView;

import android.content.Context;
import android.support.annotation.Nullable;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;

/**
 * Created by neocheng on 2017/3/13.
 */

public class LionBotView extends RecyclerView {

//    private ArrayList<Lionbot> appLionbots;
//    private LionbotAdapter lionAdapter;

    public LionBotView(Context context) {
        super(context);
        setCustomLayoutManager(context);
    }

    public LionBotView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        setCustomLayoutManager(context);
    }

    public LionBotView(Context context, @Nullable AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        setCustomLayoutManager(context);
    }

//    public void setAppLionbots(Context context, ArrayList<Lionbot> appLionbots) {
//        this.appLionbots = appLionbots;
//        setCustomAdapter(context, appLionbots);
//    }

//    public ArrayList<Lionbot> getAppLionbots() {
//        return appLionbots;
//    }

    private void setCustomLayoutManager(Context context) {
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(context);
        linearLayoutManager.setOrientation(LinearLayoutManager.HORIZONTAL);
        super.setLayoutManager(linearLayoutManager);
    }

//    private void setCustomAdapter(Context context, ArrayList<Lionbot> lionbots) {
//        lionAdapter = new LionbotAdapter(context, lionbots);
//        super.setAdapter(lionAdapter);
//    }

//    public LionbotAdapter getLionbotAdapter() {
//        return lionAdapter;
//    }

//    protected void initViews(Context context) {
//        inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
//        View view = inflater.inflate(R.layout.view_horizontal_scroll, context.);
//        mRecyclerView = (RecyclerView) view.findViewById(R.id.recycler_view_line_scrollview);
//        mTxtTitle = (TextView) view.findViewById(R.id.txt_recyclerview_title);
//        mTxtTitle.setText("機器人");
//    }

}
