package apptemplate.apptronicnetcore

import apptemplate.apptronicnetcore.common.viewmodel.MainViewModel
import apptemplate.apptronicnetcore.common.viewmodel.mainViewModel
import net.apptronic.core.commons.navigation.navigationRouter
import net.apptronic.core.component.context.Context
import net.apptronic.core.component.context.coreContext
import net.apptronic.core.component.context.dependencyModule
import net.apptronic.core.component.context.terminate
import net.apptronic.core.component.coroutines.testCoroutineDispatchers
import org.junit.After
import org.junit.Before
import org.junit.Test

class MainViewModelTest {

    lateinit var context: Context
    lateinit var mainViewModel: MainViewModel

    @Before
    fun before() {
        context = coreContext(testCoroutineDispatchers()) {
            dependencyModule {
                navigationRouter()
            }
        }
        mainViewModel = context.mainViewModel()
    }

    @Test
    fun verifyStartsWithCorrectPage() {
        assert(mainViewModel.text.get() == "Hello, apptronic.net/core!")
    }

    @After
    fun after() {
        context.terminate()
    }


}