package com.example.phuongnam.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.phuongnam.R;
import com.example.phuongnam.model.BillDetai;

import java.io.PipedOutputStream;
import java.util.List;

public class BillDetaiAdapter extends BaseAdapter {
    List<BillDetai> list;
    Context context;

    public BillDetaiAdapter(List<BillDetai> list, Context context) {
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
        convertView = LayoutInflater.from(context).inflate(R.layout.adapter_billdetai, parent, false);
        final BillDetai billDetai = list.get(position);
        ImageView im1;
        TextView tvid, tenkhachhang, sosach, gia, ngayBan, tensach;
        im1 = convertView.findViewById(R.id.img_billicon);
        tvid = convertView.findViewById(R.id.tv_id_hoadon);
        tenkhachhang = convertView.findViewById(R.id.tenkhachhang);
        sosach = convertView.findViewById(R.id.sosach);
        gia = convertView.findViewById(R.id.gia_hoadon);
        tensach = convertView.findViewById(R.id.tv_tensach);
        ngayBan = convertView.findViewById(R.id.ngayBan_hoadon);
//        tvid.setText("MÃ HÓA ĐƠN \t" + String.valueOf(list.get(position).getID()));
//        tenkhachhang.setText("TÊN KHÁCH HÀNG \t" + list.get(position).getTenKhachHang());
//        tensach.setText("TÊN SÁCH \t" + list.get(position).getTenSach());
//        sosach.setText("SỐ SÁCH \t" + String.valueOf(list.get(position).getSoSach()+"\tCUỐN"));
//        gia.setText("GIÁ SÁCH :\t" + String.valueOf(list.get(position).getGia())+"\tĐỒNG");
//        ngayBan.setText("NGÀY BÁN :\t" + String.valueOf(list.get(position).getNgayBan()));
        return convertView;
    }
}
