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
public class Adapter extends PagerAdapter {
    private Context context;
    private LayoutInflater layoutInflater;
    private List<Model> models;

    public Adapter(List<Model> list, Context context) {
        this.models = list;
        this.context = context;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public int getCount() {
        return this.models.size();
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public boolean isViewFromObject(View view, Object obj) {
        return view.equals(obj);
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public Object instantiateItem(ViewGroup viewGroup, int i) {
        this.layoutInflater = LayoutInflater.from(this.context);
        View inflate = this.layoutInflater.inflate(R.layout.item, viewGroup, false);
        ((ImageView) inflate.findViewById(R.id.imageview1)).setImageResource(this.models.get(i).getImage());
        ((TextView) inflate.findViewById(R.id.tittle1)).setText(this.models.get(i).getTittle());
        ((TextView) inflate.findViewById(R.id.desc1)).setText(this.models.get(i).getDesc());
        viewGroup.addView(inflate, 0);
        return inflate;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public void destroyItem(ViewGroup viewGroup, int i, Object obj) {
        viewGroup.removeView((View) obj);
    }
}
