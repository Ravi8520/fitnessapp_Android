package com.tfb.fitnessapp.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Filter;
import android.widget.Filterable;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.recyclerview.widget.RecyclerView;

import com.tfb.fitnessapp.R;
import com.tfb.fitnessapp.models.SelectCitymodel;

import java.util.ArrayList;

public class SelectCityAdapter extends RecyclerView.Adapter<SelectCityAdapter.CityViewholder> implements Filterable {

    private ArrayList<SelectCitymodel> cityarrayList;
    private ArrayList<SelectCitymodel> filterArray;
    private Context mcontext;

    public SelectCityAdapter(ArrayList<SelectCitymodel> cityarrayList, Context mcontext) {
        this.cityarrayList = cityarrayList;
        this.filterArray = cityarrayList;
        this.mcontext = mcontext;
    }

    @NonNull
    @Override
    public SelectCityAdapter.CityViewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(mcontext).inflate(R.layout.select_city_itemview,parent,false);
        return new CityViewholder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull SelectCityAdapter.CityViewholder holder, int position) {

        SelectCitymodel cityData = cityarrayList.get(position);
        holder.citylistTV.setText(cityData.getCity());
    }

    @Override
    public int getItemCount() {
        return cityarrayList.size();
    }

    @Override
    public Filter getFilter() {
        return new Filter() {
            @Override
            protected FilterResults performFiltering(CharSequence charSequence) {

                String charString = charSequence.toString();

                if (charString.isEmpty()) {

                    cityarrayList = filterArray;
                } else {

                    ArrayList<SelectCitymodel> filteredList = new ArrayList<>();

                    for (SelectCitymodel androidVersion : filterArray) {

                        if (androidVersion.getCity().toLowerCase().contains(charString)) {
                            filteredList.add(androidVersion);
                        }
                    }

                    cityarrayList = filteredList;
                }

                FilterResults filterResults = new FilterResults();
                filterResults.values = cityarrayList;
                return filterResults;
            }

            @Override
            protected void publishResults(CharSequence charSequence, FilterResults filterResults) {
                cityarrayList = (ArrayList<SelectCitymodel>) filterResults.values;
                if (cityarrayList.size() > 0) {
                    //  mListener.onListEmpty(true);
                } else {
                    // mListener.onListEmpty(false);
                    Toast.makeText(mcontext,"no data found",Toast.LENGTH_SHORT).show();
                }
                notifyDataSetChanged();
            }
        };
    }

    public class CityViewholder extends RecyclerView.ViewHolder {

        AppCompatTextView citylistTV;

        public CityViewholder(@NonNull View itemView) {
            super(itemView);

            citylistTV = itemView.findViewById(R.id.citylistTV);
        }
    }
}
