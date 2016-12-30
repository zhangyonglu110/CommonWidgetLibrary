package com.zyl.widget.banner;

import android.view.View;

/**
 * Created by zhangyonglu on 2016/7/22 0005.
 */

public class AccordionTransformer extends ZTransformer {

	@Override
	protected void onTransform(View view, float position) {
		view.setPivotX(position < 0 ? 0 : view.getWidth());
		view.setScaleX(position < 0 ? 1f + position : 1f - position);
	}

}
