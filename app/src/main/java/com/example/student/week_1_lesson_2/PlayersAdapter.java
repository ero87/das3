package com.example.student.week_1_lesson_2;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.List;

public class PlayersAdapter extends ArrayAdapter<Player> {

    private Context context;
    private List<Player> list;
    private int layoutId;

    public PlayersAdapter(Context context, int resource, List<Player> list) {
        super(context, resource, list);
        this.context = context;
        this.list = list;
        layoutId = resource;
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItem = convertView;
        if (listItem == null) {
            listItem = LayoutInflater.from(context).inflate(layoutId, parent, false);
        }
        final Player player =(Player) list.get(position);
        ImageView playerImage = (ImageView) listItem.findViewById(R.id.player_image);
        TextView playerName = (TextView) listItem.findViewById(R.id.player_name);
        TextView playerClub = (TextView) listItem.findViewById(R.id.player_club);

        playerName.setText(player.getName());
        playerClub.setText(player.getClubName());
        Picasso.with(context).load(player.getImageUrl()).into(playerImage);
        return listItem;
    }
// listItem-i vra onClichlisner
}
