package com.proizvodstvo.listapp;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

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
        View myView = inflater.inflate(R.layout.item, viewGroup, false);

            /*
            процесс преобразования xml-макета в дерево объектов
            в Андроид называется inflation
            в ос есть специальный объект класса LayoutInflater
            этот объект и реализует процесс inflation
             */

        // 2. получить ссылки на UI-элементы в этом дереве

        ImageView imageView = myView.findViewById(R.id.image);
        TextView name = myView.findViewById(R.id.name_tv);
        TextView number = myView.findViewById(R.id.number_tv);

        // 3. заполнить данными элементы UI

        ListItem item = data.get(i);


        imageView.setImageResource(item.getAvatarId());
        name.setText(item.getName());
        number.setText(String.valueOf(item.getRandomNumber()));

        // 4. возвращаем ссылку на корень дерева объектов Java


        return myView;
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
