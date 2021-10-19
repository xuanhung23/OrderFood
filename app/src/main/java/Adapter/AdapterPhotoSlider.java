package Adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.orderfood.R;

import java.util.List;

import Domain.PhotoSlider;

public class AdapterPhotoSlider extends RecyclerView.Adapter<AdapterPhotoSlider.PhotoViewholder> {
    List<PhotoSlider> photoSliders;

    public AdapterPhotoSlider(List<PhotoSlider> photoSliders) {
        this.photoSliders = photoSliders;
    }

    @Override
    public PhotoViewholder onCreateViewHolder( ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.item_imageslider,parent,false);
        return new  PhotoViewholder(view);
    }

    @Override
    public void onBindViewHolder(AdapterPhotoSlider.PhotoViewholder holder, int position) {
        PhotoSlider photoSlider=photoSliders.get(position);
        if(photoSlider== null){
            return;
        }
        holder.imgSlider.setImageResource(photoSlider.getResourceId());
    }

    @Override
    public int getItemCount() {
        return photoSliders.size();
    }

    public  class PhotoViewholder extends RecyclerView.ViewHolder{


        ImageView imgSlider;
        public PhotoViewholder(View itemView) {
            super(itemView);
            imgSlider=itemView.findViewById(R.id.imgSlider);
        }
    }
}
