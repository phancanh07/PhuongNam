package com.example.phuongnam.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.constraintlayout.widget.ConstraintLayout;

import com.example.phuongnam.R;
import com.example.phuongnam.model.User;

import java.util.List;

public class UserAdapter extends BaseAdapter {
    Context context;
    List<User> list;

    public UserAdapter(Context context, List<User> list) {
        this.context = context;
        this.list = list;
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        convertView = LayoutInflater.from(context).inflate(R.layout.adapter_user, parent, false);
       final User user = list.get(position);
        ImageView im1,im2;
        im1=convertView.findViewById(R.id.user_img);
        im2=convertView.findViewById(R.id.edit_user);
        TextView tv1 = (TextView) convertView.findViewById(R.id.ten);
        TextView tv2 = (TextView) convertView.findViewById(R.id.pass);
        TextView tv3 = (TextView) convertView.findViewById(R.id.Email);
        tv2.setText(list.get(position).getUsername());
        tv3.setText(list.get(position).getPassword());
        im2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context,"Ok rồi đấy",Toast.LENGTH_SHORT).show();
            }
        });
        return convertView;
    }
}
