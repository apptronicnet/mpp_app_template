package apptemplate.apptronicnetcore.common.viewmodel

import net.apptronic.core.commons.navigation.injectNavigationRouter
import net.apptronic.core.component.context.Contextual
import net.apptronic.core.component.context.viewModelContext
import net.apptronic.core.component.value
import net.apptronic.core.mvvm.viewmodel.ViewModel
import net.apptronic.core.mvvm.viewmodel.ViewModelContext

fun Contextual.mainViewModel() = MainViewModel(viewModelContext())

class MainViewModel(context: ViewModelContext) : ViewModel(context) {

    // sends navigation commands
    private val router = injectNavigationRouter()

    // app first screen model

    val text = value("Hello, apptronic.net/core!")

}