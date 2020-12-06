package recyclerview;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.activitytest.R;

import java.util.List;

public class RvAdapter extends RecyclerView.Adapter<RvAdapter.RvViewHolder>{
    private List<FristDares> list;

    public RvAdapter(List<FristDares> list) {
        this.list = list;
    }

    public class RvViewHolder extends RecyclerView.ViewHolder {
        public TextView tvRv;
        public RvViewHolder(@NonNull View itemView) {
            super(itemView);
            tvRv = itemView.findViewById(R.id.rv_tv);
        }
    }
    @NonNull
    @Override
    public RvViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new RvViewHolder(LayoutInflater.from(parent.getContext()).
                inflate(R.layout.activity_rv_item,parent,false));

    }

    @Override
    public void onBindViewHolder(@NonNull RvViewHolder holder, int position) {
        FristDares rvDates =list.get(position);

        holder.tvRv.setText(rvDates.getName());
    }

    @Override
     public int getItemCount() {

        return list.size();
    }


}
