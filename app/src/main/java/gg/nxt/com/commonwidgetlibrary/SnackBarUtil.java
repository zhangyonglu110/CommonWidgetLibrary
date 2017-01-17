package gg.nxt.com.commonwidgetlibrary;

import android.view.View;

import com.zyl.widget.snackbar.TSnackbar;


/**
 * Created by Administrator on 2016/9/26 0026.
 */

public class SnackBarUtil {
    public static void showShort(View view, String msg){
        TSnackbar.make(view,msg, TSnackbar.LENGTH_SHORT,true).show();
    }
    public static void showShort(View view, int msgres){
        TSnackbar.make(view,msgres, TSnackbar.LENGTH_SHORT,true).show();
    }
    public static void showLong(View view, String msg){
        TSnackbar.make(view,msg, TSnackbar.LENGTH_LONG,true).show();
    }
    public static void showLong(View view, int msgres){
        TSnackbar.make(view,msgres, TSnackbar.LENGTH_LONG,true).show();
    }
    public static void showShortNoBar(View view, String msg){
        TSnackbar.make(view,msg, TSnackbar.LENGTH_SHORT,false).show();
    }

}
