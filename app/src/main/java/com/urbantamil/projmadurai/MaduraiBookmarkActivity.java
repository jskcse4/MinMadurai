/*
This code is released under MIT License
(C) 2016-2017, Ezhil Language Foundation
<ezhillang@gmail.com>
*/
package com.urbantamil.projmadurai;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

/**
 * Created by muthu on 9/7/2016.
 */
public class MaduraiBookmarkActivity extends AppCompatActivity {
    public static String TAG = "MaduraiBookmarkActivity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Bundle b = new Bundle();
        Log.d(TAG, "setting field " + BookListActivity.ARG_FILTER_BY + " to " + String.valueOf(MaduraiFilter.FIELD_BOOKMARK));
        b.putInt(BookListActivity.ARG_FILTER_BY, MaduraiFilter.FIELD_BOOKMARK);
        Intent intent = new Intent(this,BookListActivity.class);
        intent.putExtras(b);
        startActivity(intent);
        this.finish();
    }

/**
 *     @Override
protected void onStop() {
super.onStop();
Log.d(TAG, "Saving MaduraiBookmarks to the app");
MaduraiBookmark.getManager(this).save(this);
}
 */
};
