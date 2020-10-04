package apptemplate.apptronicnetcore

import apptemplate.apptronicnetcore.binders.AppViewBinder
import apptemplate.apptronicnetcore.binders.MainViewBinder
import net.apptronic.core.android.viewmodel.viewBinderFactory

// all ViewBinders should be registered here
val AppBinderFactory = viewBinderFactory {
    add(::AppViewBinder)
    add(::MainViewBinder)
}