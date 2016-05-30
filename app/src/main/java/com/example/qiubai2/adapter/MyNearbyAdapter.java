package com.example.qiubai2.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.qiubai2.R;
import com.example.qiubai2.bean.NearbyBean;

/**
 * Created by zzj on 2016/5/25.
 */
public class MyNearbyAdapter extends RecyclerView.Adapter<MyNearbyAdapter.MyHolder> {

    NearbyBean mFindEntity;
    Context mContext;


    public MyNearbyAdapter(Context context, NearbyBean findEntity) {
        this.mContext = context;
        this.mFindEntity = findEntity;
    }

    @Override
    public MyHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.fragment_nearby_recycler_item, parent, false);
        MyHolder myHolder = new MyHolder(view);
        return myHolder;
    }

    @Override
    public void onBindViewHolder(MyHolder holder, int position) {
        if (position == 0){
            holder.rl_store.setVisibility(View.VISIBLE);
        }else if (position <= mFindEntity.getBuy().getItems().size() ){
            holder.rl_store2.setVisibility(View.VISIBLE);
            Glide.with(mContext).load(mFindEntity.getBuy().getItems().get(mFindEntity.getBuy().getItems().size() - position).getImage()).into(holder.iv_store);
            holder.tv_store.setText(mFindEntity.getBuy().getItems().get(mFindEntity.getBuy().getItems().size() - position).getName());
            holder.price.setText("￥" + mFindEntity.getBuy().getItems().get(mFindEntity.getBuy().getItems().size() - position).getPrice());
            holder.tv_mktPrice.setText("￥" + mFindEntity.getBuy().getItems().get(mFindEntity.getBuy().getItems().size() - position).getMktPrice());
        }else if (position == mFindEntity.getBuy().getItems().size() + 1){
            holder.rl_game.setVisibility(View.VISIBLE);
        }else if (position <= mFindEntity.getGame().getGames().size() + mFindEntity.getBuy().getItems().size() + 1){
            holder.rl_game2.setVisibility(View.VISIBLE);
            Glide.with(mContext).load(mFindEntity.getGame().getGames().get(mFindEntity.getGame().getGames().size() + mFindEntity.getBuy().getItems().size() + 1 - position).getImage()).into(holder.iv_game);
            holder.tv_game.setText(mFindEntity.getGame().getGames().get(mFindEntity.getGame().getGames().size() + mFindEntity.getBuy().getItems().size() + 1 - position).getName());
            holder.description.setText(mFindEntity.getGame().getGames().get(mFindEntity.getGame().getGames().size() + mFindEntity.getBuy().getItems().size() + 1 - position).getDescription());
        }else if (position == mFindEntity.getBuy().getItems().size() + 1+mFindEntity.getGame().getGames().size()+1){
            holder.rl_chicken.setVisibility(View.VISIBLE);
        }else{
            holder.rl_chicken2.setVisibility(View.VISIBLE);
            holder.tv_subject.setText(mFindEntity.getVideo().getVideos().get(0).getSubject());
            holder.ch_description.setText(mFindEntity.getVideo().getVideos().get(0).getDescription());
        }
    }

    @Override
    public int getItemCount() {
        return mFindEntity.getBuy().getItems().size() + mFindEntity.getGame().getGames().size() + mFindEntity.getVideo().getVideos().size() + 3;
    }


    class MyHolder extends RecyclerView.ViewHolder {

        RelativeLayout rl_store, rl_store2, rl_game, rl_game2, rl_chicken, rl_chicken2;
        TextView tv_store, price, tv_mktPrice, tv_game, description, tv_subject, ch_description;
        ImageView iv_store, iv_game, iv_video;
        Button start;

        public MyHolder(View itemView) {
            super(itemView);

                rl_store = (RelativeLayout) itemView.findViewById(R.id.rl_store);
                rl_store2 = (RelativeLayout) itemView.findViewById(R.id.rl_store2);
                tv_store = (TextView) itemView.findViewById(R.id.tv_store);
                price = (TextView) itemView.findViewById(R.id.price);
                tv_mktPrice = (TextView) itemView.findViewById(R.id.tv_mktPrice);

                iv_game = (ImageView) itemView.findViewById(R.id.iv_game);
                rl_game = (RelativeLayout) itemView.findViewById(R.id.rl_game);
                rl_game2 = (RelativeLayout) itemView.findViewById(R.id.rl_game2);
                description = (TextView) itemView.findViewById(R.id.description);
                tv_game = (TextView) itemView.findViewById(R.id.tv_game);
                tv_subject = (TextView) itemView.findViewById(R.id.tv_subject);
                start = (Button) itemView.findViewById(R.id.start);

                rl_chicken = (RelativeLayout) itemView.findViewById(R.id.rl_chicken);
                rl_chicken2 = (RelativeLayout) itemView.findViewById(R.id.rl_chicken2);
                iv_video = (ImageView) itemView.findViewById(R.id.iv_video);
                ch_description = (TextView) itemView.findViewById(R.id.ch_description);
                iv_store = (ImageView) itemView.findViewById(R.id.iv_store);

        }
    }
}
