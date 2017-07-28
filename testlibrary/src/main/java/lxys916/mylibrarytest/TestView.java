package lxys916.mylibrarytest;

import android.content.Context;
import android.widget.Toast;

/**
 * Created by lyxs9 on 2017/7/28.
 */

public class TestView {
    public static void test(Context context, String str) {
        Toast.makeText(context, str, Toast.LENGTH_SHORT).show();
    }
}
