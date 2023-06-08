package com.jamrud.dempstershafer;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Filter;
import android.widget.Filterable;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* loaded from: classes.dex */
public class RecyclerViewAdapterJenis extends RecyclerView.Adapter<RecyclerViewAdapterJenis.MyViewHolder> implements Filterable {
    private List<Jenis> Pencarian;
    Filter filter = new Filter() { // from class: com.imam.android.RecyclerViewAdapterJenis.2
        @Override // android.widget.Filter
        protected FilterResults performFiltering(CharSequence charSequence) {
            ArrayList arrayList = new ArrayList();
            if (charSequence.toString().isEmpty()) {
                arrayList.addAll(RecyclerViewAdapterJenis.this.Pencarian);
            } else {
                for (Jenis jenis : RecyclerViewAdapterJenis.this.Pencarian) {
                    if (jenis.getNamaJenis().toLowerCase().contains(charSequence.toString().toLowerCase())) {
                        arrayList.add(jenis);
                    }
                }
            }
            FilterResults filterResults = new FilterResults();
            filterResults.values = arrayList;
            return filterResults;
        }

        @Override // android.widget.Filter
        protected void publishResults(CharSequence charSequence, FilterResults filterResults) {
            RecyclerViewAdapterJenis.this.mData.clear();
            RecyclerViewAdapterJenis.this.mData.addAll((Collection) filterResults.values);
            RecyclerViewAdapterJenis.this.notifyDataSetChanged();
        }
    };
    private Context mContext;
    private List<Jenis> mData;

    public RecyclerViewAdapterJenis(Context context, List<Jenis> list) {
        this.mContext = context;
        this.mData = list;
        this.Pencarian = new ArrayList(list);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public MyViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new MyViewHolder(LayoutInflater.from(this.mContext).inflate(R.layout.card_view_item_jenis, viewGroup, false));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(MyViewHolder myViewHolder, final int i) {
        myViewHolder.tv_book_title.setText(this.mData.get(i).getNamaJenis());
        myViewHolder.img_book_thumbnail.setImageResource(this.mData.get(i).getGambarJenis());
        myViewHolder.cardView.setOnClickListener(new View.OnClickListener() { // from class: com.imam.android.RecyclerViewAdapterJenis.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                Intent intent = new Intent(RecyclerViewAdapterJenis.this.mContext, DetailJenisActivity.class);
                intent.putExtra("Nama", ((Jenis) RecyclerViewAdapterJenis.this.mData.get(i)).getNamaJenis());
                intent.putExtra("Kategori", ((Jenis) RecyclerViewAdapterJenis.this.mData.get(i)).getKategoriJenis());
                intent.putExtra("Deskripsi", ((Jenis) RecyclerViewAdapterJenis.this.mData.get(i)).getDeskripsiJenis());
                intent.putExtra("Gambar", ((Jenis) RecyclerViewAdapterJenis.this.mData.get(i)).getGambarJenis());
                RecyclerViewAdapterJenis.this.mContext.startActivity(intent);
            }
        });
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.mData.size();
    }

    @Override // android.widget.Filterable
    public Filter getFilter() {
        return this.filter;
    }

    /* loaded from: classes.dex */
    public static class MyViewHolder extends RecyclerView.ViewHolder {
        CardView cardView;
        ImageView img_book_thumbnail;
        TextView tv_book_title;

        public MyViewHolder(View view) {
            super(view);
            this.tv_book_title = (TextView) view.findViewById(R.id.book_tittle_id);
            this.img_book_thumbnail = (ImageView) view.findViewById(R.id.book_img_id);
            this.cardView = (CardView) view.findViewById(R.id.cardview_id);
        }
    }
}
