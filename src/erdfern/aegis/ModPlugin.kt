package erdfern.aegis

import com.fs.starfarer.api.BaseModPlugin
import com.fs.starfarer.api.Global
import com.fs.starfarer.api.campaign.PlanetAPI
import com.fs.starfarer.api.campaign.StarSystemAPI
import lunalib.lunaSettings.LunaSettings
import org.apache.log4j.Logger
import org.lazywizard.lazylib.ext.logging.*

import com.fs.starfarer.api.impl.campaign.ids.Tags.THEME_RUINS;

class ModPlugin : BaseModPlugin() {
    @Throws(Exception::class)
    override fun onApplicationLoad() {
        super.onApplicationLoad()

//val system =        Global.getSector().getStarSystem("a");
//val hm =        system.addPlanet("", null, "name", "barren", 100.0f, 0f, 0f, 0f);


        Logger.getLogger("a").i({ LunaSettings.getString("erdfern_aegis", "lunaExampleString").toString() })
        // Test that the .jar is loaded and working, using the most obnoxious way possible.
//        throw RuntimeException("Template mod loaded and working!\nRemove this crash in TemplateModPlugin.")
    }

    override fun onNewGame() {
        super.onNewGame()
        var hm = TAG_RUINS;
        // Add your code here, or delete this method (it does nothing unless you add code)
    } // You can add more methods from ModPlugin here. Press Control-O in IntelliJ to see options.
}
