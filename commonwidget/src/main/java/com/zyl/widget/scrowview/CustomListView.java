package com.zyl.widget.scrowview;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ListView;

/**
 * @author koneloong koneloong_gmail_com
 *         Create on 2014/10/27 15:04
 * @version V1.0.0
 */
public class CustomListView extends ListView {
        public CustomListView(Context context) {
            super(context);
        }

        public CustomListView(Context context, AttributeSet attrs) {
            super(context, attrs);
        }

        public CustomListView(Context context, AttributeSet attrs,
                              int defStyle) {
            super(context, attrs, defStyle);
        }

        @Override
       
        protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
            int expandSpec = MeasureSpec.makeMeasureSpec(Integer.MAX_VALUE >> 2,
                    MeasureSpec.AT_MOST);
             
            	  
               
          
            
            super.onMeasure(widthMeasureSpec, expandSpec);
        }
}
