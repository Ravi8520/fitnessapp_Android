package com.tfb.fitnessapp.activities;

import android.app.Dialog;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.util.Log;
import android.view.Gravity;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.view.ContextThemeWrapper;
import androidx.appcompat.widget.PopupMenu;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.tfb.fitnessapp.R;
import com.tfb.fitnessapp.adapter.BrowseHealthyDietsAdapter;
import com.tfb.fitnessapp.adapter.MealMarketAdapter;
import com.tfb.fitnessapp.adapter.RecommendMealAdapter;
import com.tfb.fitnessapp.databinding.ActivityMealMarketBinding;

public class MealMarketActivity extends AppCompatActivity {

    ActivityMealMarketBinding binding;
    MealMarketActivity context;
    MealMarketAdapter mealMarketAdapter;
    BrowseHealthyDietsAdapter browseHealthyDietsAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMealMarketBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        context = this;

        binding.backarrow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });
        mealMarketAdapter = new MealMarketAdapter(context);
        binding.recyclerFood.setLayoutManager(new GridLayoutManager(context, 3));
        binding.recyclerFood.setNestedScrollingEnabled(false);
        binding.recyclerFood.setAdapter(mealMarketAdapter);

        browseHealthyDietsAdapter = new BrowseHealthyDietsAdapter(context);
        binding.recyclerBrowseHealthyDiets.setLayoutManager(new LinearLayoutManager(context));
        binding.recyclerBrowseHealthyDiets.setNestedScrollingEnabled(false);
        binding.recyclerBrowseHealthyDiets.setAdapter(browseHealthyDietsAdapter);

        browseHealthyDietsAdapter.setOnItemClickListener(new BrowseHealthyDietsAdapter.OnItemClickListener() {
            @Override
            public void onItemClick(View view, int position) {
                if (view.getId() == R.id.img_more_option) {
                    try {

                        Context myContext = new ContextThemeWrapper(context, R.style.popupMenuStyle);
                        PopupMenu popupMenu = new PopupMenu(myContext, view);

                        popupMenu.getMenuInflater().inflate(R.menu.recommend_meal_menu, popupMenu.getMenu());
                        popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
                            @Override
                            public boolean onMenuItemClick(MenuItem menuItem) {

                                Log.e("menuItem", "menuItem==" + menuItem.getItemId());
                                if (menuItem.getItemId() == R.id.recommend_meal) {
                                    //Toast.makeText(context, menuItem.getTitle(), Toast.LENGTH_SHORT).show();
                                    final Dialog dialog = new Dialog(context);
                                    dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
                                    dialog.setCancelable(true);
                                    dialog.setCanceledOnTouchOutside(true);
                                    dialog.setContentView(R.layout.recommend_meal_dialog);
                                    dialog.getWindow().setLayout(WindowManager.LayoutParams.MATCH_PARENT, WindowManager.LayoutParams.WRAP_CONTENT);
                                    dialog.getWindow().setBackgroundDrawable(new ColorDrawable(android.graphics.Color.TRANSPARENT));
                                    dialog.getWindow().setBackgroundDrawableResource(android.R.color.transparent);
                                    dialog.getWindow().setGravity(Gravity.BOTTOM);

                                    RecyclerView recyclerView = dialog.findViewById(R.id.recycler_client);

                                    RecommendMealAdapter recommendMealAdapter = new RecommendMealAdapter(context);
                                    recyclerView.setLayoutManager(new LinearLayoutManager(context));
                                    recyclerView.setAdapter(recommendMealAdapter);

                                    dialog.show();
                                } else if (menuItem.getItemId() == R.id.add_to_favorite) {
                                    Toast.makeText(context, menuItem.getTitle(), Toast.LENGTH_SHORT).show();
                                }

                                return true;
                            }
                        });
                        popupMenu.show();
                    } catch (Exception e) {
                        e.getMessage();
                    }
                }
            }
        });
    }
}