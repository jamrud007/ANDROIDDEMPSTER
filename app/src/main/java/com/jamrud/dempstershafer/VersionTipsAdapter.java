package com.jamrud.dempstershafer;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Filter;
import android.widget.Filterable;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* loaded from: classes.dex */
public class VersionTipsAdapter extends RecyclerView.Adapter<VersionTipsAdapter.VersionVH> implements Filterable {
    List<VersionTips> Pencarian;
    Filter filter = new Filter() { // from class: com.imam.android.VersionTipsAdapter.1
        @Override // android.widget.Filter
        protected FilterResults performFiltering(CharSequence charSequence) {
            ArrayList arrayList = new ArrayList();
            if (charSequence.toString().isEmpty()) {
                arrayList.addAll(VersionTipsAdapter.this.Pencarian);
            } else {
                for (VersionTips versionTips : VersionTipsAdapter.this.Pencarian) {
                    if (versionTips.getCodeName().toLowerCase().contains(charSequence.toString().toLowerCase())) {
                        arrayList.add(versionTips);
                    }
                }
            }
            FilterResults filterResults = new FilterResults();
            filterResults.values = arrayList;
            return filterResults;
        }

        @Override // android.widget.Filter
        protected void publishResults(CharSequence charSequence, FilterResults filterResults) {
            VersionTipsAdapter.this.versionsList.clear();
            VersionTipsAdapter.this.versionsList.addAll((Collection) filterResults.values);
            VersionTipsAdapter.this.notifyDataSetChanged();
        }
    };
    public List<Versions> getUserModelListFilltered;
    List<VersionTips> versionsList;

    @Override // android.widget.Filterable
    public Filter getFilter() {
        return this.filter;
    }

    public VersionTipsAdapter(List<VersionTips> list) {
        this.versionsList = list;
        this.Pencarian = new ArrayList(list);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public VersionVH onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new VersionVH(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.rowtips, viewGroup, false));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(VersionVH versionVH, int i) {
        VersionTips versionTips = this.versionsList.get(i);
        versionVH.codeNameTxt.setText(versionTips.getCodeName());
        versionVH.versionTxt.setText(versionTips.getVersion());
        versionVH.apiLevelTxt.setText(versionTips.getApiLevel());
        versionVH.descriptionTxt.setText(versionTips.getDescrpition());
        versionVH.expendablelayout.setVisibility(this.versionsList.get(i).isExpendable() ? 0 : 8);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.versionsList.size();
    }

    /* loaded from: classes.dex */
    public class VersionVH extends RecyclerView.ViewHolder {
        TextView apiLevelTxt;
        TextView codeNameTxt;
        TextView descriptionTxt;
        RelativeLayout expendablelayout;
        RelativeLayout linearLayout;
        TextView versionTxt;

        public VersionVH(View view) {
            super(view);
            this.codeNameTxt = (TextView) view.findViewById(R.id.code_name);
            this.versionTxt = (TextView) view.findViewById(R.id.version);
            this.apiLevelTxt = (TextView) view.findViewById(R.id.api_level);
            this.descriptionTxt = (TextView) view.findViewById(R.id.deskripsi);
            this.linearLayout = (RelativeLayout) view.findViewById(R.id.linear);
            this.expendablelayout = (RelativeLayout) view.findViewById(R.id.expendable_layout);
            this.linearLayout.setOnClickListener(new View.OnClickListener() { // from class: com.imam.android.VersionTipsAdapter.VersionVH.1
                @Override // android.view.View.OnClickListener
                public void onClick(View view2) {
                    VersionTips versionTips = VersionTipsAdapter.this.versionsList.get(VersionVH.this.getAdapterPosition());
                    versionTips.setExpendable(!versionTips.isExpendable());
                    VersionTipsAdapter.this.notifyItemChanged(VersionVH.this.getAdapterPosition());
                }
            });
        }
    }
}
