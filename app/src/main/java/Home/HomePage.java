package Home;

import android.os.Bundle;
import android.view.MenuItem;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.orderfood.R;
import com.google.android.material.bottomnavigation.BottomNavigationView;

import java.util.ArrayList;

import Adapter.AdapterCategories;
import Domain.Categories;

public class HomePage extends AppCompatActivity {
    AdapterCategories adapter;
    RecyclerView recyclerView1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page);

        BottomNavigationView bottomNavigationView = findViewById(R.id.bottom_nav);

        recyclerViewCategory();
        bottomNavigationView.setOnNavigationItemSelectedListener(navListener);

        getSupportFragmentManager().beginTransaction().replace(R.id.fragmentHome, new HomeFragment()).commit();


    }

    private BottomNavigationView.OnNavigationItemSelectedListener navListener = new BottomNavigationView.OnNavigationItemSelectedListener() {
        @Override
        public boolean onNavigationItemSelected(MenuItem item) {
            Fragment selectedFragment = null;
            switch (item.getItemId()) {
                case R.id.action_home:
                    selectedFragment = new HomeFragment();
                    break;
                case R.id.action_cart:
                    selectedFragment = new CartFragment();
                    break;
                case R.id.action_favorite:
                    selectedFragment = new FavoriteFragment();
                    break;
                case R.id.action_notification:
                    selectedFragment = new NotificationFragment();
                    break;
                case R.id.action_profile:
                    selectedFragment = new ProfileFragment();
                    break;
            }
            getSupportFragmentManager().beginTransaction().replace(R.id.fragmentHome, selectedFragment).commit();
            return true;
        }
    };

//    private void addRecyclerViewCategories() {
//        recyclerView1 = findViewById(R.id.homeRecyclerview1);
//        recyclerView1.setLayoutManager(new LinearLayoutManager(HomePage.this, LinearLayoutManager.HORIZONTAL, false));
//        adapter= new AdapterCategories(getListCategories());
//        recyclerView1.setAdapter(adapter);
//    }

//    private List<Categories> getListCategories() {
//        ArrayList<Categories> categories = new ArrayList<>();
//        categories.add(new Categories("FastFood", R.drawable.fastfood));
//        categories.add(new Categories("Pizza", R.drawable.pizza1));
//        categories.add(new Categories("Coffee", R.drawable.cf));
//        categories.add(new Categories("Ice Cream", R.drawable.icecream));
//        categories.add(new Categories("Sushi", R.drawable.sushi));
//        categories.add(new Categories("Đồ uống", R.drawable.douong));
//        return categories;
//
//    }
    private void recyclerViewCategory() {
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);
        recyclerView1 = findViewById(R.id.homeRecyclerview1);
        recyclerView1.setLayoutManager(linearLayoutManager);

        ArrayList<Categories> categoryList = new ArrayList<>();
        categoryList.add(new Categories("Coffee", "cf"));
        categoryList.add(new Categories("Sushi", "sushi"));
        categoryList.add(new Categories("FastFood", "fastfood"));
        categoryList.add(new Categories("Ice Cream", "icecream"));
        categoryList.add(new Categories("Pizza", "pizza"));

        adapter = new AdapterCategories(categoryList);
        recyclerView1.setAdapter(adapter);
    }
}