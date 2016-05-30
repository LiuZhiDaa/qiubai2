package com.example.qiubai2.details;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.qiubai2.R;
import com.example.qiubai2.bean.ScandadetailsBean;
import com.makeramen.roundedimageview.RoundedImageView;

import java.util.List;


/**
 * Created by john on 2016/5/25.
 */
public class DetailsAdapter extends RecyclerView.Adapter<DetailsAdapter.ViewHolder> {

    private List<ScandadetailsBean.ItemsBean> scandadetailsList;
    private Context context;
    View view;

    public DetailsAdapter(Context context, List<ScandadetailsBean.ItemsBean> detailist) {
        this.context = context;
        this.scandadetailsList = detailist;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        view = LayoutInflater.from(parent.getContext()).inflate(R.layout.details_item, parent, false);
        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        if (scandadetailsList.get(position).getUser()!=null){
            holder.name_details.setText(scandadetailsList.get(position).getUser().getLogin());
            String detailsid = String.valueOf(scandadetailsList.get(position).getUser().getId());
            //头像id长度是8
            if (detailsid.length() == 8) {
                String subuserid = detailsid.substring(0, 4);
                Glide.with(context).load("http://pic.qiushibaike.com/system/avtnew/"
                        + subuserid + "/" + detailsid + "/medium/" + scandadetailsList.get(position).getUser().getIcon()).into(holder.touxiang_details);

                //头像id长度是7
            } else if (detailsid.length() == 7) {
                String subuserid = detailsid.substring(0, 3);
                Glide.with(context).load("http://pic.qiushibaike.com/system/avtnew/"
                        + subuserid + "/" + detailsid + "/medium/" + scandadetailsList.get(position).getUser().getIcon()).into(holder.touxiang_details);
            }
        }
        holder.time_details.setText(scandadetailsList.get(position).getContent());
        Log.d("000000", scandadetailsList.get(position).getContent());
    }

    @Override
    public int getItemCount() {
        return scandadetailsList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        RoundedImageView touxiang_details;
        TextView name_details,content_details,time_details;
        public ViewHolder(View itemView) {
            super(itemView);
            touxiang_details = (RoundedImageView) itemView.findViewById(R.id.touxiang_details);
            name_details = (TextView) itemView.findViewById(R.id.name_details);
            content_details = (TextView) itemView.findViewById(R.id.content_details);
            time_details = (TextView) itemView.findViewById(R.id.time_details);
        }
    }
}
