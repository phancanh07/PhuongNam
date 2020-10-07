package com.example.phuongnam.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.phuongnam.R;
import com.example.phuongnam.model.BillDetai;
import com.example.phuongnam.model.TheLoai;

import java.util.List;

public class TheLoaiAdapter extends BaseAdapter {
    List<TheLoai> list;
    Context context;

    public TheLoaiAdapter(List<TheLoai> list, Context context) {
        this.list = list;
        this.context = context;
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
        convertView = LayoutInflater.from(context).inflate(R.layout.adapter_theloai, parent, false);
        final TheLoai theLoai = list.get(position);
        TextView tvvitri, tentl, soluongtl, giatl;
        tvvitri = convertView.findViewById(R.id.tv_vtritl);
        tentl = convertView.findViewById(R.id.tv_tentl);
        soluongtl = convertView.findViewById(R.id.tv_soluongtl);
        giatl = convertView.findViewById(R.id.tv_giatl);
//        tvvitri.setText("Vị Trí :\t" + String.valueOf(list.get(position).getID()));
//        tentl.setText(" Tên Thể Loại :\t" + (list.get(position).getTenTl()));
//        soluongtl.setText(" Số Lượng :\t" + String.valueOf(list.get(position).getSoluongtl()));
//        giatl.setText("Gía Tiền :\t" + String.valueOf(list.get(position).getAmount()));
        return convertView;
    }
}
