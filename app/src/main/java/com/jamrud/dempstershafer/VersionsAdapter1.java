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
public class VersionsAdapter1 extends RecyclerView.Adapter<VersionsAdapter1.VersionVH> implements Filterable {
    List<Versions1> Pencarian;
    Filter filter = new Filter() { // from class: com.imam.android.VersionsAdapter1.1
        @Override // android.widget.Filter
        protected FilterResults performFiltering(CharSequence charSequence) {
            ArrayList arrayList = new ArrayList();
            if (charSequence.toString().isEmpty()) {
                arrayList.addAll(VersionsAdapter1.this.Pencarian);
            } else {
                for (Versions1 versions1 : VersionsAdapter1.this.Pencarian) {
                    if (versions1.getCodeName().toLowerCase().contains(charSequence.toString().toLowerCase())) {
                        arrayList.add(versions1);
                    }
                }
            }
            FilterResults filterResults = new FilterResults();
            filterResults.values = arrayList;
            return filterResults;
        }

        @Override // android.widget.Filter
        protected void publishResults(CharSequence charSequence, FilterResults filterResults) {
            VersionsAdapter1.this.versionsList.clear();
            VersionsAdapter1.this.versionsList.addAll((Collection) filterResults.values);
            VersionsAdapter1.this.notifyDataSetChanged();
        }
    };
    public List<Versions> getUserModelListFilltered;
    List<Versions1> versionsList;

    public VersionsAdapter1(List<Versions1> list) {
        this.versionsList = list;
        this.Pencarian = new ArrayList(list);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public VersionVH onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new VersionVH(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.row, viewGroup, false));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(VersionVH versionVH, int i) {
        Versions1 versions1 = this.versionsList.get(i);
        versionVH.codeNameTxt.setText(versions1.getCodeName());
        versionVH.versionTxt.setText(versions1.getVersion());
        versionVH.apiLevelTxt.setText(versions1.getApiLevel());
        versionVH.descriptionTxt.setText(versions1.getDescrpition());
        versionVH.expendablelayout.setVisibility(this.versionsList.get(i).isExpendable() ? 0 : 8);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.versionsList.size();
    }

    @Override // android.widget.Filterable
    public Filter getFilter() {
        return this.filter;
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
            this.linearLayout.setOnClickListener(new View.OnClickListener() { // from class: com.imam.android.VersionsAdapter1.VersionVH.1
                @Override // android.view.View.OnClickListener
                public void onClick(View view2) {
                    Versions1 versions1 = VersionsAdapter1.this.versionsList.get(VersionVH.this.getAdapterPosition());
                    versions1.setExpendable(!versions1.isExpendable());
                    VersionsAdapter1.this.notifyItemChanged(VersionVH.this.getAdapterPosition());
                }
            });
        }
    }
}
