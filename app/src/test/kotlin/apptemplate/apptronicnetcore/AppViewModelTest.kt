package apptemplate.apptronicnetcore

import apptemplate.apptronicnetcore.common.viewmodel.AppViewModel
import apptemplate.apptronicnetcore.common.viewmodel.MainViewModel
import apptemplate.apptronicnetcore.common.viewmodel.appViewModel
import net.apptronic.core.component.context.Context
import net.apptronic.core.component.context.coreContext
import net.apptronic.core.component.context.terminate
import net.apptronic.core.component.coroutines.testCoroutineDispatchers
import org.junit.After
import org.junit.Before
import org.junit.Test

class AppViewModelTest {

    lateinit var context: Context
    lateinit var appViewModel: AppViewModel

    @Before
    fun before() {
        context = coreContext(testCoroutineDispatchers())
        appViewModel = context.appViewModel()
    }

    @Test
    fun verifyStartsWithCorrectPage() {
        assert(appViewModel.appNavigator.get().visibleModel is MainViewModel)
    }

    @After
    fun after() {
        context.terminate()
    }


}