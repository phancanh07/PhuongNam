package com.example.phuongnam.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import com.example.phuongnam.R;
import com.example.phuongnam.adapter.UserAdapter;
import com.example.phuongnam.model.User;

import java.util.ArrayList;
import java.util.List;

public class UserListActivity extends AppCompatActivity {

ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_list);
        listView=findViewById(R.id.listView);
        List<User> userList=new ArrayList<>();
        for (int i=0;i<20;i++){
            User user=new User();
//            user.setId(i);
            user.setUsername("TOM HOLLAND- SPIDERMAN"+i);
            user.setPassword(" Password :123  ");
            userList.add(user);
        }
        UserAdapter userAdapter=new UserAdapter(UserListActivity.this,userList);
        listView.setAdapter(userAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Object listItem = listView.getItemAtPosition(position);
                Toast.makeText(getApplicationContext(),"đã OK ",Toast.LENGTH_SHORT).show();
            }
        });
    }
}