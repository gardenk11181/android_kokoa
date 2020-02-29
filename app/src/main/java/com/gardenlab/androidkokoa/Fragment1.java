package com.gardenlab.androidkokoa;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class Fragment1 extends Fragment {
    RecyclerView recyclerView;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        ViewGroup rootView = (ViewGroup) inflater.inflate(R.layout.fragment1,container,false);

        recyclerView = rootView.findViewById(R.id.recyclerView);

        LinearLayoutManager layoutManager = new LinearLayoutManager(getContext(), LinearLayoutManager.VERTICAL, false);
        recyclerView.setLayoutManager(layoutManager);

        FriendAdapter adapter = new FriendAdapter();
        adapter.addFriend(new Friend());
        adapter.addFriend(new Friend());
        adapter.addFriend(new Friend());
        adapter.addFriend(new Friend());
        adapter.addFriend(new Friend());
        adapter.addFriend(new Friend());
        adapter.addFriend(new Friend());
        adapter.addFriend(new Friend());
        adapter.addFriend(new Friend());
        adapter.addFriend(new Friend());
        adapter.addFriend(new Friend());
        adapter.addFriend(new Friend());
        adapter.addFriend(new Friend());
        adapter.addFriend(new Friend());
        adapter.addFriend(new Friend());
        recyclerView.setAdapter(adapter);

        return rootView;
    }
}
