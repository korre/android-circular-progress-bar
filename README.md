# Circular Progress Bar
<img src="http://kmdev.se/img/gh-cpb.png" width="300" />

Simple single android view component that can be used to showing a round progress bar. 
It can be customized with size, stroke size, colors and text etc. See image for some example.
**Progress change will be animated**.

##How to use
Add it to your XML like this (or programmatically by code).
The smallest size specified for width and height will be used as diameter of the circle.
```
<se.kmdev.circularprogressbar.CircularProgressBar
        android:id="@+id/circularProgress"
        android:layout_width="180dp"
        android:layout_height="180dp"/>
```

You can change the progress calling (with a value between 0 and 100):
```
public void setProgress(int progress)
```

The progress bar is customizable by changing any of the available settings
```
public void setProgressColor(int color)
public void setProgressWidth(int width)
public void setTextColor(int color)
public void showProgressText(boolean show)
public void useRoundedCorners(boolean roundedCorners)
```

Good luck.
