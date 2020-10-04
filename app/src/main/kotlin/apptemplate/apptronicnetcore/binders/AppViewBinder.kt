package apptemplate.apptronicnetcore.binders

import android.view.View
import apptemplate.apptronicnetcore.R
import apptemplate.apptronicnetcore.common.viewmodel.AppViewModel
import kotlinx.android.synthetic.main.app.view.*
import net.apptronic.core.android.viewmodel.ViewBinder
import net.apptronic.core.android.viewmodel.bindings.navigation.bindStackNavigator

class AppViewBinder : ViewBinder<AppViewModel>() {

    override var layoutResId: Int? = R.layout.app

    override fun onBindView(view: View, viewModel: AppViewModel) {
        with(view) {
            bindStackNavigator(appContainer, viewModel.appNavigator)
        }
    }

}