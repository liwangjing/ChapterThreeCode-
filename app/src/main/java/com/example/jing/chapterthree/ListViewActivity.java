package com.example.jing.chapterthree;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class ListViewActivity extends Activity{

    private List<Fruit> fruitList = new ArrayList<Fruit>() ;


    private String[] data = {"apple", "banana", "orange", "watermelon",
    "pear", "grape", "pineapple", "strawberry", "cherry", "mango", "blueberry", "blackberry",
    "durian" , "kiwi", "avocado", "raspberry"};
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.listviewlayout);

        initFruits();
        FruitAdapter adapter = new FruitAdapter(
                ListViewActivity.this, R.layout.fruit_item,fruitList);
        ListView listView = (ListView)findViewById(R.id.listView);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Fruit fruit = fruitList.get(position);
                Toast.makeText(ListViewActivity.this, fruit.getName(),Toast.LENGTH_SHORT).show();
            }
        });


        /*ArrayAdapter<String> adapter = new ArrayAdapter<String>(
                ListViewActivity.this, android.R.layout.simple_list_item_1,data);
        ListView listView = (ListView)findViewById(R.id.listView);
        listView.setAdapter(adapter);*/
    }

    public void initFruits () {
        Fruit apple = new Fruit("Apple", R.drawable.apple);
        fruitList.add(apple);
        Fruit banana = new Fruit("Banana", R.drawable.banana);
        fruitList.add(banana);
        Fruit orange = new Fruit("Orange", R.drawable.orange);
        fruitList.add(orange);
        Fruit watermelon= new Fruit("Watermelon", R.drawable.watermelon);
        fruitList.add(watermelon);
        Fruit pear = new Fruit("Pear", R.drawable.pear);
        fruitList.add(pear);
        Fruit pineapple = new Fruit("Pineapple", R.drawable.pineapple);
        fruitList.add(pineapple);
        Fruit strawberry = new Fruit("Strawberry", R.drawable.strawberry);
        fruitList.add(strawberry);
        Fruit cherry = new Fruit("Cherry", R.drawable.cherry);
        fruitList.add(cherry);
        Fruit mango = new Fruit("Mango", R.drawable.mango);
        fruitList.add(mango);
        Fruit kiwi = new Fruit("Kiwi", R.drawable.kiwi);
        fruitList.add(kiwi);
        Fruit blackberry = new Fruit("Blackberry", R.drawable.blackberry);
        fruitList.add(blackberry);
        Fruit raspberry = new Fruit("Raspberry", R.drawable.raspberry);
        fruitList.add(raspberry);
        Fruit blueberry = new Fruit("Blueberry", R.drawable.blueberry);
        fruitList.add(blueberry);
        Fruit durian = new Fruit("Durian", R.drawable.durian);
        fruitList.add(durian);
        Fruit avocado = new Fruit("Avocado", R.drawable.avocado);
        fruitList.add(avocado);
    }
}
