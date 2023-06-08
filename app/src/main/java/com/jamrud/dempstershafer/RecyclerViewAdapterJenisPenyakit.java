package com.jamrud.dempstershafer;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

/* loaded from: classes.dex */
public class RecyclerViewAdapterJenisPenyakit extends RecyclerView.Adapter<RecyclerViewAdapterJenisPenyakit.MyViewHolder2> {
    private Context mContext;
    private List<JenisPenyakit> mData;

    public RecyclerViewAdapterJenisPenyakit(Context context, List<JenisPenyakit> list) {
        this.mContext = context;
        this.mData = list;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public MyViewHolder2 onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new MyViewHolder2(LayoutInflater.from(this.mContext).inflate(R.layout.card_view_item_jenis_penyakit, viewGroup, false));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(MyViewHolder2 myViewHolder2, final int i) {
        myViewHolder2.tv_book_title.setText(this.mData.get(i).getNamaJenis());
        myViewHolder2.img_book_thumbnail.setImageResource(this.mData.get(i).getGambarJenis());
        myViewHolder2.cardView.setOnClickListener(new View.OnClickListener() { // from class: com.imam.android.RecyclerViewAdapterJenisPenyakit.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                Intent intent = new Intent(RecyclerViewAdapterJenisPenyakit.this.mContext, DetailJenisPenyakitActivity.class);
                intent.putExtra("Nama", ((JenisPenyakit) RecyclerViewAdapterJenisPenyakit.this.mData.get(i)).getNamaJenis());
                intent.putExtra("Kategori", ((JenisPenyakit) RecyclerViewAdapterJenisPenyakit.this.mData.get(i)).getKategoriJenis());
                intent.putExtra("Deskripsi", ((JenisPenyakit) RecyclerViewAdapterJenisPenyakit.this.mData.get(i)).getDeskripsiJenis());
                intent.putExtra("Gambar", ((JenisPenyakit) RecyclerViewAdapterJenisPenyakit.this.mData.get(i)).getGambarJenis());
                RecyclerViewAdapterJenisPenyakit.this.mContext.startActivity(intent);
            }
        });
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.mData.size();
    }

    /* loaded from: classes.dex */
    public class MyViewHolder2 extends RecyclerView.ViewHolder {
        CardView cardView;
        ImageView img_book_thumbnail;
        TextView tv_book_title;

        public MyViewHolder2(View view) {
            super(view);
            this.tv_book_title = (TextView) view.findViewById(R.id.book_tittle_id);
            this.img_book_thumbnail = (ImageView) view.findViewById(R.id.book_img_id);
            this.cardView = (CardView) view.findViewById(R.id.cardview_id);
        }
    }
}
