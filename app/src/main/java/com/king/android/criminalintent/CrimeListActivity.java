package com.king.android.criminalintent;

import android.support.v4.app.Fragment;

/**
 * Created by yanj on 2018/1/5.
 */

public class CrimeListActivity extends SingleFragmentActivity {
    @Override
    protected Fragment createFragment() {
        return new CrimeListFragment();
    }
}
