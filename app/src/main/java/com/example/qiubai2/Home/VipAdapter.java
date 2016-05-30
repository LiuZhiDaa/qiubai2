package com.example.qiubai2.Home;

import android.content.Context;
import android.support.v4.view.ViewPager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.qiubai2.R;
import com.example.qiubai2.bean.VipBean;
import com.makeramen.roundedimageview.RoundedImageView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2016/5/17 0017.
 */
public class VipAdapter extends RecyclerView.Adapter<VipAdapter.ViewHolder> {

    private Context context;
    private List<VipBean.ItemsBean> viplist;
    View view;
    public OnClickListener onClick = null;


    public interface OnClickListener{
        void OnClickListener(int itemData, List<VipBean.ItemsBean> item);
    }

    public void setOnItemClickListener(OnClickListener listener){
        this.onClick=listener;
    }

    public VipAdapter(Context context, List<VipBean.ItemsBean> viplist) {
        this.context = context;
        this.viplist = viplist;
    }


    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_qiubai2, parent, false);
        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(final ViewHolder holder, int position) {

        if (viplist.get(position).getUser()!=null) {
            holder.name_tv_item.setText(viplist.get(position).getUser().getLogin());
            String userid = String.valueOf(viplist.get(position).getUser().getId());
            //头像id长度是8
            if (userid.length() == 8) {
                String subuserid = userid.substring(0, 4);
                Glide.with(context).load("http://pic.qiushibaike.com/system/avtnew/"
                        + subuserid + "/" + userid + "/medium/" + viplist.get(position).getUser().getIcon()).into(holder.touxiang_item);

                //头像id长度是7
            } else if (userid.length() == 7) {
                String subuserid = userid.substring(0, 3);
                Glide.with(context).load("http://pic.qiushibaike.com/system/avtnew/"
                        + subuserid + "/" + userid + "/medium/" + viplist.get(position).getUser().getIcon()).into(holder.touxiang_item);
            }
        }
        String type = String.valueOf(viplist.get(position).getType());
        if (type.length() == 3) {
            holder.hot_tv_item.setText("\uD83D\uDD25 热门");
        } else if (type.length() == 7) {
            holder.hot_tv_item.setText("\uD83D\uDC51 精选");
        } else if (type.length() == 5) {
            holder.hot_tv_item.setText("\uD83C\uDF4A 新鲜");
        }

        //______________________________________分隔
        //判断是否内容是图片，是就显示不是就隐藏
        if (viplist.get(position).getFormat().equals("image")) {
            String image = String.valueOf(viplist.get(position).getId());
            String suimage = image.substring(0, 5);
            Glide.with(context).load("http://pic.qiushibaike.com/system/pictures/"
                    + suimage + "/" + image + "/medium/" + viplist.get(position).getImage()).into(holder.content_img_item);
//            Log.d("000020", "http://pic.qiushibaike.com/system/pictures/" + suimage + "/" + image + "/medium/" + viplist.get(position).getImage());
            holder.content_tv_item.setText(viplist.get(position).getContent());
        } else if (viplist.get(position).getFormat().equals("word")) {
           holder.content_tv_item.setText(viplist.get(position).getContent());

            Log.d("lhu11111",viplist.get(position).getContent());
//            holder.content_img_item.setVisibility(View.GONE);
        }

        //__________________分隔

        holder.like_tv_item.setText("搞笑" + viplist.get(position).getVotes().getUp());
        holder.comment_tv_item.setText("评论" + viplist.get(position).getComments_count());
        holder.share_tv_item.setText("分享" + viplist.get(position).getShare_count());
        holder.itemView.setTag(position);
        if (!holder.itemView.hasOnClickListeners()){
            holder.itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (onClick != null){
                        onClick.OnClickListener((int)holder.itemView.getTag(),viplist);
                    }
                }
            });
        }
    }

    @Override
    public int getItemCount() {
        return viplist.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        RoundedImageView touxiang_item;//头像
        TextView hot_tv_item, name_tv_item, content_tv_item, like_tv_item, comment_tv_item, share_tv_item;
        ImageView content_img_item;//热门头像



        public ViewHolder(View itemView) {
            super(itemView);

            touxiang_item = (RoundedImageView) itemView.findViewById(R.id.touxiang_item);//  头像

            content_img_item = (ImageView) itemView.findViewById(R.id.content_img);///内容图片

            hot_tv_item = (TextView) itemView.findViewById(R.id.hot_tv_item);//热门

            name_tv_item = (TextView) itemView.findViewById(R.id.name_tv_item);//姓名
            content_tv_item = (TextView) itemView.findViewById(R.id.content_tv_item);//内容
            like_tv_item = (TextView) itemView.findViewById(R.id.like_tv_item);//喜欢
            comment_tv_item = (TextView) itemView.findViewById(R.id.comment_tv_item);//评论
            share_tv_item = (TextView) itemView.findViewById(R.id.share_tv_item);//分享


        }


    }
}
