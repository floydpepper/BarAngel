package com.example.barangel;

/**
 * Created by mlynch on 01/09/13.
 */
public class BarClass {
    int mIdbar;
    String mName;
    String mAddress;
    int mRating;

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
