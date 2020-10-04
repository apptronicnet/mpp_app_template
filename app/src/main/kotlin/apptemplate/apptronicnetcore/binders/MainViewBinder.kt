package apptemplate.apptronicnetcore.binders

import android.view.View
import apptemplate.apptronicnetcore.R
import apptemplate.apptronicnetcore.common.viewmodel.MainViewModel
import kotlinx.android.synthetic.main.main.view.*
import net.apptronic.core.android.viewmodel.ViewBinder
import net.apptronic.core.android.viewmodel.bindings.bindText

class MainViewBinder : ViewBinder<MainViewModel>() {

    override var layoutResId: Int? = R.layout.main

    override fun onBindView(view: View, viewModel: MainViewModel) {
        with(view) {
            bindText(helloText, viewModel.text)
        }
    }

}