package apptemplate.apptronicnetcore.common

import apptemplate.apptronicnetcore.common.viewmodel.appViewModel
import net.apptronic.core.component.context.Context
import net.apptronic.core.component.extensions.BaseComponent
import net.apptronic.core.mvvm.viewmodel.dispatcher.viewModelDispatcher

class AppComponent(context: Context) : BaseComponent(context) {

    // required to provide initializer for root ViewModel
    private val appViewModelDispatcher = viewModelDispatcher {
        appViewModel()
    }

}