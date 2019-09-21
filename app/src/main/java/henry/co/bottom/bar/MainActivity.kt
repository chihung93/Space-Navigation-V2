package henry.co.bottom.bar

import android.Manifest
import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.annotation.StringRes
import androidx.core.view.isVisible
import com.karumi.dexter.Dexter
import com.karumi.dexter.MultiplePermissionsReport
import com.karumi.dexter.PermissionToken
import com.karumi.dexter.listener.PermissionRequest
import com.karumi.dexter.listener.multi.MultiplePermissionsListener
import henry.co.bottom.navigtion.SpaceItem
import henry.co.bottom.navigtion.SpaceOnClickListener
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initBottomNavigation(savedInstanceState)
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        spaceNavigationView.onSaveInstanceState(outState)
    }

    private fun initBottomNavigation(savedInstanceState: Bundle?) {
        spaceNavigationView.initWithSaveInstanceState(savedInstanceState)
        spaceNavigationView.setCentreButtonSelectable(true)
        spaceNavigationView.addSpaceItem(
            SpaceItem(
                getStringRes(R.string.today),
                R.drawable.ic_favor_disable
            )
        )
        spaceNavigationView.addSpaceItem(
            SpaceItem(
                getStringRes(R.string.favour),
                R.drawable.ic_favor_disable
            )
        )
        spaceNavigationView.addSpaceItem(
            SpaceItem(
                getStringRes(R.string.cards),
                R.drawable.ic_favor_disable
            )
        )
        spaceNavigationView.addSpaceItem(
            SpaceItem(
                getStringRes(R.string.account),
                R.drawable.ic_favor_disable
            )
        )
        spaceNavigationView.setSpaceOnClickListener(object : SpaceOnClickListener {
            override fun onCentreButtonClick() {
                Dexter.withActivity(this@MainActivity)
                    .withPermissions(
                        Manifest.permission.ACCESS_COARSE_LOCATION
                        ,Manifest.permission.ACCESS_FINE_LOCATION)

                    .withListener(object: MultiplePermissionsListener {
                        override fun onPermissionsChecked(report: MultiplePermissionsReport?) {
                            report?.let {
                                if(report.areAllPermissionsGranted()){
                                    toast("OK")
                                }

                            }
                        }

                        override fun onPermissionRationaleShouldBeShown(
                            permissions: MutableList<PermissionRequest>?,
                            token: PermissionToken?
                        ) {

                        }

                    })
                    .withErrorListener {
                        toast(it.name)
                    }
                    .check()
            }

            override fun onItemClick(itemIndex: Int, itemName: String) {
                toast("${itemIndex}  ${itemName}")
            }

            override fun onItemReselected(itemIndex: Int, itemName: String) {

            }
        })
        spaceNavigationView.setCentreButtonSelected()
    }
}

fun Context.getStringRes(@StringRes id: Int) = resources.getString(id)

fun Context?.toast(text: CharSequence, duration: Int = Toast.LENGTH_LONG) =
    this?.let { Toast.makeText(it, text, duration).show() }
