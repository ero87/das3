package com.example.student.week_1_lesson_2;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ListView;

import java.util.ArrayList;

public class PlayerActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_posts);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        ArrayList<Player> playersList = new ArrayList<>();
        Player player1 = new Player();
        player1.setName("Mxitaryan");
        player1.setClubName("FC Arsenal");
        player1.setImageUrl("https://mediamag.am/wp-content/uploads/2018/01/26993353_1724195594298926_2018388502798082203_n.jpg");

        Player player2 = new Player();
        player2.setName("Messi");
        player2.setClubName("FC Bareselon");
        player2.setImageUrl("http://greece.greekreporter.com/files/lionel-messi-barcelona.jpg");

        playersList.add(player1);
        playersList.add(player2);
        playersList.add(player1);
        playersList.add(player1);
        playersList.add(player1);
        playersList.add(player1);
        playersList.add(player1);

        //adapter

        final PlayersAdapter playersAdapter = new PlayersAdapter(this, R.layout.player_ithem_view, playersList);

        final ListView listView =(ListView) findViewById(R.id.postsList);
        listView.setAdapter(playersAdapter);


    }
}
