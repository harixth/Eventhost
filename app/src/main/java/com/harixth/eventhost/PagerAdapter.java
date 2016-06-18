package com.harixth.eventhost;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

/**
 * Created by Harixth on 6/11/16.
 */

public class PagerAdapter extends FragmentStatePagerAdapter{
    public PagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {

        Fragment frag=null;
        switch (position){
            case 0:
                frag=new EventFragment();
                break;
            case 1:
                frag=new NotificationFragment();
                break;
            case 2:
                frag=new ProfileFragment();
                break;
        }
        return frag;
    }

    @Override
    public int getCount() {
        return 3;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        String section=" ";
        switch (position){
            case 0:
                section="Event";
                break;
            case 1:
                section="Notification";
                break;
            case 2:
                section="Profile";
                break;
        }

        return section;
    }
}