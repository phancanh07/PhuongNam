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
import com.example.phuongnam.model.Book;

import java.util.List;

public class BookAdapter extends BaseAdapter {
    List<Book> list;
    Context context;

    public BookAdapter(List<Book> list, Context context) {
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
        convertView = LayoutInflater.from(context).inflate(R.layout.quanlisach_adapter, parent, false);

        final Book book = list.get(position);

        ImageView im1;

        TextView tvtensach, theloai, tacgia, nhaxuatban, sosach, giamua, giaban, ngaynhap;

        im1 = convertView.findViewById(R.id.img_sach);
        tvtensach = convertView.findViewById(R.id.tv_tensach);
        theloai = convertView.findViewById(R.id.theloaisach);
        nhaxuatban = convertView.findViewById(R.id.nhaxuatban);
        tacgia = convertView.findViewById(R.id.tacgia);
        sosach = convertView.findViewById(R.id.sosach);
        giamua = convertView.findViewById(R.id.giamua);
        giaban = convertView.findViewById(R.id.giaban);
        ngaynhap = convertView.findViewById(R.id.ngaynhap);
//        tvtensach.setText("Tên Sách \t" + String.valueOf(list.get(position).getTenSach()));
//        theloai.setText("Thể Loại  \t" + list.get(position).getTheLoai());
//        tacgia.setText("Thể Loai \t" + String.valueOf(list.get(position).getTacGia()));
//        nhaxuatban.setText("Nhà Xuất Bản \t" + String.valueOf(list.get(position).getNhaXuatBan()));
//        sosach.setText("Số Sách\t " + String.valueOf(list.get(position).getSoSach()));
//        giamua.setText("Gía Mua \t" + String.valueOf(list.get(position).getGiaMua()));
//        giaban.setText("Gía Bán \t" + String.valueOf(list.get(position).getGiaBan()));
//        ngaynhap.setText("Ngày Nhập \t" + String.valueOf(list.get(position).getNgayNhap()));
        return convertView;
    }
}
