package tt

import org.grails.plugins.kml.utils.KmlHelper

class BootStrap {

    def init = { servletContext ->
        KmlHelper.parseKml()

    }
    def destroy = {
    }
}
