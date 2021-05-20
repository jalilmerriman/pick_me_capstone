package com.example.pickme;

import android.content.Context;
import android.view.LayoutInflater;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/*public class Adapter extends RecyclerView.Adapter<Adapter.ViewHolder> {
    private Context mCtx;
    private List<Business> businessList;


    public Adapter(Context mCtx, List<Business> univList){
        this.mCtx = mCtx;
        this.businessList = businessList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(mCtx).inflate(R.layout.list_layout,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Business business = businessList.get(position);
        holder.imageView.setImageDrawable(mCtx.getResources().getDrawable(business.getImage()) );
        holder.businessName.setText(business.businessName);
        holder.location.setText("Location: " + business.location );
        holder.industry.setText("Industry: " + business.industry );
        holder.employeeCount.setText("Employee Count: " + business.employeeCount );
    }

    /*@Override
    public int getItemCount() {
        return businessList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        ImageView imageView;
        TextView businessName, location, industry, employeeCount;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            businessName = itemView.findViewById(R.id.businessName);
            location = itemView.findViewById(R.id.gpaReq);
            industry = itemView.findViewById(R.id.satReq);
            employeeCount = itemView.findViewById(R.id.actReq);
            imageView = itemView.findViewById(R.id.imageView);
        }
    }
}*/
