package recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.activitytest.R;

import java.util.ArrayList;
import java.util.List;

public class RecyclerViewActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private List<FristDares>list = new ArrayList<>();
    private RvAdapter rvAdapter = new RvAdapter(list);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler_view);
        recyclerView = findViewById(R.id.rv);

        RecyclerView.LayoutManager layoutManager= new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(rvAdapter);

        list.add(new FristDares("项目一"));
        list.add(new FristDares("项目二"));
        list.add(new FristDares("项目三"));
        list.add(new FristDares("项目四"));
        list.add(new FristDares("项目五"));
        list.add(new FristDares("项目六"));
        list.add(new FristDares("项目七"));
        list.add(new FristDares("项目八"));
        list.add(new FristDares("项目九"));
        list.add(new FristDares("项目十"));

        rvAdapter.notifyDataSetChanged();
    }
}