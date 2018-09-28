package com.example.c4q.aerisweatherapp.presentation;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.support.annotation.NonNull;
import android.support.v4.content.res.ResourcesCompat;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.c4q.aerisweatherapp.R;
import com.example.c4q.aerisweatherapp.data.Periods;

import java.util.List;

/**
 * Created by c4q on 9/27/18.
 */

public class WeatherAdapter extends RecyclerView.Adapter<WeatherAdapter.WeatherViewHolder> {
    private List<Periods> periodsList;


    public WeatherAdapter(List<Periods> periodsList) {
        this.periodsList = periodsList;
    }

    @Override
    public WeatherViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.weather_card_view, parent, false);
        return new WeatherViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull WeatherViewHolder holder, int position) {
        holder.onBind(periodsList.get(position));
    }

    @Override
    public int getItemCount() {
        return periodsList.size();
    }

    public class WeatherViewHolder extends RecyclerView.ViewHolder {
        private CardView cardView;
        private ImageView icon;
        private TextView date;
        private TextView maxTemp;
        private TextView lowTemp;
        Context context;

        public WeatherViewHolder(View itemView) {
            super(itemView);
            context = itemView.getContext();
            cardView = itemView.findViewById(R.id.card_view);
            icon = itemView.findViewById(R.id.image_view);
            date = itemView.findViewById(R.id.date_view);
            maxTemp = itemView.findViewById(R.id.maxtemp_view);
            lowTemp = itemView.findViewById(R.id.lowtemp_view);
        }

        public void onBind(Periods periods) {
            String iconName = periods.getIcon();
//            icon.setImageDrawable(getDrawable(iconName));

            date.setText(periods.getDateTimeISO().toString());
            maxTemp.setText(periods.getMaxTempF() + "");
            lowTemp.setText(periods.getMinTempF()+"");

        }

        private Drawable getDrawable(String name) {
            int resourceId = context.getResources().getIdentifier(name, "drawable", context.getPackageName());
            return context.getResources().getDrawable(resourceId);
        }
    }
}
