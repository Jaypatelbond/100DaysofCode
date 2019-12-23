package com.example.acrepairpreview.adapters;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.acrepairpreview.R;
import com.example.acrepairpreview.activities.SettingsActivity;
import com.example.acrepairpreview.model.OurServicesList;

import java.util.List;

/**
 * @author Jaypatelbond
 */

public class OurServicesAdapter extends RecyclerView.Adapter<OurServicesAdapter.ViewHolder> {
    private Context context;
    List<OurServicesList> ourServicesLists;

    OurServicesAdapter(Context context, List<OurServicesList> ourServicesLists) {
        this.ourServicesLists = ourServicesLists;
        this.context = context;
    }


    @NonNull
    @Override
    public OurServicesAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ViewHolder(LayoutInflater.from(context).inflate(R.layout.our_services, null));

    }

    @Override
    public void onBindViewHolder(@NonNull OurServicesAdapter.ViewHolder holder, int position) {
         holder.textViewServices.setText(ourServicesLists.get(position).getTitle());
         holder.imageViewOurServices.setImageResource(ourServicesLists.get(position).getServiceImage());

             holder.llServices.setOnClickListener(new View.OnClickListener() {
                 @Override
                 public void onClick(View v) {
                     if(ourServicesLists.get(position).getTitle().equalsIgnoreCase("More")){
                         context.startActivity(new Intent(context, SettingsActivity.class));
                     }
                 }
             });
    }

    @Override
    public int getItemCount() {
        return ourServicesLists.size();
    }

    static class ViewHolder extends RecyclerView.ViewHolder {
        LinearLayout llServices;
        TextView textViewServices;
        ImageView imageViewOurServices;

        ViewHolder(@NonNull View itemView) {
            super(itemView);
            llServices = itemView.findViewById(R.id.llServices);
            textViewServices = itemView.findViewById(R.id.textViewServices);
            imageViewOurServices = itemView.findViewById(R.id.imageViewOurServices);
        }
    }
}
