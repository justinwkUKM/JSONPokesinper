package com.myxlab.jsonpokesinper;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.android.volley.toolbox.ImageLoader;
import com.android.volley.toolbox.NetworkImageView;

import java.util.List;

/**
 * Created by haslina on 9/26/2016.
 */
public class MyAdapter extends RecyclerView.Adapter<MyAdapter.ViewHolder> {
    private ImageLoader imageLoader;
    private Context context;
    List<PokeSniperData> pokeSniperDataList;

    public MyAdapter(List<PokeSniperData> pokeSniperDataList, Context context) {
        this.context = context;
        this.pokeSniperDataList = pokeSniperDataList;
    }


    @Override
    public MyAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_layout, parent,false);
        ViewHolder viewHolder = new ViewHolder(v);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(MyAdapter.ViewHolder holder, int position) {
        final PokeSniperData pokeSniperData = pokeSniperDataList.get(position);


        imageLoader = CustomVolleyRequestPokemons.getInstance(context).getImageLoader();

        imageLoader.get(pokeSniperData.getImageURL(), ImageLoader.getImageListener(holder.imageView,R.mipmap.ic_launcher, android.R.drawable.ic_dialog_alert));

        holder.imageView.setImageUrl(pokeSniperData.getImageURL(), imageLoader);
        holder.tvName.setText(pokeSniperData.getTitle());
        holder.tvCoord.setText(pokeSniperData.getCoord());



    }

    @Override
    public int getItemCount() {
        return pokeSniperDataList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        NetworkImageView imageView ;
        TextView tvName, tvCoord;

        public ViewHolder(View itemView) {
            super(itemView);

            imageView = (NetworkImageView) itemView.findViewById(R.id.imageViewPokeSniper);
            tvName = (TextView) itemView.findViewById(R.id.tvName);
            tvCoord = (TextView) itemView.findViewById(R.id.tvCoord);

        }
    }
}
