package com.idouble.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private ListView listView;
    private MyAdapter myAdapter;
    List<ItemBean> itemBean= new ArrayList<ItemBean>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate (savedInstanceState);
        setContentView (R.layout.activity_main);
        listView = (ListView)findViewById (R.id.listone);

        for (int i = 0; i < 20; i++){
            itemBean.add (new ItemBean (R.mipmap.ic_launcher,"标题"+i,"内容"+i,i+""));
        }
        myAdapter = new MyAdapter (this,itemBean);

        listView.setAdapter (myAdapter);
        myAdapter.notifyDataSetChanged();
        listView.setOnItemClickListener (new AdapterView.OnItemClickListener () {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText (MainActivity.this, position+"", Toast.LENGTH_SHORT).show ();
            }
        });
    }
}
