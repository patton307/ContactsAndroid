package com.theironyard.contactsandroid;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import java.lang.reflect.Array;

public class MainActivity extends AppCompatActivity implements View.OnClickListener, AdapterView.OnItemLongClickListener {

    Button addButton;
    EditText nameText;
    EditText phoneText;
    ListView listView;
    ArrayAdapter<String> items;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        addButton = (Button) findViewById(R.id.addButton);
        nameText = (EditText) findViewById(R.id.nameText);
        phoneText = (EditText) findViewById(R.id.phoneText);
        listView = (ListView) findViewById(R.id.listView);

        addButton.setOnClickListener(this);

        items = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1);
        listView.setAdapter(items);
    }


    @Override
    public void onClick(View v) {
        String name = nameText.getText().toString();
        String phone = phoneText.getText().toString();
        String contact = name + " " + " " + phone;
        items.add(contact);
        phoneText.setText("");
        nameText.setText("");


    }

    @Override
    public boolean onItemLongClick(AdapterView<?> parent, View view, int position, long id) {
        return false;
    }
}
