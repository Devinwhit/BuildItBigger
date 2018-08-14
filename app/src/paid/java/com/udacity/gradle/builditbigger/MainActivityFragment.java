package com.udacity.gradle.builditbigger;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.devinwhitney.android.jokeactivity.JokeActivity;

/**
 * Created by devin on 8/14/2018.
 */

public class MainActivityFragment extends Fragment {

    private static final String JOKES_EXTRA = "jokes_extra";
    private String mJoke;

    public MainActivityFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_main, container, false);

        Button jokeButton = root.findViewById(R.id.joke_button);

        jokeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                new JokeAsync().execute(MainActivityFragment.this);
            }
        });
        return root;
    }

    public void setJoke(String joke) {
        mJoke = joke;
        Intent intent = new Intent(getActivity(), JokeActivity.class);
        intent.putExtra(JOKES_EXTRA, joke);
        startActivity(intent);
    }
}
