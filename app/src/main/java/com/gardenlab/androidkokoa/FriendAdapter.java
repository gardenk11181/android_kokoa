package com.gardenlab.androidkokoa;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class FriendAdapter extends RecyclerView.Adapter<FriendAdapter.ViewHolder> {
    ArrayList<Friend> friends = new ArrayList<>();

    static class ViewHolder extends RecyclerView.ViewHolder {
        ImageView profileImg;
        TextView name;
        TextView profileMsg;

        public ViewHolder(View friendView) {
            super(friendView);

//          profileImg Not Yet
            name = friendView.findViewById(R.id.name);
            profileMsg = friendView.findViewById(R.id.profileMsg);

        }

        public void setFriend(Friend friend) {
            name.setText(friend.getName());
            profileMsg.setText(friend.getProfileMsg());
        }
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View friendView = inflater.inflate(R.layout.friend_row, parent, false);

        return new ViewHolder(friendView);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Friend friend = friends.get(position);
        holder.setFriend(friend);
    }

    @Override
    public int getItemCount() {
        return friends.size();
    }

    // 부가적인 메서드

    public void addFriend(Friend friend) {
        friends.add(friend);
    }

    public void setFriends(ArrayList<Friend> friends) {
        this.friends = friends;
    }

    public Friend getItem(int position) {
        return friends.get(position);
    }

    public void setItem(int position, Friend friend) {
        friends.set(position, friend);
    }
}
