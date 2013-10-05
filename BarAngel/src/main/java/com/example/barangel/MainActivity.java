package com.example.barangel;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.Locale;

// my classes

public class MainActivity extends FragmentActivity {

    /**
     * The {@link android.support.v4.view.PagerAdapter} that will provide
     * fragments for each of the sections. We use a
     * {@link android.support.v4.app.FragmentPagerAdapter} derivative, which
     * will keep every loaded fragment in memory. If this becomes too memory
     * intensive, it may be best to switch to a
     * {@link android.support.v4.app.FragmentStatePagerAdapter}.
     */
    SectionsPagerAdapter mSectionsPagerAdapter;

    /**
     * The {@link ViewPager} that will host the section contents.
     */
    ViewPager mViewPager;

    public String[] listS ={"item1","item2","item3"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // Create the adapter that will return a fragment for each of the three
        // primary sections of the app.
        mSectionsPagerAdapter = new SectionsPagerAdapter(getSupportFragmentManager());

        // Set up the ViewPager with the sections adapter.
        mViewPager = (ViewPager) findViewById(R.id.pager);
        mViewPager.setAdapter(mSectionsPagerAdapter);

        // bar list view
        ListView barList = (ListView)findViewById(R.id.listView);
        //barList.setAdapter(new ArrayAdapter<String>(this, R.layout.,R.id.labeld, listS));


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
    

    /**
     * A {@link FragmentPagerAdapter} that returns a fragment corresponding to
     * one of the sections/tabs/pages.
     */
    public class SectionsPagerAdapter extends FragmentPagerAdapter {

        public SectionsPagerAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int position) {
            // getItem is called to instantiate the fragment for the given page.
            // Return a DummySectionFragment (defined as a static inner class
            // below) with the page number as its lone argument.
            Fragment barfragment = new BarSectionFragment();
            Fragment beerfragment = new BeerSectionFragment();
            Fragment payfragment = new PaySectionFragment();
            Bundle args = new Bundle();

            switch (position){
                case 0:

                    return barfragment;
                case 1:
                    return beerfragment;
                case 2:
                    return payfragment;
            }
            return null;

            /*
            // Old code
            Fragment fragment = new DummySectionFragment();
            Bundle args = new Bundle();
            args.putInt(DummySectionFragment.ARG_SECTION_NUMBER, position + 1);
            fragment.setArguments(args);
            return fragment;*/
        }

        @Override
        public int getCount() {
            // Show 3 total pages.
            return 3;
        }

        @Override
        public CharSequence getPageTitle(int position) {
            Locale l = Locale.getDefault();
            switch (position) {
                case 0:
                    return getString(R.string.title_section1).toUpperCase(l);
                case 1:
                    return getString(R.string.title_section2).toUpperCase(l);
                case 2:
                    return getString(R.string.title_section3).toUpperCase(l);
            }
            return null;
        }
    }

    /**
     * A dummy fragment representing a section of the app, but that simply
     * displays dummy text.
     */
    public static class DummySectionFragment extends Fragment {
        /**
         * The fragment argument representing the section number for this
         * fragment.
         */
        public static final String ARG_SECTION_NUMBER = "section_number";

        public DummySectionFragment() {
        }

        // @TODO: This is where I change the information in each Fragment

        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                                 Bundle savedInstanceState) {
            View rootView = inflater.inflate(R.layout.fragment_main_dummy, container, false);
            TextView dummyTextView = (TextView) rootView.findViewById(R.id.section_label);
            dummyTextView.setText(Integer.toString(getArguments().getInt(ARG_SECTION_NUMBER)));
            return rootView;
        }

        public void setText(String item)
        {
            TextView txtview = (TextView) getView().findViewById(R.id.pager_title_strip);
            txtview.setText(item);
        }
    }

    /*
    @TODO: Fix the issue with the list view
     */
    public static class BarSectionFragment extends Fragment
    {

        public BarSectionFragment()
        {

        }

        public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
            View rootView;
            rootView = inflater.inflate(R.layout.fragment_main_bar, container, false);
            /*BarClass mBar = new BarClass();
            rootView = inflater.inflate(R.layout.fragment_main_bar, container, false);
            this.setListAdapter(new ArrayAdapter<String>(getActivity(), R.id.list, mBar.getBarList()));
*/
            TextView txtView = (TextView) rootView.findViewById(R.id.section_label);
            txtView.setText("Choose bar");
            return rootView;
        }
    }


    public static class BeerSectionFragment extends Fragment
    {

        public BeerSectionFragment()
        {

        }

        public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){

            View rootView = inflater.inflate(R.layout.fragment_main_beer, container, false);
            TextView barTextView = (TextView) rootView.findViewById(R.id.section_label);
            return rootView;
        }
    }


    public static class PaySectionFragment extends Fragment
    {
        public PaySectionFragment()
        {

        }

        public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){

            View rootView = inflater.inflate(R.layout.fragment_main_pay, container, false);
            return rootView;
        }
    }

}
