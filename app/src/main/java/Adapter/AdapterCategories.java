package Adapter;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.example.orderfood.R;

import java.util.ArrayList;
import java.util.List;

import Domain.Categories;
import Home.HomeFragment;

public class AdapterCategories extends RecyclerView.Adapter<AdapterCategories.CategoriesViewHolder> {
    Context context;
    private List<Categories> categoriesList;

    public AdapterCategories(Context context, List<Categories> categoriesList) {
        this.context = context;
        this.categoriesList = categoriesList;
    }

    public AdapterCategories(HomeFragment homeFragment, ArrayList<Categories> categoryList) {
    }

    //    public void setData(List<Categories> categoriesList){
//        this.categoriesList=categoriesList;
//        notifyDataSetChanged();
//
//    }
    @Override
    public CategoriesViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_categories, parent, false);
        return new CategoriesViewHolder(view);
    }

    @Override
    public void onBindViewHolder(CategoriesViewHolder holder, int position) {
        Categories categories = categoriesList.get(position);


        holder.tvTitle.setText(categories.getTitle());
        holder.imgview.setImageDrawable(getDrawable(context, position));


    }

    public Drawable getDrawable(Context context, int position) {
        Resources resource = context.getResources();
        final int resourceID = resource.getIdentifier(categoriesList.get(position).getPicture(), "drawable", context.getPackageName());
        Drawable drawable = resource.getDrawable(resourceID);
        return drawable;
    }

    @Override
    public int getItemCount() {
        return categoriesList.size();
    }

    public class CategoriesViewHolder extends RecyclerView.ViewHolder {
        ImageView imgview;
        TextView tvTitle;

        public CategoriesViewHolder(View itemView) {
            super(itemView);
            imgview = itemView.findViewById(R.id.imgCategories);
            tvTitle = itemView.findViewById(R.id.tvCategories);
        }
    }
}
