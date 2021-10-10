package Adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.example.orderfood.R;

import java.util.List;

import Domain.Categories;

public class AdapterCategories extends RecyclerView.Adapter<AdapterCategories.CategoriesViewHolder> {
    private List<Categories> categoriesList;


    public AdapterCategories(List<Categories> categoriesList) {
        this.categoriesList = categoriesList;
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
        holder.imgview.setImageResource(Integer.parseInt(categories.getPicture()));
        holder.tvTitle.setText(categories.getTitle());

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
