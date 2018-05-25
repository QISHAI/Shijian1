package com.example.wangyiwen.work1;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class MainActivity extends AppCompatActivity {

    private final static String PRODUCT="product";
    private final static String PRICE="price";
    private final static String CONFIGURATION="configuration";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String[] products={"张三","李四","王五","小明"};
        String[] prices={"2015011232","2017011342","2016011234","2014011675"};
        String[] configurations={"男 13312341234","女 15312343654","男 13218462234","女 19584241234"};

        List<Map<String,Object>> items=new ArrayList<Map<String,Object>>();

        for(int i=0;i<products.length;i++) {
            Map<String,Object> item=new HashMap<String,Object>();
            item.put(PRODUCT, products[i]);
            item.put(PRICE, prices[i]);
            item.put(CONFIGURATION, configurations[i]);
            items.add(item);
        }

        SimpleAdapter adapter=new SimpleAdapter(this,items,R.layout.item,new String[]{PRODUCT,PRICE,CONFIGURATION},new int[]{R.id.txtProduct,R.id.txtPrice,R.id.txtConfiguration});

        ListView list=(ListView)findViewById(R.id.list_view);

        list.setAdapter(adapter);
    }
}
