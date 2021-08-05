package com.example.samples;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.res.Resources;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;

import com.chivorn.smartmaterialspinner.SmartMaterialSpinner;
import com.google.android.material.textfield.TextInputLayout;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

Spinner spinner_city,spinner_age,spinner_category,spinner_app,spinner_name,spinner_imagesize,spinner_bdate,spinner_religion,spinner_gender;//file_type(to add)
Button sub;
String last;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        spinner_city= findViewById(R.id.spn_city);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.numbers, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner_city.setAdapter(adapter);
        spinner_city.setOnItemSelectedListener(this);

//.,.,.,.,.,

      spinner_religion = findViewById(R.id.spn_religion);
        ArrayAdapter<CharSequence> spn_religion_adapter = ArrayAdapter.createFromResource(this,
                R.array.numbers, android.R.layout.simple_spinner_item);
        spn_religion_adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner_religion.setAdapter(spn_religion_adapter);
        spinner_religion.setOnItemSelectedListener(this);

//.,.,.,.,.,
        spinner_age = findViewById(R.id.spn_age);
        ArrayAdapter<CharSequence> spn_age_adapter = ArrayAdapter.createFromResource(this,
                R.array.numbers, android.R.layout.simple_spinner_item);
        spn_age_adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner_age.setAdapter(spn_age_adapter);
        spinner_age.setOnItemSelectedListener(this);
//.,.,.,.,.,
        spinner_name = findViewById(R.id.spn_name);
        ArrayAdapter<CharSequence> spn_name_adapter = ArrayAdapter.createFromResource(this,
                R.array.numbers, android.R.layout.simple_spinner_item);
        spn_name_adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner_name.setAdapter(spn_name_adapter);
        spinner_name.setOnItemSelectedListener(this);
//.,.,.,.,.,


        spinner_app = findViewById(R.id.spn_app);
        ArrayAdapter<CharSequence> spn_app_adapter = ArrayAdapter.createFromResource(this,
                R.array.numbers, android.R.layout.simple_spinner_item);
        spn_app_adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner_app.setAdapter(spn_app_adapter);
        spinner_app.setOnItemSelectedListener(this);
//.,.,.,.,.,

        spinner_bdate = findViewById(R.id.spn_bdate);
        ArrayAdapter<CharSequence> spn_bdate_adapter = ArrayAdapter.createFromResource(this,
                R.array.numbers, android.R.layout.simple_spinner_item);
        spn_bdate_adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner_bdate.setAdapter(spn_bdate_adapter);
        spinner_bdate.setOnItemSelectedListener(this);
//.,.,.,.,.,
        spinner_category = findViewById(R.id.spn_category);
        ArrayAdapter<CharSequence> spn_category_adapter = ArrayAdapter.createFromResource(this,
                R.array.numbers, android.R.layout.simple_spinner_item);
        spn_category_adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner_category.setAdapter(spn_category_adapter);
        spinner_category.setOnItemSelectedListener(this);
//.,.,.,.,.,
        spinner_gender = findViewById(R.id.spn_gender);
        ArrayAdapter<CharSequence> spn_gender_adapter = ArrayAdapter.createFromResource(this,
                R.array.numbers, android.R.layout.simple_spinner_item);
        spn_gender_adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner_gender.setAdapter(spn_gender_adapter);
        spinner_gender.setOnItemSelectedListener(this);
//.,.,.,.,.,
        spinner_imagesize = findViewById(R.id.spn_imgsize);
        ArrayAdapter<CharSequence> spn_imagesize_adapter = ArrayAdapter.createFromResource(this,
                R.array.numbers, android.R.layout.simple_spinner_item);
        spn_imagesize_adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner_imagesize.setAdapter(spn_imagesize_adapter);
        spinner_imagesize.setOnItemSelectedListener(this);
//.,.,.,.,.,







    }
    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        String text = parent.getItemAtPosition(position).toString();

        //last=spinner.getSelectedItem().toString()+" "+spinner_religion.getSelectedItem().toString();
        Toast.makeText(parent.getContext(), text, Toast.LENGTH_SHORT).show();
    }


    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }

    public void submit(View view) {

    }
}
