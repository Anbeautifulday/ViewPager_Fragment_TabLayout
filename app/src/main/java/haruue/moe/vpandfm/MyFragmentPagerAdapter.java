package haruue.moe.vpandfm;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.List;

/**
 * Created by 晴天 on 2016/12/8.
 */

public class MyFragmentPagerAdapter extends FragmentPagerAdapter {

    private List<Fragment> lists;
    private List<String> titles;

    public MyFragmentPagerAdapter(FragmentManager fm, List<Fragment> lists, List<String> titles) {
        super(fm);
        this.lists = lists;
        this.titles = titles;
    }

    @Override
    public Fragment getItem(int position) {
        return lists.get(position);
    }

    @Override
    public int getCount() {
        return lists.size();
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return titles.get(position);
    }
}
