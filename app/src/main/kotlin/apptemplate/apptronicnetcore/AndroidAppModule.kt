package apptemplate.apptronicnetcore

import android.app.Application
import net.apptronic.core.component.di.declareModule

fun androidAppModule(application: Application) = declareModule {
    // add Android-related dependencies here
}