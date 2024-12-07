package vlite.vaadin_router_link

import com.vaadin.flow.component.dependency.JsModule
import com.vaadin.flow.component.icon.IconFactory
import java.util.*

/**
 * --- Loading Resources https://vaadin.com/docs/latest/flow/advanced/loading-resources
 * Table 2. In Spring projects
 *   JavaScript, TypeScript and Lit templates
 *     @JsModule("./src/my-script.js")[1]
 *       /src/main/frontend/src/my-script.js
 *
 * --- Using a Third-Party Icon Set https://vaadin.com/docs/v23/components/icons#using-a-third-party-icon-set
 * --- Icon Set Generator https://vaadin.com/docs/v23/components/icons#icon-set-generator
 *  Place my-icons.js into /src/main/frontend/icons/my-icons.js
 *
 */
@JsModule("./icons/my-icons.js")
enum class MyIcon : IconFactory {
    SHOPPING_CART;

    /**
     * ./icons/my-icons.js
     *  <g id="my-icons:shopping-cart">
     *  SHOPPING_CART -> create() -> shopping-cart
     */
    override fun create() : Icon {
        return Icon(name.lowercase(Locale.ENGLISH).replace('_', '-'));
    }

    /**
     *
     */
    class Icon(icon: String) : com.vaadin.flow.component.icon.Icon("my-icons", icon)

}