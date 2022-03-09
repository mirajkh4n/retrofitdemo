package com.example.retrofitdemo;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class postAdapter extends RecyclerView.Adapter<postAdapter.postViewHolder> {
    List<post> postList;
    Context context;

    public postAdapter(Context context, List<post> posts) {
        this.context = context;
        postList = posts;
    }

    @NonNull
    @Override
    public postViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(context).inflate(R.layout.item, parent, false);

        return new postViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull postViewHolder holder, int position) {

        post post = postList.get(position);
        holder.id.setText(post.getId());
        holder.userid.setText(post.getUserId());
        holder.title.setText(post.getTitle());
        holder.body.setText(post.getBody());
    }

    @Override
    public int getItemCount() {
        return postList.size();
    }

    public class postViewHolder extends RecyclerView.ViewHolder {

        TextView id, userid, title, body;

        public postViewHolder(@NonNull View itemView) {
            super(itemView);
            id = itemView.findViewById(R.id.id_tv);
            userid = itemView.findViewById(R.id.user_id_tv);
            title = itemView.findViewById(R.id.title_tv);
            body = itemView.findViewById(R.id.body_tv);
        }
    }
}
