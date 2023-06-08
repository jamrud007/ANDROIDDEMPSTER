package com.jamrud.dempstershafer;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.viewpager.widget.PagerAdapter;

import java.util.List;

/* loaded from: classes.dex */
public class IntroViewPagerAdapter extends PagerAdapter {
    Context mContext;
    List<ScreenItem> mListScreen;

    @Override // androidx.viewpager.widget.PagerAdapter
    public boolean isViewFromObject(View view, Object obj) {
        return view == obj;
    }

    public IntroViewPagerAdapter(Context context, List<ScreenItem> list) {
        this.mContext = context;
        this.mListScreen = list;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public Object instantiateItem(ViewGroup viewGroup, int i) {
        View inflate = ((LayoutInflater) this.mContext.getSystemService("layout_inflater")).inflate(R.layout.layout_screen, (ViewGroup) null);
        ((TextView) inflate.findViewById(R.id.Intro_tittle)).setText(this.mListScreen.get(i).getTittle());
        ((TextView) inflate.findViewById(R.id.intro_description)).setText(this.mListScreen.get(i).getDesccription());
        ((ImageView) inflate.findViewById(R.id.intro_img)).setImageResource(this.mListScreen.get(i).getScreenImg());
        viewGroup.addView(inflate);
        return inflate;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public int getCount() {
        return this.mListScreen.size();
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public void destroyItem(ViewGroup viewGroup, int i, Object obj) {
        viewGroup.removeView((View) obj);
    }
}
