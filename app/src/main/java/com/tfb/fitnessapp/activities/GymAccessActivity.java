package com.tfb.fitnessapp.activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.SearchView;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.app.Dialog;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;

import com.tfb.fitnessapp.R;
import com.tfb.fitnessapp.adapter.EquipmentsAdapters;
import com.tfb.fitnessapp.adapter.SelectCityAdapter;
import com.tfb.fitnessapp.models.Equipmentmodel;
import com.tfb.fitnessapp.models.SelectCitymodel;
import com.tfb.fitnessapp.databinding.ActivityGymAccessBinding;

import java.util.ArrayList;

public class GymAccessActivity extends AppCompatActivity {

    private GymAccessActivity mContext;
    ActivityGymAccessBinding binding;

    private ArrayList<Equipmentmodel> equipmetsdata;
    private ArrayList<SelectCitymodel> selectcitylist;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityGymAccessBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        mContext = this;


        binding.btnContinue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(mContext,ChooseAvailabilityActivity.class));
            }
        });

        binding.addGymTV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                AddGymCity();
            }
        });

        binding.backarrow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
            }
        });

        equipmetsdata = new ArrayList<>();
        equipmetsdata.add(new Equipmentmodel("Free Weight",R.drawable.freeweights));
        equipmetsdata.add(new Equipmentmodel("Bars & Benches",R.drawable.barsbenches));
        equipmetsdata.add(new Equipmentmodel("Bars & Benches",R.drawable.freeweights));
        equipmetsdata.add(new Equipmentmodel("Free Weight",R.drawable.barsbenches));
        equipmetsdata.add(new Equipmentmodel("Bars & Benches",R.drawable.freeweights));
        equipmetsdata.add(new Equipmentmodel("Free Weight",R.drawable.barsbenches));
        equipmetsdata.add(new Equipmentmodel("Bars & Benches",R.drawable.freeweights));
        equipmetsdata.add(new Equipmentmodel("Free Weight",R.drawable.barsbenches));
        equipmetsdata.add(new Equipmentmodel("Bars & Benches",R.drawable.freeweights));
        equipmetsdata.add(new Equipmentmodel("Free Weight",R.drawable.barsbenches));


        EquipmentsAdapters adapter = new EquipmentsAdapters(equipmetsdata,this);
        GridLayoutManager layoutManager=new GridLayoutManager(this,3);
        binding.equipmentsRV.setLayoutManager(layoutManager);
        binding.equipmentsRV.setAdapter(adapter);


    }

    private void AddGymCity() {

        final Dialog dialog = new Dialog(mContext);
        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
        dialog.setCancelable(true);
        dialog.setCanceledOnTouchOutside(true);
        dialog.setContentView(R.layout.select_gym_city_dialog);
        dialog.getWindow().setLayout(WindowManager.LayoutParams.MATCH_PARENT, WindowManager.LayoutParams.WRAP_CONTENT);
        dialog.getWindow().setBackgroundDrawable(new ColorDrawable(android.graphics.Color.TRANSPARENT));
        dialog.getWindow().setBackgroundDrawableResource(android.R.color.transparent);
        dialog.getWindow().setGravity(Gravity.BOTTOM);


        SearchView searchCity = dialog.findViewById(R.id.searchCity);


        selectcitylist = new ArrayList<>();
        selectcitylist.add(new SelectCitymodel("Tokyo,New York"));
        selectcitylist.add(new SelectCitymodel("germany"));
        selectcitylist.add(new SelectCitymodel("America"));
        selectcitylist.add(new SelectCitymodel("Assam"));
        selectcitylist.add(new SelectCitymodel("berlin"));
        selectcitylist.add(new SelectCitymodel("UAE"));
        selectcitylist.add(new SelectCitymodel("UAE"));
        selectcitylist.add(new SelectCitymodel("fillipins"));
        selectcitylist.add(new SelectCitymodel("Tokyo,New York"));
        selectcitylist.add(new SelectCitymodel("ohayo"));
        selectcitylist.add(new SelectCitymodel("perris"));
        selectcitylist.add(new SelectCitymodel("russia"));

        SelectCityAdapter adapter = new SelectCityAdapter(selectcitylist,mContext);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getApplicationContext());
        RecyclerView cityname = dialog.findViewById(R.id.select_cityRV);
        cityname.setAdapter(adapter);
        cityname.setLayoutManager(layoutManager);


       ImageView img_close= dialog.findViewById(R.id.img_close);

        img_close.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dialog.dismiss();
            }
        });

        SearchView searchCityname = dialog.findViewById(R.id.searchCity);
        searchCityname.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                adapter.getFilter().filter(query);
                return false;
            }

            @Override
            public boolean onQueryTextChange(String newText) {
                adapter.getFilter().filter(newText);
                return false;
            }
        });



        dialog.show();

    }
}