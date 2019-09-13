package henry.co.bottom.navigtion

import android.content.Context
import android.view.MotionEvent

import com.google.android.material.floatingactionbutton.FloatingActionButton


class CentreButton(context: Context) : FloatingActionButton(context) {

    override fun onTouchEvent(ev: MotionEvent): Boolean {
        val result = super.onTouchEvent(ev)
        if (!result) {
            if (ev.action == MotionEvent.ACTION_UP) {
                cancelLongPress()
            }
            isPressed = false
        }
        return result
    }
}
