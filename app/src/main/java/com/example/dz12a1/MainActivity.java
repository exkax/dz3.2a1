package com.example.dz12a1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
private RecyclerView recyclerView;
private ArrayList<Person> data;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        loadData();
        initRecycler();


    }

    private void initRecycler() {
        recyclerView = findViewById(R.id.recycler_view);
        NameAdapter adapter = new NameAdapter(data);
        recyclerView.setAdapter(adapter);
    }


    private void loadData() {
        data = new ArrayList<>();
        data.add(new Person(R.drawable.img, "Айпери Ашыралиева"));
        data.add(new Person(R.drawable.img, "Бермет Маметова"));
        data.add(new Person(R.drawable.img, "Билал Маметов"));
        data.add(new Person(R.drawable.img, "Бека Маметов"));
        data.add(new Person(R.drawable.img, "Жыпариза Кудунова"));
        data.add(new Person(R.drawable.img, "Назмина Кудунова"));
        data.add(new Person(R.drawable.img, "Алия Даниярова"));
        data.add(new Person(R.drawable.img, "Хан Азаматов"));
        data.add(new Person(R.drawable.img, "Байыш Эргешов"));
        data.add(new Person(R.drawable.img, "Осмон Омурбеков"));
        data.add(new Person(R.drawable.img, "Умар Борошов"));
        data.add(new Person(R.drawable.img, "Бекбол Бейшенбаев"));
        data.add(new Person(R.drawable.img, "Малик Адилов"));
        data.add(new Person(R.drawable.img, "Адиль Аскаров"));
        data.add(new Person(R.drawable.img, "Сыймык Болотов"));
        data.add(new Person(R.drawable.img, "Байэл Болотов"));
        data.add(new Person(R.drawable.img, "Айза Токтогулова"));
        data.add(new Person(R.drawable.img, "Асель Нурис кызы"));
        data.add(new Person(R.drawable.img, "Эльнура Чокоева"));
        data.add(new Person(R.drawable.img, "Мыктарбек Маметов"));
        data.add(new Person(R.drawable.img, "Тыныш Кенжекулова"));
        data.add(new Person(R.drawable.img, "Сара Даниель"));
        data.add(new Person(R.drawable.img, "Динара Чокоева"));
        data.add(new Person(R.drawable.img, "Гульмира Чокоеа"));
        data.add(new Person(R.drawable.img, "Мубарак Даниель"));
        data.add(new Person(R.drawable.img, "Коул Спроус"));
        data.add(new Person(R.drawable.img, "Каухар Маметова"));
        data.add(new Person(R.drawable.img, "Нуризат Урстамбекова"));
        data.add(new Person(R.drawable.img, "Алия Мамекова"));
        data.add(new Person(R.drawable.img, "Алтынай Джакыева"));
        data.add(new Person(R.drawable.img, "Мээрим Жоомартова"));
        data.add(new Person(R.drawable.img, "Бекболсун Каратаев"));
        data.add(new Person(R.drawable.img, "Азамат Тотоев"));
        data.add(new Person(R.drawable.img, "Султан Данияров"));
        data.add(new Person(R.drawable.img, "Эльхан Данияров"));
        data.add(new Person(R.drawable.img, "Арууке Маметова"));
        data.add(new Person(R.drawable.img, "Диана Александр"));
        
        
    }


}