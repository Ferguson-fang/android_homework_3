package vp_fm_tl;
/*
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.activitytest.R;

import java.util.List;

import recyclerview.FristDares;

public class FristAdapter extends RecyclerView.Adapter<FristAdapter.FristViewHolder>{
    private List<vp_fm_tl.FristDates> list;

    public FristAdapter(List<FristDates> list) {
        this.list = list;
    }

    public class FristViewHolder extends RecyclerView.ViewHolder {
        public TextView tvRv;
        public FristViewHolder(@NonNull View itemView) {
            super(itemView);
            tvRv = itemView.findViewById(R.id.level_2_rv);
        }
    }
    @NonNull
    @Override
    public FristViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new FristViewHolder(LayoutInflater.from(parent.getContext()).
                inflate(R.layout.activity_frist_page,parent,false));

    }

    @Override
    public void onBindViewHolder(@NonNull FristViewHolder holder, int position) {
        vp_fm_tl.FristDates fristDates =list.get(position);

        holder.tvRv.setText(fristDates.getName());
    }

    @Override
     public int getItemCount() {

        return list.size();
    }


}
*/