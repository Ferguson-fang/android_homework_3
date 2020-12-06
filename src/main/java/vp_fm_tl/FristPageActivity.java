
package vp_fm_tl;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.activitytest.R;

import java.util.ArrayList;
import java.util.List;

import recyclerview.FristDares;


public class FristPageActivity extends Fragment {
    /*
    private RecyclerView recyclerView1;
    private List<vp_fm_tl.FristDates> list1 = new ArrayList<>();
    private FristAdapter fristAdapter = new FristAdapter(list1);
     */
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle saveInstanceState){
        View view = inflater.inflate(R.layout.activity_frist_page,container,false);
        return view;
    }
/*
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_frist_page);

        recyclerView1 = recyclerView1.findViewById(R.id.level_2_rv);

        RecyclerView.LayoutManager layoutManager= new LinearLayoutManager(this);
        recyclerView1.setLayoutManager(layoutManager);
        recyclerView1.setAdapter(fristAdapter);

        list1.add(new FristDates("项目一"));
        list1.add(new FristDates("项目二"));
        list1.add(new FristDates("项目三"));
        list1.add(new FristDates("项目四"));
        list1.add(new FristDates("项目五"));
        list1.add(new FristDates("项目六"));
        list1.add(new FristDates("项目七"));
        list1.add(new FristDates("项目八"));
        list1.add(new FristDates("项目九"));
        list1.add(new FristDates("项目十"));

        FristAdapter.notifyDataSetChanged();
}

    private void setContentView(int activity_frist_page) {

    }*/
    }
