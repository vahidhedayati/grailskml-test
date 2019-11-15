package tt

import grails.kml.plugin.utils.KmlHelper

class BootStrap {

    def init = { servletContext ->
        KmlHelper.parseKml()

    }
    def destroy = {
    }
}
