package leeyip.pandatv.ui.home.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.util.Log;

import java.util.List;

import leeyip.pandatv.model.logic.home.bean.HomeColumnMoreTwoCate;
import leeyip.pandatv.ui.home.fragment.HomeColumnMoreAllListFragment;
import leeyip.pandatv.ui.home.fragment.HomeColumnMoreOtherListFragment;

/**
 * Created by Administrator on 2017/10/18/018.
 */

public class HomeColumnMoreTowCateAdapter extends FragmentStatePagerAdapter {

    private List<HomeColumnMoreTwoCate> mHomeColumnMoreTwoCate;
    private String[] mTiltle;
    private FragmentManager mFragmentManager;
    private String cate_id;

    public HomeColumnMoreTowCateAdapter(FragmentManager fm, String cate_id, List<HomeColumnMoreTwoCate> mHomeColumnMoreTwoCate, String[] title) {
        super(fm);
        this.cate_id = cate_id;
        this.mFragmentManager = fm;
        this.mHomeColumnMoreTwoCate = mHomeColumnMoreTwoCate;
        this.mTiltle = title;
        String s = cate_id;
        for (int i = 0; i < mHomeColumnMoreTwoCate.size(); i++) {
            s += mHomeColumnMoreTwoCate.get(i).toString() + "----";
        }
        Log.e("输出",s);
    }

    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return HomeColumnMoreAllListFragment.getInstance(cate_id);
        }
        return HomeColumnMoreOtherListFragment.getInstance(mHomeColumnMoreTwoCate.get(position - 1).getId());
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return mTiltle[position];
    }

    @Override
    public int getCount() {
        return mTiltle.length;
    }
}
