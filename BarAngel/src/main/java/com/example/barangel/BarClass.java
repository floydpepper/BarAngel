package com.example.barangel;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by mlynch on 01/09/13.
 */
public class BarClass {
    int mIdbar;
    String mName;
    String mAddress;
    int mRating;

    List<String> barList = new ArrayList<String>();

    private void initList()
    {
        barList.add("Ronnies Local");
        barList.add("Pour Girl");
    }

    public String[] getBarList()
    {
        return (String[]) barList.toArray();
    }
    public String getName()
    {
        return mName;
    }

    public String getAddress()
    {
        return mAddress;
    }

    public int getRating()
    {
        return mRating;
    }

    public int getIdbar()
    {
        return mIdbar;
    }

    public void setIdbar(int idbar)
    {
        this.mIdbar = idbar;
    }

    public void setName(String name)
    {
        this.mName = name;
    }
}
