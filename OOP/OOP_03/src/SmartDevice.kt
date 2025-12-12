 open class SmartDevice(val name: String, val category: String){
    var deviceStatus = "online"
        protected set(value) {
            field = value
        }

     open var deviceType = "unknow"

     open fun turnOn() {
         deviceStatus = "on"
     }

     open fun turnOff() {
         deviceStatus = "off"
     }

}