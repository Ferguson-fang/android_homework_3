package com.example.activitytest;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.google.android.material.tabs.TabLayout;

import java.util.ArrayList;
import java.util.List;

public class TabLayoutDemoActivity extends AppCompatActivity {
    TabLayout tabLayout;
    ViewPager viewPager;
    static List<Fragment> fragmentList = new ArrayList<>();
    static List<String> fragmentTitle = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tab_layout_demo);

        tabLayout = findViewById(R.id.tl_tab_layout);
        viewPager = findViewById(R.id.vp_tab_layout);

        fragmentTitle.add("碎片一");
        fragmentTitle.add("碎片二");
        fragmentList.add(new My2FragmentActivity());
        fragmentList.add(new myFragmentActivity());

        viewPager.setAdapter(new ViewPagerAdapter(getSupportFragmentManager(),
                ViewPagerAdapter.BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT));
    tabLayout.setupWithViewPager(viewPager);

    tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
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


 class ViewPagerAdapter extends FragmentPagerAdapter {
        ViewPagerAdapter(FragmentManager fm, int behavior) {
        super(fm, behavior);
    }

    @Override
    public int getCount() {
        return fragmentList.size();
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        return fragmentList.get(position);
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return fragmentTitle.get(position);
    }
    }
}