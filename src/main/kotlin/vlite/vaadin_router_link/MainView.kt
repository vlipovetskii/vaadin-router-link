package vlite.vaadin_router_link

import com.github.mvysny.karibudsl.v10.span
import com.vaadin.flow.component.orderedlayout.VerticalLayout
import com.vaadin.flow.router.Route

@Suppress("unused")
@Route("/")
class MainView : VerticalLayout() {

    init {
        span("Test")
    }

}