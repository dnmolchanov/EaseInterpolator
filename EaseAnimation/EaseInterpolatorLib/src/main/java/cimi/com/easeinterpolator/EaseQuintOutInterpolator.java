package cimi.com.easeinterpolator;

import android.view.animation.Interpolator;

/**
 * Created by cimi on 15/7/3.
 * <img src="../../../../../../docs/images/EaseQuintOutInterpolator.png"/>
 */

public class EaseQuintOutInterpolator implements Interpolator {

    public float getInterpolation(float input) {
        return (input - 1) * (input - 1) * (input - 1) * (input - 1) * (input - 1) + 1;
    }
}
