package com.proizvodstvo.listapp;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class UsersAdapter extends BaseAdapter {

    private List<ListItem> data;
    private LayoutInflater inflater;

    public UsersAdapter(List<ListItem> data, LayoutInflater inflater) {
        this.data = data;
        this.inflater = inflater;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        // 1. преобразовать макет в дерево объектов java
        // самым базовым классом для всех элементов ui является класс View

        // проверяю convertView, если он null, значит у меня нет повторного пункта для использования
        // если не нулл, вместо inflate я беру готовый "старый" пункт списка

        if (view == null) {
            view = inflater.inflate(R.layout.item, viewGroup, false);
        }
            /*
            процесс преобразования xml-макета в дерево объектов
            в Андроид называется inflation
            в ос есть специальный объект класса LayoutInflater
            этот объект и реализует процесс inflation
             */

        // 2. получить ссылки на UI-элементы в этом дереве

        ImageView imageView = view.findViewById(R.id.image);
        TextView name = view.findViewById(R.id.name_tv);
        TextView number = view.findViewById(R.id.number_tv);

        // 3. заполнить данными элементы UI

        ListItem item = data.get(i);


        imageView.setImageResource(item.getAvatarId());
        name.setText(item.getName());
        number.setText(String.valueOf(item.getRandomNumber()));

        // 4. возвращаем ссылку на корень дерева объектов Java


        return view;
    }

    @Override
    public int getCount() {
        return data.size();
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }
}
