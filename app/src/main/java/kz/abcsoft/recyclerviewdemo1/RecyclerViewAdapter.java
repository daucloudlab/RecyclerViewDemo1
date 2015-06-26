package kz.abcsoft.recyclerviewdemo1;

import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;


public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.MyViewHolder> {
    private List<Cat> mCatList;

    public RecyclerViewAdapter(List<Cat> catList) {
        this.mCatList = catList;
    }

    @Override
    public RecyclerViewAdapter.MyViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.recyclerview_item, viewGroup, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(MyViewHolder viewHolder, int i) {
        Cat cat = mCatList.get(i);

        viewHolder.mNameTextView.setText(cat.getName());
        viewHolder.mSubtitleTextView.setText(cat.getSubtitle());

        Log.d("ПРОВЕРКА: ", "Позиция: " + i);
    }

    @Override
    public int getItemCount() {
        return mCatList.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder {

        private TextView mNameTextView;
        private TextView mSubtitleTextView;

        public MyViewHolder(View itemView) {
            super(itemView);
            mNameTextView = (TextView) itemView.findViewById(R.id.textViewLarge);
            mSubtitleTextView = (TextView) itemView.findViewById(R.id.textViewSmall);
        }
    }
}