package vp_fm_tl;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.example.activitytest.R;

import com.google.android.material.tabs.TabLayout;

import java.util.ArrayList;
import java.util.List;


public class Vp_Fm_TlActivity extends AppCompatActivity {

    TabLayout tabLayout1;
    ViewPager viewPager1;
    List<Fragment> fragmentList1 = new ArrayList<>();
    List<String> fragmentTitle1 = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vp__fm__tl);

        tabLayout1 = findViewById(R.id.level_2_tl_tab_layout);
        viewPager1= findViewById(R.id.level_2_vp_tab_layout);

        fragmentTitle1.add("页面一");
        fragmentTitle1.add("页面二");
        fragmentTitle1.add("页面三");
        fragmentList1.add(new FristPageActivity());
        fragmentList1.add(new SecondPageActivity());
        fragmentList1.add(new ThirdPageActivity());

        viewPager1.setAdapter(new newAdapter(getSupportFragmentManager(),
                newAdapter.BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT));
        tabLayout1.setupWithViewPager(viewPager1);

        tabLayout1.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                //当选择卡进入选定状态时调用

            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {
                //当选择卡未进入选定状态时调用
            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {
                //当用户再次选择已选中的选择卡时调用。可以再这里刷新页面，实现点击选择卡后更改
            }
        });
    }

    class newAdapter extends FragmentPagerAdapter {
        newAdapter(FragmentManager fm, int behavior) {
            super(fm, behavior);
        }

        @Override
        public int getCount() {
            return fragmentList1.size();
        }

        @NonNull
        @Override
        public Fragment getItem(int position) {
            return fragmentList1.get(position);
        }

        @Nullable
        @Override
        public CharSequence getPageTitle(int position) {
            return fragmentTitle1.get(position);
        }
    }

}
